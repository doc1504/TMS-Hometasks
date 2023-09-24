package org.example;

import org.example.domain.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/search")
public class SearchServlet  extends HttpServlet {
    private final DataBase dataBase = new DataBase();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model = req.getParameter("model");

        List<Phone> phones = dataBase.getByModel(model);

        req.setAttribute("phones", phones);

        req.getRequestDispatcher("/home.jsp").forward(req, resp);
    }
}
