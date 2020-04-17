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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../css/style.css">
</head>
<body>
<nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
    <div class="container-fluid">
        <a href="#" class="navbar-branch">
            <img src="../images/logo.png" alt="logo" height="50px">
        </a>
        <button class="navbar-toggler" type="button" data-toggle = "collapse" data-target = "#navbarReponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarReponsive">
            <ul class="navbar-nav ml-auto">
                <button type="button" class="btn  btn-primary">
                    <a href="#" class="nav-link">Đăng nhập</a>
                </button>
                <button type="button" class="btn btn-primary">
                    <a href="#" class="nav-link">Đăng ký</a>
                </button>
            </ul>
        </div>
    </div>
</nav>
<div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item">
            <img class="d-block w-100" src="../images/unnamed.jpg" alt="First slide">
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
            <img class="d-block w-100" src="../images/bia1.png" alt="Second slide">
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
            <img class="d-block w-100" src="../images/bia2.jpg" alt="Third slide">
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
            <img class="d-block w-100" src="../images/catalogue-giay-cao-got1.jpg" alt="Third slide">
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
            <img class="d-block w-100" src="../images/4-2.png" alt="Third slide">
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
                <div class="container col-lg-12 col-md-6">
                    <form class="form-horizontal">
                        <fieldset>

                            <!-- Form Name -->
                            <legend style="text-align: center">PRODUCTS</legend>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_id">PRODUCT ID</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="product_id" name="product_id" placeholder="PRODUCT ID" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_name">PRODUCT NAME</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="product_name" name="product_name" placeholder="PRODUCT NAME" class="form-control input-md" required="" type="text">

                                </div>
                            </div>
                            <!-- Select Basic -->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_categorie">PRODUCT CATEGORY</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <select id="product_categorie" name="product_categorie" class="form-control">
                                    </select>
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="available_quantity">AVAILABLE QUANTITY</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="available_quantity" name="available_quantity" placeholder="AVAILABLE QUANTITY" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_weight">PRODUCT WEIGHT</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="product_weight" name="product_weight" placeholder="PRODUCT WEIGHT" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Textarea -->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_description">PRODUCT DESCRIPTION</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <textarea class="form-control" id="product_description" name="product_description"></textarea>
                                </div>
                            </div>

                            <!-- Textarea -->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="product_name_fr">PRODUCT DESCRIPTION FR</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <textarea class="form-control" id="product_name_fr" name="product_name_fr"></textarea>
                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="percentage_discount">PERCENTAGE DISCOUNT</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="percentage_discount" name="percentage_discount" placeholder="PERCENTAGE DISCOUNT" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="stock_alert">STOCK ALERT</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="stock_alert" name="stock_alert" placeholder="STOCK ALERT" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Search input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="stock_critical">STOCK CRITICAL</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="stock_critical" name="stock_critical" placeholder="STOCK CRITICAL" class="form-control input-md" required="" type="search">

                                </div>
                            </div>

                            <!-- Search input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="tutorial">TUTORIAL</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="tutorial" name="tutorial" placeholder="TUTORIAL" class="form-control input-md" required="" type="search">

                                </div>
                            </div>

                            <!-- Search input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="tutorial_fr">TUTORIAL FR</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="tutorial_fr" name="tutorial_fr" placeholder="TUTORIAL FR" class="form-control input-md" required="" type="search">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="online_date">ONLINE DATE</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="online_date" name="online_date" placeholder="ONLINE DATE" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="author">AUTHOR</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="author" name="author" placeholder="AUTHOR" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="enable_display">ENABLE DISPLAY</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="enable_display" name="enable_display" placeholder="ENABLE DISPLAY" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="comment">COMMENT</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="comment" name="comment" placeholder="COMMENT" class="form-control input-md" required="" type="text">

                                </div>
                            </div>

                            <!-- Text input-->
                            <div class="form-group">
                                <label class="col-lg-12 col-md-6 col-md-4 control-label" for="approuved_by">APPROUVED BY</label>
                                <div class="col-lg-12 col-md-6 col-md-4">
                                    <input id="approuved_by" name="approuved_by" placeholder="APPROUVED BY" class="form-control input-md" required="" type="text">
                                    <!-- File Button -->
                                    <div class="form-group">
                                        <label class="col-lg-12 col-md-6 col-md-4 control-label" for="filebutton">auxiliary_images</label>
                                        <div class="col-lg-12 col-md-6 col-md-4">
                                            <input id="filebutton" name="filebutton" class="input-file" type="file">
                                        </div>
                                    </div>

                                    <!-- Button -->
                                    <div class="form-group">
                                        <label class="col-lg-12 col-md-6 col-md-4 control-label" for="singlebutton">Single Button</label>
                                        <div class="col-lg-12 col-md-6 col-md-4">
                                            <button id="singlebutton" name="singlebutton" class="btn btn-primary">Button</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
                            </div>
            <!-- /.row -->
        </div>
        <!-- /.col-lg-9 -->
    </div>
    <!-- /.row -->
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
