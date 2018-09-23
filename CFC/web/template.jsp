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
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>Web Aluno</title>

    <!-- Bootstrap core CSS -->
    <link href="layout/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>

    <!-- Custom styles for this template -->
    <link href="layout/assets/css/style.css" rel="stylesheet">
    <link href="layout/assets/css/style-responsive.css" rel="stylesheet">


    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<section id="container">
    <!--header start-->
    <header class="header black-bg">
        <div class="sidebar-toggle-box">
            <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
        </div>
        <!--logo start-->
        <a href="index.html" class="logo"><b>Hamilton</b></a>
        <!--logo end-->
        <div class="top-menu">
            <ul class="nav pull-right top-menu">
                <li><a class="logout" href="login.html">Logout</a></li>
            </ul>
        </div>
    </header>
    <!--header end-->
    <!--sidebar start-->
    <aside>
        <div id="sidebar" class="nav-collapse ">
            <!-- sidebar menu start-->
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
                <!---
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
                --->
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->
    <!--main content start-->
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
    </section><!-- /MAIN CONTENT -->
    <!--main content end-->
    <!--footer start-->
    <footer class="site-footer">
        <div class="text-center">
            2018 - Juiz de Fora
            <a href="aluno.html#" class="go-top">
                <i class="fa fa-angle-up"></i>
            </a>
        </div>
    </footer>
    <!--footer end-->
</section>
<script src="layout/assets/js/jquery.js"></script>
<script src="layout/assets/js/bootstrap.min.js"></script>
<script src="layout/assets/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="layout/assets/js/jquery.ui.touch-punch.min.js"></script>
<script class="include" type="text/javascript" src="layout/assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="layout/assets/js/jquery.scrollTo.min.js"></script>
<script src="layout/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


<!--common script for all pages-->
<script src="layout/assets/js/common-scripts.js"></script>

<!--script for this page-->

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

</script>

</body>
</html>

