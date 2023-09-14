package org.example;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
@javax.servlet.annotation.WebFilter(urlPatterns = "/a2")
public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        Cookie[] cookies = req.getCookies();
        if (cookies != null){

            chain.doFilter(request, response);
        } else {
            req.getRequestDispatcher("/a1").forward(request, response);
        }

    }

    @Override
    public void destroy() {

    }
}
