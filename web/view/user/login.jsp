
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>shoes.org</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <link href="https://use.fontawesome.com/releases/v5.0.4/css/all.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../../css/forHome/styleHome.css">
    <link rel="stylesheet" href="../../css/user/login.css">
</head>
<body id="LoginForm">
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
    <div class="container-fluid">
        <a href="#" class="navbar-branch">
            <img src="../../images/logo.png" alt="logo" height="50px">
        </a>
        <button class="navbar-toggler" type="button" data-toggle = "collapse" data-target = "#navbarReponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarReponsive">
            <ul class="navbar-nav ml-auto">
                <li><a href="${pageContext.request.contextPath}/system?action=home" class="nav-link">Trang chủ</a></li>
                <li><a href="${pageContext.request.contextPath}/users?action=register" class="nav-link">Đăng ký</a></li>
                  </ul>
        </div>
    </div>
</nav>
<!--container-->
<div class="container-fluid">
    <div class="container">
        <div class="login-form">
            <div class="main-div">
                <div class="panel">
                    <h1>ADMIN LOGIN</h1>
                    <p>Please enter your email and password</p>
                </div>
                <form id="Login" method="post">

                    <div class="form-group">
                        <input type="text" class="form-control" id="inputEmail" placeholder="user Name"
                        name="userName">

                    </div>

                    <div class="form-group">

                        <input type="password" class="form-control" id="inputPassword" placeholder="Password"
                        name="password">
                    </div>
                    <div class="forgot">
                        <a href="reset.html">Forgot password?</a>
                    </div>
                    <button type="submit" class="btn btn-primary">Login</button>
                </form>
            </div>
        </div>
    </div>
</div>
<!-- Footer -->
<footer class="py-5 bg-dark">
    <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
</footer>

<!-- Bootstrap core JavaScript -->
</body>
</html>