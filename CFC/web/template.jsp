<%-- 
Document   : template
Created on : 22/09/2018, 20:15:10
Author     : Hamil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
<!--    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">-->

    <title>CFC DRIVE</title>

    <!-- Bootstrap core CSS -->
    <!--<link href="layout/assets/css/bootstrap.css" rel="stylesheet">-->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!--external css-->
    <!--<link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>-->
    <link href="fonts/font-awesome/css/font-awesome.min.css" rel="stylesheet"/>
    <!-- FlexSlider -->
    <link href="scripts/FlexSlider/flexslider.css" rel="stylesheet"/>
    <!-- Nivo Lightbox -->
    <link href="scripts/Nivo-Lightbox/nivo-lightbox.css" rel="stylesheet"/>
    <link href="scripts/Nivo-Lightbox/themes/default/default.css" rel="stylesheet"/>
    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">
    <!--<link href="layout/assets/css/style-responsive.css" rel="stylesheet">-->


    <!-- Favicons -->
            <!-- Generated using http://realfavicongenerator.net/ -->
            <link rel="apple-touch-icon" sizes="57x57" href="favicons/apple-touch-icon-57x57.png">
            <link rel="apple-touch-icon" sizes="60x60" href="favicons/apple-touch-icon-60x60.png">
            <link rel="apple-touch-icon" sizes="72x72" href="favicons/apple-touch-icon-72x72.png">
            <link rel="apple-touch-icon" sizes="76x76" href="favicons/apple-touch-icon-76x76.png">
            <link rel="apple-touch-icon" sizes="114x114" href="favicons/apple-touch-icon-114x114.png">
            <link rel="apple-touch-icon" sizes="120x120" href="favicons/apple-touch-icon-120x120.png">
            <link rel="apple-touch-icon" sizes="144x144" href="favicons/apple-touch-icon-144x144.png">
            <link rel="apple-touch-icon" sizes="152x152" href="favicons/apple-touch-icon-152x152.png">
            <link rel="apple-touch-icon" sizes="180x180" href="favicons/apple-touch-icon-180x180.png">
            <link rel="icon" type="image/png" href="favicons/favicon-32x32.png" sizes="32x32">
            <link rel="icon" type="image/png" href="favicons/favicon-194x194.png" sizes="194x194">
            <link rel="icon" type="image/png" href="favicons/favicon-96x96.png" sizes="96x96">
            <link rel="icon" type="image/png" href="favicons/android-chrome-192x192.png" sizes="192x192">
            <link rel="icon" type="image/png" href="favicons/favicon-16x16.png" sizes="16x16">
            <link rel="manifest" href="favicons/manifest.json">
            <link rel="shortcut icon" href="favicons/favicon.ico">
            <meta name="msapplication-TileColor" content="#ffffff">
            <meta name="msapplication-TileImage" content="favicons/mstile-144x144.png">
            <meta name="msapplication-config" content="favicons/browserconfig.xml">
            <meta name="theme-color" content="#ffffff">


<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body>

