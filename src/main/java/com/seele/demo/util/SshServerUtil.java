package com.seele.demo.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import  com.jcraft.jsch.*;
import org.springframework.stereotype.Component;
import  org.apache.commons.io.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
@Component(value = "sshServerUtil")
public class SshServerUtil {
    private static final Logger lg = LoggerFactory.getLogger(SshServerUtil.class);
    private static Session session;


    //连接服务其
    private static void connect(String username,String passwd,String host,int port){
       try{
           JSch jsch = new JSch();
           session = jsch.getSession(username,host,port);

           session.setPassword(passwd);
            session.setConfig("StrictHostKeyChecking", "no");
           session.connect(60 * 1000);
           if (session.isConnected()){

               lg.info("Server connection successful");
           }
           else {
               lg.info("Server is not Connected!");
           }
       }
       catch (JSchException e){
           e.printStackTrace();;
       }
    }

    public   String execCmd(String command,String username,String passwd,String host,int port){
        String resultJson = null;
        ChannelExec channelExec = null;
        if (command!=null){
            try{
                connect(username,passwd,host,port);
                channelExec = (ChannelExec)session.openChannel("exec");
                lg.info("linux command:"+command);
                InputStream in = channelExec.getInputStream();
                channelExec.setCommand(command);
                channelExec.setErrStream(System.err);
                channelExec.connect();
                resultJson = IOUtils.toString(in,"UTF-8");
                closeSession();
            } catch (JSchException | IOException e) {
                e.printStackTrace();
            }
        }
        return resultJson;
    }
    private static String getServerData(String host, int port, String username,
                                        String password, String filePath) {

        ChannelSftp sftp = null;
        StringBuffer buffer = new StringBuffer();
        try {

            if (!session.isConnected()) {
                connect(username, password, host, port);
            }

            //获取sftp通道
            Channel channel = session.openChannel("sftp");
            //开启
            channel.connect();
            sftp = (ChannelSftp) channel;
            lg.info("Connected to " + host + ".");
            //获取生成文件流
            InputStream inputStream = sftp.get(filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while ((line = in.readLine()) != null) {
                buffer.append(line);
            }
            //关闭流
            inputStream.close();
            in.close();

            lg.info(" 执行结果为: " + buffer.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSchException e) {
            e.printStackTrace();
        } catch (SftpException e) {
            e.printStackTrace();
        } finally {
            if (null != sftp) {
                sftp.quit();
            }
            closeSession();
        }
        return buffer.toString();
    }
    public static void closeSession() {
        if (session != null) {
            session.disconnect();
        }

    }

}
