package com.seele.demo.session;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface ISessionUtil {

     Object getSession (String username, HttpSession session, HttpServletRequest request);
     Boolean invalidateSession (HttpSession session);
     Boolean SessionIsValid(HttpSession session);
}
