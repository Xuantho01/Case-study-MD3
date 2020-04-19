package controller;

import model.Product;
import model.User;
import service.Interface.IOder;
import service.Interface.IProduct;
import service.Interface.IUser;
import service.OderImpl;
import service.ProductImpl;
import service.UserImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/oder")
public class OderServlet extends HttpServlet {
    private IOder oder = new OderImpl();
    private IProduct product = new ProductImpl();
    private UserServlet userServlet = new UserServlet();
    private IUser user = new UserImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        vietKey(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "oder":
//                updateOderOfUser(request,response);
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
        String userName = request.getParameter("userName");
        String productCode = request.getParameter("productCode");
//        this.product.findByProductCode(productCode);
        int amount = Integer.parseInt(request.getParameter("amount"));
//        this.user.findByUserName(userName);
        float Discount = Float.parseFloat(request.getParameter("Discount"));
        float Price = Float.parseFloat(request.getParameter("Price"));
        Product product = new Product(productCode,  Price,  Discount,  amount,  userName);
        this.oder.update(product);
        getUserHome(request, response);
    }

    private void getUserHome(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.product.findAll();
        request.setAttribute("products", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/home/homeUser.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
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
            case "updateOder":
                showOderFormAccept(request, response);
                break;
            case "userHome":
                getUserHome(request, response);
                break;
            default:
                break;
        }
    }

    private void showOderForm(HttpServletRequest request, HttpServletResponse response) {
        String productCode = request.getParameter("productCode");
        String userName = request.getParameter("userName");
        Product products = this.product.findByProductCode(productCode);
        User user = this.user.findByUserName(userName);
        request.setAttribute("products", products);
        request.setAttribute("users",user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/oder.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showOderFormAccept(HttpServletRequest request, HttpServletResponse response) {
        String productCode = request.getParameter("productCode");
        String userName = request.getParameter("userName");
        Product products = this.product.findByProductCode(productCode);
        User user = this.user.findByUserName(userName);
        request.setAttribute("products", products);
        request.setAttribute("users",user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/orderForm.jsp");
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
