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
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/system")
public class ProductServlet extends HttpServlet {
    private IProduct product = new ProductImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createNewProduct(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "update":
                try {
                    updateProduct(request,response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
//                showCreateForm(request, response);
                break;
            default:
                break;
        }
    }

    private void updateProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String productCode = request.getParameter("productCode");
        String productName = request.getParameter("productName");
        float Discount = Float.parseFloat(request.getParameter("Discount"));
        float Price = Float.parseFloat(request.getParameter("Price"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        String supplier = request.getParameter("supplier");
        String typeCode = request.getParameter("typeCode");
        int amountImport = Integer.parseInt(request.getParameter("amountImport"));
        int AmountExport = Integer.parseInt(request.getParameter("AmountExport"));
        String description = request.getParameter("description");

        Product products = new Product(productCode, productName,
                Discount,Price,amount,supplier,typeCode,amountImport,AmountExport,description);

        this.product.update(productCode,products);
        request.setAttribute("products",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }

    }

    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String productCode = request.getParameter("productCode");
        String productName = request.getParameter("productName");
        float Discount = Float.parseFloat(request.getParameter("Discount"));
        float Price = Float.parseFloat(request.getParameter("Price"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        String supplier = request.getParameter("supplier");
        String typeCode = request.getParameter("typeCode");
        int amountImport = Integer.parseInt(request.getParameter("amountImport"));
        int AmountExport = Integer.parseInt(request.getParameter("AmountExport"));
        String description = request.getParameter("description");

        Product product = new Product(productCode, productName,
                Discount,Price,amount,supplier,typeCode,amountImport,AmountExport,description);

        this.product.save(product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/createNewProduct.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (IOException | ServletException e) {
            e.printStackTrace();
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "update":
                showUpdateForm(request,response);
                break;
            case "register":
                showRegisterForm(request, response);
                break;
            case "nextPage":
                showNextPage(request,response);
                break;
            case "homeAdmin":
                showHomeFormAdmin(request, response);
                break;
            case "delete":
                showUpdateForm(request, response);
                break;
            default:
                showHome(request,response);
                break;
        }
    }

    private void showUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        String productCode = request.getParameter("productCode");
        Product products = this.product.findByProductCode(productCode);
        request.setAttribute("products",products);

        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/update.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showHome(HttpServletRequest request, HttpServletResponse response) {
        findAllProduct(request, response, "view/home/home.jsp");
    }

    private void findAllProduct(HttpServletRequest request, HttpServletResponse response, String s) {
        List<Product> products = this.product.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher = request.getRequestDispatcher(s);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    private void showNextPage(HttpServletRequest request, HttpServletResponse response) {
        findAllProduct(request, response, "view/home/nextPage.jsp");
    }
    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("view/product/createNewProduct.jsp");
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
    private void showHomeFormAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        findAllProduct(request, response, "view/home/themeAdmin.jsp");
    }
}
