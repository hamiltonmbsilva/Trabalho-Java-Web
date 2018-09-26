<%-- 
    Document   : login
    Created on : 23/09/2018, 23:25:24
    Author     : Hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        
        <title>Login</title>
        
        <!-- Bootstrap core CSS -->
        <link href="layout/assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>

        <!-- Custom styles for this template -->
        <link href="layout/assets/css/style.css" rel="stylesheet">
        <link href="layout/assets/css/style-responsive.css" rel="stylesheet">
    </head>
    <body>
       <body>  
      	  <div id="login-page">
	  	<div class="container">
	  	
                    <form class="form-login" action="control" method="POST">
                        <input type="hidden" name="ac" value="validaLogin">
		        <h2 class="form-login-heading">sign in now</h2>
		        <div class="login-wrap">
                            <input type="text" class="form-control" placeholder="User ID" autofocus name="login">
		            <br>
                            <input type="password" class="form-control" placeholder="Password" name="senha">
		            <label class="checkbox">
		                <span class="pull-right">
		                    <a data-toggle="modal" href="login.html#myModal"> Forgot Password?</a>
		
		                </span>
		            </label>
		            <button class="btn btn-theme btn-block" href="index.html" type="submit"><i class="fa fa-lock"></i> Logar</button>
		            <hr>
		            
<!--		            <div class="login-social-link centered">
		            <p>or you can sign in via your social network</p>
		                <button class="btn btn-facebook" type="submit"><i class="fa fa-facebook"></i> Facebook</button>
		                <button class="btn btn-twitter" type="submit"><i class="fa fa-twitter"></i> Twitter</button>
		            </div>                            -->
                           
                                <div class="registration">
                                   Você não tem conta?<br/>    
                                   
                                        <c:if test="${sessionScope.user == null}">
                                            <div class="sub-menu1">
                                               
                                               <a href="control?ac=cadUsuario">
                                                   
                                                   <i class="fa fa-cogs"></i>
                                                   <span>cadastrar</span>
                                                   
                                               </a>
                                                   
                                           </div>
                                        </c:if>
                                     
                                </div>
                                
		
		        </div>
		
		          <!-- Modal -->
		          <div aria-hidden="true" aria-labelledby="myModalLabel" role="dialog" tabindex="-1" id="myModal" class="modal fade">
		              <div class="modal-dialog">
		                  <div class="modal-content">
		                      <div class="modal-header">
		                          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                          <h4 class="modal-title">Forgot Password ?</h4>
		                      </div>
		                      <div class="modal-body">
		                          <p>Enter your e-mail address below to reset your password.</p>
		                          <input type="text" name="email" placeholder="Email" autocomplete="off" class="form-control placeholder-no-fix">
		
		                      </div>
		                      <div class="modal-footer">
		                          <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
		                          <button class="btn btn-theme" type="button">Submit</button>
		                      </div>
		                  </div>
		              </div>
		          </div>
		          <!-- modal -->
		
		      </form>	  	
	  	
	  	</div>
	  </div>

<script src="../layout/assets/js/jquery.js"></script>
<script src="../layout/assets/js/bootstrap.min.js"></script>
<script src="../layout/assets/js/jquery-ui-1.9.2.custom.min.js"></script>
<script src="../layout/assets/js/jquery.ui.touch-punch.min.js"></script>
<script class="include" type="text/javascript" src="../layout/assets/js/jquery.dcjqaccordion.2.7.js"></script>
<script src="../layout/assets/js/jquery.scrollTo.min.js"></script>
<script src="../layout/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


<!--common script for all pages-->
<script src="../layout/assets/js/common-scripts.js"></script>
<script src="../layout/assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
    <script>
        $.backstretch("../imagens/fundo.jpeg", {speed: 500});
    </script>

  </body>
   
</html>
