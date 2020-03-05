package com.seele.demo.session.impl;

import com.alibaba.fastjson.JSONObject;
import com.seele.demo.session.ISessionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Component(value = "ISessionUtilImpl")

public class ISessionUtilImpl implements ISessionUtil {
    private static final Logger LOG = LoggerFactory.getLogger(ISessionUtilImpl.class);
    @Override
    public Object getSession(String username, HttpSession session, HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies!=null && cookies.length>0){
            for (Cookie cookie:
                    cookies) {
                if (cookie.getName().contains("JSESSION")){
                    System.out.println(cookie.getName() + "=" + cookie.getValue());
                }
            }
        }

        Object sessionvalue = session.getAttribute("username");
        if (sessionvalue == null){
            System.out.println("用户不存在");
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("username",username);
            jsonObject.put("age",28);
            session.setAttribute("username",jsonObject.toJSONString());
        }
        else {
            System.out.println( session.getAttribute("username").toString());
        }
        return  username + sessionvalue;
    }

    @Override
    public Boolean invalidateSession(HttpSession session) {
        if (SessionIsValid(session)){
            session.invalidate();

            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Boolean SessionIsValid(HttpSession session) {

        Boolean a =( null ==session.getAttribute("username"));
        if (a){
            LOG.error("session 无效");
            return false;
        }
        else{
          String username2 =  session.getAttribute("username").toString();
          LOG.info("用户"+username2+"注销成功！");
            return true;
        }
    }
}
