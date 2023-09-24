package org.example;

import org.example.domain.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/add")
public class AddServlet extends HttpServlet {
    private final DataBase dataBase = new DataBase();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String model = req.getParameter("model");
        String color = req.getParameter("color");
        Integer price = Integer.parseInt(req.getParameter("price"));

        Phone phone = new Phone();
        phone.setModel(model);
        phone.setColor(color);
        phone.setPrice(price);
        dataBase.create(phone);

        req.getRequestDispatcher("/home").forward(req, resp);
    }
}
