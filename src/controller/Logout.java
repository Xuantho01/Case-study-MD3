package controller;

import model.Product;
import service.Interface.IProduct;
import service.ProductImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Logout")
public class Logout extends HttpServlet {
    private IProduct product = new ProductImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            session.removeAttribute("users");
            session.invalidate();

            List<Product> products = this.product.findAll();
            request.setAttribute("products",products);
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/home/home.jsp");
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

}
