<%--
  Created by IntelliJ IDEA.
  User: XuanTho
  Date: 4/16/2020
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
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
    <link rel="stylesheet" href="../../css/product/creatNewProduct.css">
    <link rel="stylesheet" href="../../js/createNewProduct.js">
    <link rel="stylesheet" href="../../css/footer/footer.css">

</head>
<body>
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
                <li><a href="${pageContext.request.contextPath}/oder?action=userHome&userName=${users.getUserName()}"
                       class="nav-link">Trang chủ</a></li>
                <li>
                    <div class="dropdown">
                        <a class="btn btn-secondary dropdown-toggle" href="#" role="button" id="dropdownMenuLink"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            ${users.getName()}
                        </a>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/users?action=userInfor&userName=${users.getUserName()}">Thông
                                tin</a>
                            <a class="dropdown-item"
                               href="${pageContext.request.contextPath}/users?action=Bill&userName=${users.getUserName()}">Giỏ hàng</a>
                            <form action="Logout" method="post">
                                <input type="submit" value="Đăng xuất">
                            </form>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container">
    <form class="form-horizontal" role="form" method="post">
        <h2>Registration</h2>
        <div class="form-group">
            <label for="firstName" class="col-sm-3 control-label">Họ tên</label>
            <div class="col-sm-9">
                <input type="text" id="firstName" placeholder="First Name" class="form-control" autofocus name="name"
                value="${requestScope["users"].getName()}">
            </div>
        </div>
        <div class="form-group">
            <label for="lastName" class="col-sm-3 control-label">tên đăng nhập</label>
            <div class="col-sm-9">
                <input type="text" id="lastName" placeholder="Tên đăng nhập" class="form-control" autofocus name="userName"
                value="${requestScope["users"].getUserName()}">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-3 control-label">Email* </label>
            <div class="col-sm-9">
                <input type="email" id="email" placeholder="Email" class="form-control" name= "Email"
                value="${requestScope["users"].getEmail()}">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">Mật Khẩu*</label>
            <div class="col-sm-9">
                <input type="password" id="password" placeholder="Password" class="form-control" name="password"
                value="${requestScope["users"].getPassWord()}">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-3 control-label">Xác nhận mật khẩu*</label>
            <div class="col-sm-9">
                <input type="password" id="passwordConfirm" placeholder="Password" class="form-control"
                       value="${requestScope["users"].getPassWord()}">
            </div>
        </div>
        <div class="form-group">
            <label for="birthDate" class="col-sm-3 control-label">Ngày sinh*</label>
            <div class="col-sm-9">
                <input type="date" id="birthDate" class="form-control" name="birthday"
                value="${requestScope["users"].getBirthday()}">
            </div>
        </div>
        <div class="form-group">
            <label for="phoneNumber" class="col-sm-3 control-label">Số điện thoại </label>
            <div class="col-sm-9">
                <input type="phoneNumber" id="phoneNumber" placeholder="Phone number" class="form-control" name="phoneNumber"
                value="${requestScope["users"].getPhoneNumber()}">
                <span class="help-block">Your phone number won't be disclosed anywhere </span>
            </div>
        </div>
        <div class="form-group">
            <label for="lastName" class="col-sm-3 control-label">Số lượng mua</label>
            <div class="col-sm-9">
                <input type="text" id="Purchases" placeholder="số lượng mua" class="form-control"
                      value="${requestScope["users"].getNumOfPurchases()}" autofocus name="numOfPurchases">
            </div>
        </div>
        <div class="form-group">
            <label for="lastName" class="col-sm-3 control-label">Loại tài khoản</label>
            <div class="col-sm-9">
                <input type="text" id="Role" placeholder="loại tài khoản" class="form-control" autofocus name="Role"
                value="${requestScope["users"].getRole()}" readonly>
            </div>
        </div>
        <div class="form-group">
            <label for="lastName" class="col-sm-3 control-label">Giới tính</label>
            <div class="col-sm-9">
                <input type="text" id="sex" placeholder="giới tính" class="form-control" autofocus name="sex"
                       value="${requestScope["users"].getSex()}">
            </div>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Cập nhật thông tin</button>
    </form> <!-- /form -->
</div> <!-- ./container -->
<div class="footer-bottom-area bg-dark-light section-padding-sm">
    <div class="container">
        <div class="row widgets footer-widgets">

            <div class="col-lg-3 col-md-6 col-12">
                <div class="single-widget widget-about">
                    <h5 class="widget-title">About Us</h5>

                    <p>We are a team of designers and developers that create high quality <a href="www.dkstudio.in">Readmore...</a></p>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-12">
                <div class="single-widget widget-quick-links">
                    <h5 class="widget-title">My Account</h5>
                    <ul>
                        <li><a href="#">Sitemap</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Your Account</a></li>
                        <li><a href="#">Advanced Search</a></li>
                        <li><a href="#">Contact Us</a></li>
                    </ul>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-12">
                <div class="single-widget widget-quick-links">
                    <h5 class="widget-title">Customer Service</h5>
                    <ul>
                        <li><a href="#">Shipping Policy</a></li>
                        <li><a href="#">Compensation First</a></li>
                        <li><a href="#">My Account</a></li>
                        <li><a href="#">Return Policy</a></li>
                        <li><a href="#">Contact Us</a></li>
                    </ul>
                </div>
            </div>

            <div class="col-lg-3 col-md-6 col-12">
                <div class="single-widget widget-contact">
                    <h5 class="widget-title">Contact Us</h5>
                    <ul>
                        <li class="address">
                            <span class="icon"><i class="fa fa-map-marker"></i></span>
                            <p>Address : Quỳnh Lưu - Nghệ An</p>
                        </li>
                        <li class="phone">
                            <span class="icon"><i class="fa fa-phone"></i></span>
                            <p><a href="#">+91 7568 54 3012</a></p>
                        </li>
                        <li class="fax">
                            <span class="icon"><i class="fa fa-fax"></i></span>
                            <p><a href="#">+91 7568 54 3012</a></p>
                        </li>
                        <li class="email">
                            <span class="icon"><i class="fa fa-envelope-o"></i></span>
                            <p><a href="#">hoxantho95@gmail.com</a></p>
                        </li>
                    </ul>
                </div>
            </div>

        </div>
    </div>
</div>

</body>
</html>




