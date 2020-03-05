package com.seele.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class sshserverController {
    @Resource(name = "sshServerUtil")
    SshServerUtil sshServerUtil;
    @RequestMapping(value = "/ssh",method = RequestMethod.GET )
    @ResponseBody
    public String execmd(){
        return sshServerUtil.execCmd("wget https://raw.githubusercontent.com/nanqinlang-script/testrace/master/testrace.sh","root","kuaile1250","104.245.190.53",26909);
    }

}