<!-- Header -->
<header class="header">
        <div class="top clearfix">
                <div class="container">
                        <nav class="top-nav">
                                <ul>
                                        <li><a href="index.html">Home</a></li>
                                        <li><a href="about-us.html">Sobre</a></li>
                                        <li><a href="services.html">Serviços</a></li>
                                        <li><a href="contact-page.html">Contato</a></li>
                                </ul>
                        </nav> <!-- end .top-nav -->
                        <div class="social-icons yellow">
                                <span class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></span>
                                <span class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></span>
                                <span class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></span>
                                <span class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></span>   
                                
    <!----------------------------------- Botão Logar --------------------------------------------------->                            
                                
                                <c:if test="${sessionScope.user == null}"><!-- Botão logar  -->
                                    <div class="sub-menu">
                                        <a href="control?ac=login">
                                            <i class="fa fa-dashboard"></i>
                                            <span>Login</span>
                                        </a>
                                    </div>
                                 </c:if>
                        </div> <!-- end .social-icons -->                       
                       
                </div> <!-- end .container -->
        </div> <!-- end .top -->
        
        <div class="container clearfix">
                <div class="logo"><a href="template.jsp"><img src="images/logo.png" alt="CFC DRIVE"></a></div>
                <div class="header-contacts">
                        <div class="header-contact">
                                <div class="small-round-icon"><i class="fa fa-map-marker"></i></div>
                                Local em Matias, Minas Gerais
                        </div>  <!-- end .header-contact -->
                        <div class="header-contact">
                                <div class="small-round-icon"><i class="fa fa-envelope"></i></div>
                                CFCDRIVE@cfcdrive.com.br
                        </div>  <!-- end .header-contact -->
                        <div class="header-contact">
                                <div class="small-round-icon"><i class="fa fa-phone"></i></div>
                                +32 3273-0000
                        </div>  <!-- end .header-contact -->
                </div> <!-- end .header-contacts -->
                <a href="" class="responsive-menu-open">Menu <i class="fa fa-bars"></i></a>
        </div> <!-- end .container -->
        <div class="main-header clearfix">
                <div class="container">
                        <nav class="main-nav">
                                <ul class="list-unstyled">
                                        <li class="active">
                                                <a href="index.html">Home</a>
                                                <ul>
                                                        <li class="active"><a href="index.html">Homepage 01</a></li>
                                                        <li><a href="homepage-02.html">Homepage 02</a></li>
                                                </ul>
                                        </li>
                                        <li><a href="about-us.html">Sobre</a></li>
                                        <li><a href="services.html">Serviços</a></li>
                                        <li><a href="instructors.html">Intrutores</a></li>
                                        <li>
                                                <a href="blog.html">Blog</a>
                                                <ul>
                                                        <li><a href="blog.html">Blog</a></li>
                                                        <li><a href="single-page.html">Single Page</a></li>
                                                </ul>
                                        </li>
                                        <li><a href="contact-page.html">Contact</a></li>
                                </ul>
                        </nav> <!-- end .main-nav -->
                        <form class="header-search-form">
                                <input type="search" id="header-search" name="search" placeholder="Search Here">
                                <button type="submit"><i class="fa fa-search"></i></button>
                        </form> <!-- end .search-form -->
                </div> <!-- end .container -->
        </div> <!-- end .main-header -->
</header> <!-- end .header -->
<div class="responsive-menu">
        <a href="" class="responsive-menu-close">Close <i class="fa fa-times"></i></a>
        <nav class="responsive-nav"></nav> <!-- end .responsive-nav -->
        <form class="search-form">
                <input type="search" id="responsive-menu-search" name="search" placeholder="Search Here">
                <button type="submit"><i class="fa fa-search"></i></button>
        </form> <!-- end .search-form -->
</div> <!-- end .responsive-menu -->

<!-- Home Slider -->
<div id="homeslider" class="flexslider homeslider">
        <div class="slides">
                <div style="background-image: url('images/slider04.jpg');">
                        <div class="caption blue">
                                <h4>Learn Safe and Get Your License</h4>
                                <p>DrivePro is the best driving school. We have very well trained instructors.</p>
                                <p><a href="">Find Out More <i class="fa fa-angle-double-right"></i></a></p>
                        </div> <!-- end .caption -->
                </div>
<!--                <div style="background-image: url('images/slider01.jpg');">
                        <div class="caption blue">
                                <h4>Lorem ipsum Esse magna et id nulla sint ad commodo ex in quis dolore</h4>
                                <p>Lorem ipsum Enim officia mollit mollit et cillum esse.</p>
                                <p><a href="">Find Out More <i class="fa fa-angle-double-right"></i></a></p>
                        </div>  end .caption 
                </div>
                <div style="background-image: url('images/slider02.jpg');">
                        <div class="caption blue">
                                <h4>Lorem ipsum Dolore ut</h4>
                                <p>Lorem ipsum Veniam voluptate irure laborum dolore minim deserunt mollit sed laboris.</p>
                                <p><a href="">Find Out More <i class="fa fa-angle-double-right"></i></a></p>
                        </div>  end .caption 
                </div>
                <div style="background-image: url('images/slider03.jpg');">
                        <div class="caption blue">
                                <h4>Lorem ipsum Do laborum labore</h4>
                                <p>Lorem ipsum Anim id fugiat magna sed enim ullamco incididunt occaecat veniam in ea.</p>
                                <p><a href="">Find Out More <i class="fa fa-angle-double-right"></i></a></p>
                        </div>  end .caption 
                </div>-->
        </div> <!-- end .slides -->
</div> <!-- end homeslider -->

