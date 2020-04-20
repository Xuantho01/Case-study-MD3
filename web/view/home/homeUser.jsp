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
    <link rel="stylesheet" href="../../css/forHome/styleHomeAdmin.css">
    <link rel="stylesheet" href="../../css/forHome/styleHome.css">
    <link rel="stylesheet" href="../../css/footer/footer.css">
</head>
<body>
<%--<% if (request.getAttribute("users")==null){--%>
<%--    response.sendRedirect("view/user/login.jsp");--%>
<%--}%>--%>
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
                <%--            need to fix--%>
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
<%--                            add new--%>
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
<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item">
            <img class="d-block w-100" src="../../images/unnamed.jpg" alt="First slide">
            <div class="carousel-caption">
                <h1>GIÀY CHẤT</h1>
                <h3>NÂNG TẦM CUỘC SỐNG</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW TUTORIALS
                </button>
                <button type="button" class="btn btn-primary btn-lg">
                    Get started
                </button>
            </div>
        </div>
        <div class="carousel-item active">
            <img class="d-block w-100" src="../../images/bia1.png" alt="Second slide">
            <div class="carousel-caption">
                <h1>GIÀY CHẤT</h1>
                <h3>NÂNG TẦM CUỘC SỐNG</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW TUTORIALS
                </button>
                <button type="button" class="btn btn-primary btn-lg">
                    Get started
                </button>
            </div>
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="../../images/bia2.jpg" alt="Third slide">
            <div class="carousel-caption">
                <h1>GIÀY CHẤT</h1>
                <h3>NÂNG TẦM CUỘC SỐNG</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW TUTORIALS
                </button>
                <button type="button" class="btn btn-primary btn-lg">
                    Get started
                </button>
            </div>
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="../../images/catalogue-giay-cao-got1.jpg" alt="Third slide">
            <div class="carousel-caption">
                <h1>GIÀY CHẤT</h1>
                <h3>NÂNG TẦM CUỘC SỐNG</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW TUTORIALS
                </button>
                <button type="button" class="btn btn-primary btn-lg">
                    Get started
                </button>
            </div>
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="../../images/4-2.png" alt="Third slide">
            <div class="carousel-caption">
                <h1>GIÀY CHẤT</h1>
                <h3>NÂNG TẦM CUỘC SỐNG</h3>
                <button type="button" class="btn btn-outline-light btn-lg">
                    VIEW TUTORIALS
                </button>
                <button type="button" class="btn btn-primary btn-lg">
                    Get started
                </button>
            </div>
        </div>

    </div>
    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<div class="container-fluid" style="height: 10px; border-bottom: 1px solid #EAEDED;"></div>
<div class="container-fluid padding">
    <div class="row welcome text-center">
        <div class="col-12">
            <h1 class="display-4 center">Shopping ngay nào</h1>
        </div>
    </div>
</div>
<div class="container-fluid" style="height: 10px; border-top: 1px solid #EAEDED;">
</div>
<!--container-->
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-3" style="position: relative">
            <div>
                <ul class="hangmuc">
                    <li><h1>Danh mục</h1></li>
                    <li><a href="#" class="list-group-item">Giày nam</a></li>
                    <li><a href="#" class="list-group-item">Giày nữ</a></li>
                    <!--                        <li><a href="#" class="list-group-item">Giày thể thao</a></li>-->
                </ul>
            </div>
            <div>
                <ul class="hangmuc">
                    <li><h1>Kiểu mẫu</h1></li>
                    <li><a href="#" class="list-group-item">Thể thao</a></li>
                    <li><a href="#" class="list-group-item">Lịch lãm</a></li>
                </ul>
            </div>
            <div>
                <ul class="hangmuc">
                    <li><h1>Nhãn hiệu</h1></li>
                    <li><a href="#" class="list-group-item">ADIDAS</a></li>
                    <li><a href="#" class="list-group-item">ASICS TIGER</a></li>
                    <li><a href="#" class="list-group-item">BALANCE</a></li>
                    <li><a href="#" class="list-group-item">Converse</a></li>
                    <li><a href="#" class="list-group-item">NIKE</a></li>
                </ul>
            </div>
        </div>
        <!-- /.col-lg-3 -->
        <div class="col-lg-9">
            <div class="row">
                <c:forEach items='${requestScope["products"]}' var="product" begin="0" end="3">
                    <div class="col-lg-3 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="${product.getImage()}"></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">${product.getProductName()}</a>
                                </h4>
                                <h5>$${product.getPrice()}</h5>
                                <h5>${product.getDiscount()}%</h5>
                                    <%--                            <p class="card-text">${product.getDescription()}</p>--%>
                            </div>
                            <div>
                                <button class="btn btn-primary"><a href="/system?action=detail&productCode=${product.getProductCode()}&userName=${users.getUserName()}">chi tiết sản phẩm</a></button>
                                <button class="btn btn-primary"><a href="/oder?action=oder&productCode=${product.getProductCode()}&userName=${users.getUserName()}">Mua ngay</a></button>

                            </div>
                        </div>
                    </div>
                </c:forEach>
                <div class="col-12" id="newArrival">Mua sắm thả ga, giá rẻ bất ngờ</div>
                <c:forEach items='${requestScope["products"]}' var="product" begin="4" end="7">
                    <div class="col-lg-3 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="#"><img class="card-img-top" src="${product.getImage()}"></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="#">${product.getProductName()}</a>
                                </h4>
                                <h5>$${product.getPrice()}</h5>
                                <h5>${product.getDiscount()}%</h5>
                                    <%--                            <p class="card-text">${product.getDescription()}</p>--%>
                            </div>
                            <div>
                                <button class="btn btn-primary"><a href="/system?action=detail&productCode=${product.getProductCode()}&userName=${users.getUserName()}">chi tiết sản phẩm</a></button>
                                <button class="btn btn-primary"><a href="/oder?action=oder&productCode=${product.getProductCode()}&userName=${users.getUserName()}">Mua ngay</a></button>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.col-lg-9 -->
    </div>
    <!-- /.row -->
</div>
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/system?action=home">1</a></li>
        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/system?action=nextPage">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>

<!-- Footer -->
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

<!-- Bootstrap core JavaScript -->
</body>
</html>
