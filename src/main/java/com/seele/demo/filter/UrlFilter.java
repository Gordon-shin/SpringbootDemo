package com.seele.demo.filter;

import com.seele.demo.session.impl.ISessionUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter(filterName = "urlfileter",urlPatterns = "/books/*")
public class UrlFilter implements Filter {
    @Autowired
    ISessionUtilImpl iSessionUtil;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("==========>过滤器触发");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest)request;
        HttpSession session=req.getSession();

        if(iSessionUtil.SessionIsValid(session)){
            chain.doFilter(request, response);
        }
        else{
            request.getRequestDispatcher("/failed").forward(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