<section class="section white">
        <div class="inner">
                <div class="container">

                        <!-- Services -->
                        <div class="heading text-center">
                                <h3>Some Awesome Features</h3>
                                <hr class="line" />
                                <span>Our Driving School Provide Some Unique Features For Our Leaners</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-bullhorn"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Best Safety Measures</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-users"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Experienced Instructors</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-clock-o"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Perfect Timing</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                        </div> <!-- end .row -->
                        <div class="row">
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-money"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Affordable Fee</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-play-circle-o"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Video Classes</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="services">
                                                <div class="icon">
                                                        <div class="inner"><i class="fa fa-credit-card"></i></div>
                                                </div> <!-- end .icon -->
                                                <div class="content">
                                                        <h5>Quick License</h5>
                                                        <p>Lorem ipsum Sunt cupidatat reprehenderit cillum reprehenderit incididunt consequat aute et proident tempor occaecat.</p>
                                                        <p><a href="">Read More <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .content -->
                                        </div> <!-- end .services -->
                                </div> <!-- end .col-sm-4 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<section class="section blue">
        <div class="inner">
                <div class="container">

                        <!-- Instructors -->
                        <div class="heading text-center">
                                <h3>Our Instrucotrs & Testers</h3>
                                <hr class="line" />
                                <span>Top Instructors From Californina</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-3">
                                        <div class="instructor">
                                                <div class="image">
                                                        <div class="inner">
                                                                <img src="images/instructor01.jpg" alt="alt text" class="img-responsive">
                                                        </div> <!-- end .inner -->
                                                </div> <!-- end .image -->
                                                <div class="bio">
                                                        <h5>Jason Lin</h5>
                                                        <span>Instructor</span>
                                                </div> <!-- end .bio -->
                                                <div class="social-icons blue">
                                                        <div class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></div>
                                                </div> <!-- end .social-icons -->
                                        </div> <!-- end .instructor -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="instructor">
                                                <div class="image">
                                                        <div class="inner">
                                                                <img src="images/instructor02.jpg" alt="alt text" class="img-responsive">
                                                        </div> <!-- end .inner -->
                                                </div> <!-- end .image -->
                                                <div class="bio">
                                                        <h5>Wilson Jim</h5>
                                                        <span>Instructor</span>
                                                </div> <!-- end .bio -->
                                                <div class="social-icons blue">
                                                        <div class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></div>
                                                </div> <!-- end .social-icons -->
                                        </div> <!-- end .instructor -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="instructor">
                                                <div class="image">
                                                        <div class="inner">
                                                                <img src="images/instructor03.jpg" alt="alt text" class="img-responsive">
                                                        </div> <!-- end .inner -->
                                                </div> <!-- end .image -->
                                                <div class="bio">
                                                        <h5>Eva Brown</h5>
                                                        <span>Tester</span>
                                                </div> <!-- end .bio -->
                                                <div class="social-icons blue">
                                                        <div class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></div>
                                                </div> <!-- end .social-icons -->
                                        </div> <!-- end .instructor -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="instructor">
                                                <div class="image">
                                                        <div class="inner">
                                                                <img src="images/instructor04.jpg" alt="alt text" class="img-responsive">
                                                        </div> <!-- end .inner -->
                                                </div> <!-- end .image -->
                                                <div class="bio">
                                                        <h5>Martin Gil</h5>
                                                        <span>Instructor</span>
                                                </div> <!-- end .bio -->
                                                <div class="social-icons blue">
                                                        <div class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></div>
                                                        <div class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></div>
                                                </div> <!-- end .social-icons -->
                                        </div> <!-- end .instructor -->
                                </div> <!-- end .col-sm-3 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<section class="section white">
        <div class="inner">
                <div class="container">

                        <!-- Instructors -->
                        <div class="heading text-center">
                                <h3>Courses We Offer</h3>
                                <hr class="line" />
                                <span>Our Driving School Provide Best Courses For Our Learners</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-3">
                                        <div class="course">
                                                <div class="course-icon">
                                                        <div class="inner"><div class="inner"><i class="fa fa-male"></i></div></div> <!-- end .inner -->
                                                </div> <!-- end .course-icon -->
                                                <h5>Teen Courses</h5>
                                                <div class="course-info">
                                                        <h5>Teen Courses</h5>
                                                        <p>Lorem ipsum In aute occaecat Ut commodo id. Lorem ipsum Cillum cillum esse labore irure mollit tempor culpa.</p>
                                                        <p><a href="">Apply Now <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .course-info -->
                                        </div> <!-- end .course -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="course">
                                                <div class="course-icon">
                                                        <div class="inner"><div class="inner"><i class="fa fa-car"></i></div></div> <!-- end .inner -->
                                                </div> <!-- end .course-icon -->
                                                <h5>Defensive Courses</h5>
                                                <div class="course-info">
                                                        <h5>Defensive Courses</h5>
                                                        <p>Lorem ipsum In aute occaecat Ut commodo id. Lorem ipsum Cillum cillum esse labore irure mollit tempor culpa.</p>
                                                        <p><a href="">Apply Now <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .course-info -->
                                        </div> <!-- end .course -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="course">
                                                <div class="course-icon">
                                                        <div class="inner"><div class="inner"><i class="fa fa-wheelchair"></i></div></div> <!-- end .inner -->
                                                </div> <!-- end .course-icon -->
                                                <h5>Handicap Courses</h5>
                                                <div class="course-info">
                                                        <h5>Handicap Courses</h5>
                                                        <p>Lorem ipsum In aute occaecat Ut commodo id. Lorem ipsum Cillum cillum esse labore irure mollit tempor culpa.</p>
                                                        <p><a href="">Apply Now <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .course-info -->
                                        </div> <!-- end .course -->
                                </div> <!-- end .col-sm-3 -->
                                <div class="col-sm-3">
                                        <div class="course">
                                                <div class="course-icon">
                                                        <div class="inner"><div class="inner"><i class="fa fa-truck"></i></div></div> <!-- end .inner -->
                                                </div> <!-- end .course-icon -->
                                                <h5>Crash Courses</h5>
                                                <div class="course-info">
                                                        <h5>Crash Courses</h5>
                                                        <p>Lorem ipsum In aute occaecat Ut commodo id. Lorem ipsum Cillum cillum esse labore irure mollit tempor culpa.</p>
                                                        <p><a href="">Apply Now <i class="fa fa-angle-double-right"></i></a></p>
                                                </div> <!-- end .course-info -->
                                        </div> <!-- end .course -->
                                </div> <!-- end .col-sm-3 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<section class="section transparent blue" style="background-image: url('images/background02.jpg');">
        <div class="inner">
                <div class="container">

                        <!-- Testimonials -->
                        <div class="heading text-center">
                                <h3>Trusted By Thousands</h3>
                                <hr class="line" />
                                <span>Satisfied Customer Feedback</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-6">
                                        <div class="testimonial clearfix">
                                                <div class="testimonial-image"><div class="inner"><img src="images/testimonial01.jpg" alt="alt text" class="img-responsive"></div></div> <!-- end .testimonial-image -->
                                                <div class="testimonial-body">
                                                        <span class="quote-icon"><i class="fa fa-quote-right"></i></span>
                                                        <h5>Jerry Wilson</h5>
                                                        <p>Lorem ipsum Consequat ut dolor Duis ut minim eiusmod reprehenderit proident. Lorem ipsum Duis ut sunt nisi fugiat incididunt Duis ea adipisicing dolor nulla sint et.</p>
                                                </div> <!-- end .testimonial-body -->
                                        </div> <!-- end .testimonial -->
                                </div> <!-- end .col-sm-6 -->
                                <div class="col-sm-6">
                                        <div class="testimonial clearfix">
                                                <div class="testimonial-image"><div class="inner"><img src="images/testimonial02.jpg" alt="alt text" class="img-responsive"></div></div> <!-- end .testimonial-image -->
                                                <div class="testimonial-body">
                                                        <span class="quote-icon"><i class="fa fa-quote-right"></i></span>
                                                        <h5>Katrin Jim</h5>
                                                        <p>Lorem ipsum Consequat ut dolor Duis ut minim eiusmod reprehenderit proident. Lorem ipsum Duis ut sunt nisi fugiat incididunt Duis ea adipisicing dolor nulla sint et.</p>
                                                </div> <!-- end .testimonial-body -->
                                        </div> <!-- end .testimonial -->
                                </div> <!-- end .col-sm-6 -->
                        </div> <!-- end .row -->
                        <div class="row">
                                <div class="col-sm-6">
                                        <div class="testimonial clearfix">
                                                <div class="testimonial-image"><div class="inner"><img src="images/testimonial03.jpg" alt="alt text" class="img-responsive"></div></div> <!-- end .testimonial-image -->
                                                <div class="testimonial-body">
                                                        <span class="quote-icon"><i class="fa fa-quote-right"></i></span>
                                                        <h5>Dwayne Johnson</h5>
                                                        <p>Lorem ipsum Consequat ut dolor Duis ut minim eiusmod reprehenderit proident. Lorem ipsum Duis ut sunt nisi fugiat incididunt Duis ea adipisicing dolor nulla sint et.</p>
                                                </div> <!-- end .testimonial-body -->
                                        </div> <!-- end .testimonial -->
                                </div> <!-- end .col-sm-6 -->
                                <div class="col-sm-6">
                                        <div class="testimonial clearfix">
                                                <div class="testimonial-image"><div class="inner"><img src="images/testimonial04.jpg" alt="alt text" class="img-responsive"></div></div> <!-- end .testimonial-image -->
                                                <div class="testimonial-body">
                                                        <span class="quote-icon"><i class="fa fa-quote-right"></i></span>
                                                        <h5>Chris Evans</h5>
                                                        <p>Lorem ipsum Consequat ut dolor Duis ut minim eiusmod reprehenderit proident. Lorem ipsum Duis ut sunt nisi fugiat incididunt Duis ea adipisicing dolor nulla sint et.</p>
                                                </div> <!-- end .testimonial-body -->
                                        </div> <!-- end .testimonial -->
                                </div> <!-- end .col-sm-6 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<section class="section white">
        <div class="inner">
                <div class="container">

                        <!-- Pricing Tables -->
                        <div class="heading text-center">
                                <h3>Our Pricing</h3>
                                <hr class="line" />
                                <span>We have Three Packages For Our learners</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-4">
                                        <div class="pricing-table blue">
                                                <div class="inner">
                                                        <div class="pricing-table-price">
                                                                <div class="inner">
                                                                        <span>$200</span>
                                                                </div> <!-- end .inner -->
                                                        </div> <!-- end .pricing-table-price -->
                                                        <div class="pricing-table-heading">
                                                                Basic<small>Monthly Fee</small>
                                                        </div> <!-- end .pricing-table-heading -->
                                                        <div class="pricing-table-features">
                                                                <ul class="list-unstyled">
                                                                        <li>Free Form To Sign</li>
                                                                        <li>2 Month Course</li>
                                                                        <li>15 Video Classes</li>
                                                                        <li>4 Hours Per Day</li>
                                                                        <li>Weekly 2 Tests</li>
                                                                </ul>
                                                        </div> <!-- end .pricing-table-features -->
                                                        <div class="pricing-table-button">
                                                                <a href="" class="button white border">Join Now</a>
                                                        </div> <!-- end .pricing-table-button -->
                                                </div> <!-- end .inner -->
                                        </div> <!-- end .pricing-table -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="pricing-table yellow">
                                                <div class="inner">
                                                        <div class="pricing-table-price">
                                                                <div class="inner">
                                                                        <span>$350</span>
                                                                </div> <!-- end .inner -->
                                                        </div> <!-- end .pricing-table-price -->
                                                        <div class="pricing-table-heading">
                                                                Standard<small>Monthly Fee</small>
                                                        </div> <!-- end .pricing-table-heading -->
                                                        <div class="pricing-table-features">
                                                                <ul class="list-unstyled">
                                                                        <li>Free Form To Sign</li>
                                                                        <li>3 Month Course</li>
                                                                        <li>25 Video Classes</li>
                                                                        <li>6 Hours Per Day</li>
                                                                        <li>Weekly 2 Tests</li>
                                                                </ul>
                                                        </div> <!-- end .pricing-table-features -->
                                                        <div class="pricing-table-button">
                                                                <a href="" class="button dark">Join Now</a>
                                                        </div> <!-- end .pricing-table-button -->
                                                </div> <!-- end .inner -->
                                        </div> <!-- end .pricing-table -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="pricing-table dark">
                                                <div class="inner">
                                                        <div class="pricing-table-price">
                                                                <div class="inner">
                                                                        <span>$400</span>
                                                                </div> <!-- end .inner -->
                                                        </div> <!-- end .pricing-table-price -->
                                                        <div class="pricing-table-heading">
                                                                Unlimited<small>Monthly Fee</small>
                                                        </div> <!-- end .pricing-table-heading -->
                                                        <div class="pricing-table-features">
                                                                <ul class="list-unstyled">
                                                                        <li>Free Form To Sign</li>
                                                                        <li>5 Month Course</li>
                                                                        <li>35 Video Classes</li>
                                                                        <li>6 Hours Per Day</li>
                                                                        <li>Weekly 3 Tests</li>
                                                                </ul>
                                                        </div> <!-- end .pricing-table-features -->
                                                        <div class="pricing-table-button">
                                                                <a href="" class="button white border">Join Now</a>
                                                        </div> <!-- end .pricing-table-button -->
                                                </div> <!-- end .inner -->
                                        </div> <!-- end .pricing-table -->
                                </div> <!-- end .col-sm-4 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<section class="section light">
        <div class="inner">
                <div class="container">

                        <!-- Links -->
                        <div class="heading text-center">
                                <h3>Any Help?</h3>
                                <hr class="line" />
                                <span>We Have A Special Team To Help Our Customers</span>
                        </div> <!-- end .heading -->
                        <div class="row">
                                <div class="col-sm-4">
                                        <div class="link clearfix">
                                                <div class="content">
                                                        <i class="fa fa-file-text"></i>
                                                        <span>Apply And Pay Online</span>
                                                </div> <!-- end .content -->
                                                <div class="arrow"><a href=""><i class="fa fa-chevron-right"></i></a></div> <!-- end .arrow -->
                                        </div> <!-- end .link -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="link clearfix">
                                                <div class="content">
                                                        <i class="fa fa-credit-card"></i>
                                                        <span>Get Your License</span>
                                                </div> <!-- end .content -->
                                                <div class="arrow"><a href=""><i class="fa fa-chevron-right"></i></a></div> <!-- end .arrow -->
                                        </div> <!-- end .link -->
                                </div> <!-- end .col-sm-4 -->
                                <div class="col-sm-4">
                                        <div class="link clearfix">
                                                <div class="content">
                                                        <i class="fa fa-question-circle"></i>
                                                        <span>Make an Inquiry</span>
                                                </div> <!-- end .content -->
                                                <div class="arrow"><a href=""><i class="fa fa-chevron-right"></i></a></div> <!-- end .arrow -->
                                        </div> <!-- end .link -->
                                </div> <!-- end .col-sm-4 -->
                        </div> <!-- end .row -->

                </div> <!-- end .container -->
        </div> <!-- end .inner -->
