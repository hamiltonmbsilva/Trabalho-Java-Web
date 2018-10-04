<%-- 
    Document   : usuario
    Created on : 28/09/2018, 02:38:57
    Author     : Hamil
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

        <title>CFC DRIVE</title>

        <!-- Bootstrap core CSS -->
        <link href="layout/assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>

        <!-- Custom styles for this template -->
        <link href="layout/assets/css/style.css" rel="stylesheet">
        <link href="layout/assets/css/style-responsive.css" rel="stylesheet">
        <link rel="shortcut icon" href="favicons/favicon.ico">

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
                <a href="index.html" class="logo"><img src="images/logo.png" class="img-circle"
                                                                        width="100"></a>
                <!--logo end-->
                <div class="top-menu">
                    <ul class="nav pull-right top-menu">
                        <li><a class="logout" href="login.jsp?page=login">Logout</a></li>
                    </ul>
                </div>
            </header>
            <!--header end-->
            <!--sidebar start-->
            <aside>
                <div id="sidebar" class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu" id="nav-accordion">

                        <p class="centered"><a href="profile.html"><img src="images/logo.png" class="img-circle"
                                                                        width="60"></a></p>
                        <h5 class="centered">
                            <c:if test="${sessionScope.user != null}">
                                ${sessionScope.user.nome} - 
                            </c:if>                            
                            CFC DRIVE</h5>

                        <li class="mt">
                            <a href="templateAreaUsuario.jsp?page=home">
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
                          
                           <%-- <c:if test="${sessionScope.tipoUser == 'usuario'}">--%>
                                 <c:if test="${sessionScope.user != null}">
                        <li class="sub-menu">
                            <a href="control?ac=marcarAulasSecured">
                                <i class="fa fa-cogs"></i>
                                <span>Marcar Aulas</span>
                            </a>
                        </li>
                        </c:if>
                        <c:if test="${sessionScope.user != null}">
                        <li class="sub-menu">
                            <a href="control?ac=cadAluno">
                                <i class="fa fa-cogs"></i>
                                <span>Marcar Simulado</span>
                            </a>
                        </li>
                         </c:if>
                         <c:if test="${sessionScope.user != null}">
                            <li class="sub-menu">
                                <a href="control?ac=cadAula">
                                    <i class="fa fa-cogs"></i>
                                    <span>Cadastrar Aulas Teoricas</span>
                                </a>
                            </li>  
                        </c:if>
                            
                        <c:if test="${sessionScope.tipoUser == 'professor'}">
                            <li class="sub-menu">
                                <a href="control?ac=cadAulaPratica">
                                    <i class="fa fa-cogs"></i>
                                    <span>Cadastrar Aulas Praticas</span>
                                </a>
                            </li>  
                        </c:if>
                            
                         <c:if test="${sessionScope.user != null}">
                            <li class="sub-menu">
                                <a href="control?ac=editUsuarioNota">
                                    <i class="fa fa-cogs"></i>
                                    <span>Cadastrar Notas</span>
                                </a>
                            </li>  
                        </c:if> 
                            
                        <c:if test="${sessionScope.user != null}">
                            <li class="sub-menu">
                                <a href="control?ac=editUsuario">
                                    <i class="fa fa-cogs"></i>
                                    <span>Confirma novo Usuario</span>
                                </a>
                            </li>  
                        </c:if>      
                        
                            
                        
                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
                            
                            
            <section id="main-content">
                <section class="wrapper site-min-height" id="marcarAulas">
                    <h3><i class="fa fa-angle-right"></i> 
                        <c:if test="${requestScope.user != null}">
                         
                            ${sessionScope.user.nome}
                            <br />
                           ::( ${sessionScope.tipoUser} )::
                        </c:if></h3> 
                        
                    <div class="row mt">
                        <div class="col-lg-12">    
                           <c:if test="${param.page == null}">
                                <jsp:include page="home.jsp" />
                            </c:if>
                            
                             <c:if test="${param.page != null}">
                                <jsp:include page="${param.page}.jsp" />
                             </c:if>
                            
                           
                        </div>
                       
                        <div class="col-lg-12">   
                                                    


                        </div>
                    </div>

                </section>
                <! --/wrapper -->
            </section>                
                            
                            
                            
            <!--sidebar end-->
            <!--main content start-->
<!--          retirado um texto de section
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
        <script src="js/myscript.js"></script>

        <script>
            //custom select box

            <%
                if (request.getAttribute("jsAlertAtivo") != null
                        && ((boolean) request.getAttribute("jsAlertAtivo"))) {
            %>
            alert("<%= request.getAttribute("info")%>");
            <%
                }
            %>

//            $(function () {
//                $('select.styled').customSelect();
//            });

        </script>

    </body>
</html>
