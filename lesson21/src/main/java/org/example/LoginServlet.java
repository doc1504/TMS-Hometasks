package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String code = req.getParameter("code");
        String additional = req.getParameter("additional");
        String secret = req.getParameter("secret");

        resp.getWriter().println("Username:" + username +
        "\n Code:" + code + "\n Additional information: " + additional +
        "\n Secret: " + secret);

    }
}
