package controller;

import model.Product;
import model.User;
import service.Interface.IProduct;
import service.Interface.IUser;
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
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/users")
public class UserServlet extends HttpServlet {
    private IUser user = new UserImpl();
    private IProduct product = new ProductImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        vietKey(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "register":
                try {
                    registerUser(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "login":
                login(request, response);
                break;
            case "updateUser":
                break;
            case "deleteUser":
                break;
            default:
                break;
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        List<User> userList = this.user.findAll();
        User user = null;
        int count = 0;
        RequestDispatcher dispatcher;
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUserName().equals(userName) && userList.get(i).getPassWord().equals(password)) {
                count += 1;
                user = this.user.findByUserName(userName);
            }
        }
        if (count != 0) {
            List<Product> products = this.product.findAll();
            request.setAttribute("products", products);
            request.setAttribute("users", user);
            dispatcher = request.getRequestDispatcher("view/home/themeAdmin.jsp");
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            }
        } else {
            try {
                dispatcher = request.getRequestDispatcher("view/home/home.jsp");
                dispatcher.forward(request,response);
            } catch (ServletException | IOException e) {
                e.printStackTrace();
            }
        }
        count = 0;
    }

    private void registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        int phoneNumber = Integer.parseInt(request.getParameter("phoneNumber"));
        String Email = request.getParameter("Email");
        Date birthday = Date.valueOf(request.getParameter("birthday"));
        String address = request.getParameter("address");
        int numOfPurchases = Integer.parseInt(request.getParameter("numOfPurchases"));
        String Role = request.getParameter("Role");
        User user = new User(userName, password, name, sex, phoneNumber,
                Email, birthday, address, numOfPurchases, Role);
        this.user.save(user);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/register.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        vietKey(request, response);
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "register":
                showRegisterForm(request, response);
                break;
            case "updateUser":
                showUpdateUserForm(request, response);
                break;
            case "deleteUser":
                break;
            case "login":
                showLogin(request, response);
                break;
            case "adminHome":
                break;
            default:
                break;
        }
    }

    private void showLogin(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/login.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showUpdateUserForm(HttpServletRequest request, HttpServletResponse response) {
        String userName = request.getParameter("userName");
        User users = this.user.findByUserName(userName);
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/updateUser.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showRegisterForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/user/register.jsp");
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
