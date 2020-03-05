package com.seele.demo.session;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.seele.demo.session.impl.ISessionUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @Autowired
    ISessionUtilImpl iSessionUtil;

    @RequestMapping(value = "/session",method = RequestMethod.GET)
    public Object springSession(@RequestParam("username") String username, HttpServletRequest request, HttpSession session){
      return  iSessionUtil.getSession(username, session, request);
    }
    @RequestMapping(value = "/session/expire",method = RequestMethod.GET)
    public Boolean springSessionExpire(HttpSession session){
        return iSessionUtil.invalidateSession(session);
    }
}
