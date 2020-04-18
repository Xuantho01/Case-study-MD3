package controller;

import model.Product;
import service.Interface.IOder;
import service.Interface.IProduct;
import service.OderImpl;
import service.ProductImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/oder")
public class OderServlet extends HttpServlet {
    private IOder oder = new OderImpl();
    private IProduct product = new ProductImpl();
    private UserServlet userServlet = new UserServlet();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        vietKey(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "oder":
                userServlet.checkLogin(request, response);
                break;
            case "updateOder":
                try {
                    updateOderOfUser(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "deleteUser":
                break;
            default:
                break;
        }
    }

    private void updateOderOfUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String oderCode = request.getParameter("oderCode");
        String userName = request.getParameter("userName");
        String productCode = request.getParameter("productCode");
        int amount = Integer.parseInt(request.getParameter("Price"));
        float Discount = Float.parseFloat(request.getParameter("Discount"));
        float Price = Float.parseFloat(request.getParameter("Price"));

        Product product = new Product(productCode,  Price,  Discount,  amount,  oderCode,  userName);
        this.oder.update(product);
        showOderForm(request, response);
    }

    private void oderProduct(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (userServlet.isLogin()) {
            showOderForm(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/login.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        vietKey(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "oder":
                oderProduct(request, response);
                break;
//            case "updateOder":
//                break;
            case "deleteUser":
                break;
            case "login":
                break;
            case "adminHome":
                break;
            default:
                break;
        }
    }

    private void showOderForm(HttpServletRequest request, HttpServletResponse response) {
        String productCode = request.getParameter("productCode");
        Product products = this.product.findByProductCode(productCode);
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/oder.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }


    private void vietKey(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
    }
}