</section> <!-- end .section -->

<!-- Footer -->
<footer class="footer blue">
        <div class="container">
                <div class="newsletter clearfix">
                        <div class="newsletter-icon"><i class="fa fa-envelope"></i></div>
                        <h3>Newsletter</h3>
                        <form action="https://johneyboy.us7.list-manage.com/subscribe/post-json?u=3210d74dbf054134a29daf97c&amp;id=50ad235761&amp;c=?" method="get" target="_blank" id="mc-embedded-subscribe-form" class="newsletter-form">
                                <input type="email" id="mce-EMAIL" name="EMAIL" placeholder="Your Email" />
                                <input type="submit" id="mc-embedded-subscribe" name="subscribe" value="Go" class="button dark" />
                        </form>
                        <div id="newsletter-loading" class="alert alert-info form-alert">
                                <span class="icon"><i class="fa fa-info"></i></span>
                                <span class="message">Loading...</span>
                                <button type="button" class="close" data-hide="alert" aria-label="Close"><i class="fa fa-times"></i></button>
                        </div>
                        <div id="newsletter-info" class="alert alert-info form-alert">
                                <span class="icon"><i class="fa fa-info"></i></span>
                                <span class="message">Info</span>
                                <button type="button" class="close" data-hide="alert" aria-label="Close"><i class="fa fa-times"></i></button>
                        </div>
                        <div id="newsletter-success" class="alert alert-success form-alert">
                                <span class="icon"><i class="fa fa-check"></i></span>
                                <span class="message">Success!</span>
                                <button type="button" class="close" data-hide="alert" aria-label="Close"><i class="fa fa-times"></i></button>
                        </div>
                        <div id="newsletter-error" class="alert alert-danger form-alert">
                                <span class="icon"><i class="fa fa-times"></i></span>
                                <span class="message">Error!</span>
                                <button type="button" class="close" data-hide="alert" aria-label="Close"><i class="fa fa-times"></i></button>
                        </div>
                </div> <!-- end .newsletter -->
                <div class="row">
                        <div class="col-sm-3">
                                <div class="widget">
                                        <h5>About</h5>
                                        <p>DrivePro is the best driving school. We have well trained instructors. DrivePro is the best driving school.</p>
                                        <div class="social-icons">
                                                <div class="social-icon"><a href=""><i class="fa fa-facebook"></i></a></div>
                                                <div class="social-icon"><a href=""><i class="fa fa-twitter"></i></a></div>
                                                <div class="social-icon"><a href=""><i class="fa fa-linkedin"></i></a></div>
                                                <div class="social-icon"><a href=""><i class="fa fa-google-plus"></i></a></div>
                                        </div> <!-- end .social-icons -->
                                </div> <!-- end .widget -->
                        </div> <!-- end .col-sm-3 -->
                        <div class="col-sm-2 col-sm-offset-1">
                                <div class="widget">
                                        <h5>Categories</h5>
                                        <ul class="list-unstyled">
                                                <li><a href="">Driving</a></li>
                                                <li><a href="">Exam</a></li>
                                                <li><a href="">Instruction</a></li>
                                                <li><a href="">Instructor</a></li>
                                                <li><a href="">License</a></li>
                                        </ul>
                                </div> <!-- end .widget -->
                        </div> <!-- end .col-sm-2 -->
                        <div class="col-sm-3">
                                <div class="widget">
                                        <h5>Latest Post</h5>
                                        <div class="latest-post clearfix">
                                                <img src="images/latest01.jpg" alt="alt" class="img-responsive">
                                                <div>
                                                        <h6><a href="">Tips To Drive Safe</a></h6>
                                                        <span>Jan 5, 2014</span>
                                                </div>
                                        </div> <!-- end .latest-post -->
                                        <div class="latest-post clearfix">
                                                <img src="images/latest02.jpg" alt="alt" class="img-responsive">
                                                <div>
                                                        <h6><a href="">We Like Races Here</a></h6>
                                                        <span>Jan 5, 2014</span>
                                                </div>
                                        </div> <!-- end .latest-post -->
                                        <div class="latest-post clearfix">
                                                <img src="images/latest03.jpg" alt="alt" class="img-responsive">
                                                <div>
                                                        <h6><a href="">Defensive Course</a></h6>
                                                        <span>Jan 5, 2014</span>
                                                </div>
                                        </div> <!-- end .latest-post -->
                                </div> <!-- end .widget -->
                        </div> <!-- end .col-sm-3 -->
                        <div class="col-sm-3">
                                <div class="widget">
                                        <h5>Flickr</h5>
                                        <div class="flickr clearfix">
                                                <a href=""><img src="images/flickr01.jpg" alt="alt" class="img-responsive"></a>
                                                <a href=""><img src="images/flickr02.jpg" alt="alt" class="img-responsive"></a>
                                                <a href=""><img src="images/flickr03.jpg" alt="alt" class="img-responsive"></a>
                                                <a href=""><img src="images/flickr04.jpg" alt="alt" class="img-responsive"></a>
                                                <a href=""><img src="images/flickr05.jpg" alt="alt" class="img-responsive"></a>
                                                <a href=""><img src="images/flickr06.jpg" alt="alt" class="img-responsive"></a>
                                        </div>
                                </div> <!-- end .widget -->
                        </div> <!-- end .col-sm-3 -->
                </div> <!-- end .row -->
                <div class="copyright">&copy; 2015 DrivePro All Rights Reserved.</div>
        </div> <!-- end .container -->
