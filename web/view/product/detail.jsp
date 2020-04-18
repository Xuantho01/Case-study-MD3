<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="../../css/product/detail.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Product Detail</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
    <div class="container-fluid">
        <a href="#" class="navbar-branch">
            <img src="../../images/logo.png" alt="logo" height="50px">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarReponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarReponsive">
            <ul class="navbar-nav ml-auto">
                <li><a href="${pageContext.request.contextPath}/system?action=home" class="nav-link">Trang chủ</a></li>
                <li><a href="${pageContext.request.contextPath}/system?action=create" class="nav-link">Tạo mới</a></li>
                <li><a href="${pageContext.request.contextPath}/system?action=update" class="nav-link">Cập nhật</a></li>
                <li><a href="${pageContext.request.contextPath}/users?action=register" class="nav-link">Đăng ký</a></li>
                <li><a href="${pageContext.request.contextPath}/users?action=login" class="nav-link">Đăng nhập</a></li>
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
            <div class="card">
                <div class="container-fluid">
                    <div class="wrapper row">

                            <div class="preview col-md-6">
                                <div class="preview-pic tab-content">
                                    <div class="tab-pane active" id="pic-1"><img src="${products.getImage()}"/>
                                    </div>
                                    <div class="tab-pane" id="pic-2"><img src="http://placekitten.com/400/252"/></div>
                                    <div class="tab-pane" id="pic-3"><img src="http://placekitten.com/400/252"/></div>
                                    <div class="tab-pane" id="pic-4"><img src="http://placekitten.com/400/252"/></div>
                                    <div class="tab-pane" id="pic-5"><img src="http://placekitten.com/400/252"/></div>
                                </div>
                                <ul class="preview-thumbnail nav nav-tabs">
                                    <li class="active"><a data-target="#pic-1" data-toggle="tab"><img
                                            src="http://placekitten.com/200/126"/></a></li>
                                    <li><a data-target="#pic-2" data-toggle="tab"><img
                                            src="http://placekitten.com/200/126"/></a></li>
                                    <li><a data-target="#pic-3" data-toggle="tab"><img
                                            src="http://placekitten.com/200/126"/></a></li>
                                    <li><a data-target="#pic-4" data-toggle="tab"><img
                                            src="http://placekitten.com/200/126"/></a></li>
                                    <li><a data-target="#pic-5" data-toggle="tab"><img
                                            src="http://placekitten.com/200/126"/></a></li>
                                </ul>
                            </div>
                            <div class="details col-md-6">

                                <h3 class="product-title">${products.getProductName()}</h3>
                                <div class="rating">
                                    <div class="stars">
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star checked"></span>
                                        <span class="fa fa-star"></span>
                                        <span class="fa fa-star"></span>
                                    </div>
                                    <span class="review-no">41 reviews</span>
                                </div>
                                <p class="product-description">${products.getImage()}</p>
                                <h4 class="price">current price: <span>${products.getPrice()}</span></h4>
                                <h4 class="price">Giảm giá: <span>${products.getDiscount()}</span></h4>
                                <p class="vote"><strong>91%</strong> of buyers enjoyed this product! <strong>(87
                                    votes)</strong></p>
                                <h5 class="sizes">sizes:
                                    <span class="size" data-toggle="tooltip" title="small">35</span>
                                    <span class="size" data-toggle="tooltip" title="medium">36</span>
                                    <span class="size" data-toggle="tooltip" title="large">37</span>
                                    <span class="size" data-toggle="tooltip" title="xtra large">38</span>
                                </h5>
                                <h5 class="colors">colors:
                                    <span class="color orange not-available" data-toggle="tooltip"
                                          title="Not In store"></span>
                                    <span class="color green"></span>
                                    <span class="color blue"></span>
                                </h5>
                                <div class="action">
                                    <button class="add-to-cart btn btn-default" type="button">
                                        <a href="/oder?action=oder&productCode=${products.getProductCode()}">Mua ngay</a>
                                    </button>
                                    <button class="like btn btn-default" type="button"><span class="fa fa-heart"></span>
                                    </button>
                                </div>
                            </div>

                    </div>
                    </div>
            </div>
        </div>
        <!-- /.row -->
    </div>
    <!-- /.col-lg-9 -->
</div>
<!-- /.row -->
<nav aria-label="Page navigation example">
    <ul class="pagination justify-content-center">
        <li class="page-item disabled">
            <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
        </li>
        <li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/system?action=home">1</a>
        </li>
        <li class="page-item"><a class="page-link"
                                 href="${pageContext.request.contextPath}/system?action=nextPage">2</a></li>
        <li class="page-item"><a class="page-link" href="#">3</a></li>
        <li class="page-item">
            <a class="page-link" href="#">Next</a>
        </li>
    </ul>
</nav>

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