</footer> <!-- end .footer -->

<!-- jQuery -->
<script src="js/jquery-1.11.2.min.js"></script>
<!-- Bootstrap -->
<script src="js/bootstrap.min.js"></script>
<!-- Inview -->
<script src="js/jquery.inview.min.js"></script>
<!-- google maps -->
<script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
<!-- FlexSlider -->
<script src="scripts/FlexSlider/jquery.flexslider-min.js"></script>
<!-- Nivo Lightbox -->
<script src="scripts/Nivo-Lightbox/nivo-lightbox.min.js"></script>
<!-- Scripts.js -->
<script src="js/scripts.js"></script>









































<!--<section id="container">
header start
<header class="header black-bg">
<div class="sidebar-toggle-box">
    <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
</div>
logo start
<a href="index.html" class="logo"><b>Hamilton</b></a>
logo end
<div class="top-menu">
    <ul class="nav pull-right top-menu">
        <li><a class="logout" href="login.html">Logout</a></li>
    </ul>
</div>
</header>
header end
sidebar start
<aside>
<div id="sidebar" class="nav-collapse ">
     sidebar menu start
    <ul class="sidebar-menu" id="nav-accordion">

        <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle"
                                                        width="60"></a></p>
        <h5 class="centered">
            <c:if test="${sessionScope.user != null}">
                ${sessionScope.user.nome} -
            </c:if>

        </h5>

        <li class="mt">
            <a href="control">
                <i class="fa fa-dashboard"></i>
                <span>Home</span>
            </a>
        </li>
         <c:if test="${sessionScope.user == null}">
        <li class="sub-menu">
            <a href="control?ac=login">
                <i class="fa fa-dashboard"></i>
                <span>Login</span>
            </a>
        </li>
        </c:if>
        <c:if test="${sessionScope.user == null}">
         <li class="sub-menu">
            <a href="control?ac=cadAluno">
                <i class="fa fa-cogs"></i>
                <span>cadastrar</span>
            </a>
        </li>
        </c:if>

         <c:if test="${sessionScope.user != null}">
             <li class="sub-menu">
                 <a href="control?ac=logout">
                     <i class="fa fa-dashboard"></i>
                     <span>Logout</span>
                 </a>
             </li>    
        <li class="sub-menu">
            <a href="control?ac=matricular">
                <i class="fa fa-cogs"></i>
                <span>Matricular</span>
            </a>
        </li>
        </c:if>
        -
        <li class="sub-menu">
            <a href="professor.html">
                <i class="fa fa-cogs"></i>
                <span>Professor</span>
            </a>
        </li>
        <li class="sub-menu">
            <a href="professor.html">
                <i class="fa fa-cogs"></i>
                <span>Disciplina</span>
            </a>
        </li>
        -
    </ul>
     sidebar menu end
</div>
</aside>
sidebar end
main content start
<section id="main-content">
<section class="wrapper site-min-height">
    <h3><i class="fa fa-angle-right"></i> 
        <c:if test="${requestScope.info != null}">
            ${requestScope.info}
        </c:if>
    </h3>
    <div class="row mt">
        <div class="col-lg-12">

            <%--
            <%
              // injection Master
              String pg =  request.getParameter("page");
              if (pg == null) {
                      pg = "pages/home.jsp";
                  }else{
                  pg = "pages/"+pg+".jsp";
              }
              String path = getServletContext().getRealPath("/template.jsp").replace("template.jsp","");
              File f = new File(path+pg);
              if(f.exists()){%>

              <jsp:include page="<%= pg %>" />
             <% }else{ %>
             <jsp:include page="pages/404.jsp" />      
            <%  }
            %>
            --%>

            <c:if test="${param.page == null}">
                <jsp:include page="pages/home.jsp" />
            </c:if>
            <c:if test="${param.page != null}">
                <jsp:include page="pages/${param.page}.jsp" />
            </c:if>                    
        </div>
    </div>

</section>
<! --/wrapper -->
</section> /MAIN CONTENT 
main content end
footer start
<footer class="site-footer">
<div class="text-center">
    2018 - Juiz de Fora
    <a href="aluno.html#" class="go-top">
        <i class="fa fa-angle-up"></i>
    </a>
</div>
</footer>
footer end
</section>
<script src="layout/assets/js/jquery.js"></script>
<script src="layout/assets/js/bootstrap.min.js"></script>
<script src="layout/assets/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="layout/assets/js/jquery.ui.touch-punch.min.js"></script>
<script class="include" type="text/javascript" src="layout/assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="layout/assets/js/jquery.scrollTo.min.js"></script>
<script src="layout/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


common script for all pages
<script src="layout/assets/js/common-scripts.js"></script>

script for this page

<script>

<%
if(request.getAttribute("jsAlertAtivo") != null
  && ((boolean)request.getAttribute("jsAlertAtivo")) ){
%>
alert("<%= request.getAttribute("info")%>");
<%
}
%>
//custom select box

$(function () {
$('select.styled').customSelect();
});

</script>-->

</body>
</html>

