<%-- 
    Document   : cadastrar
    Created on : 24/09/2018, 00:01:21
    Author     : Hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        
        <title>JSP Page</title>
        
        <!-- Bootstrap core CSS -->
        <link href="layout/assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>

        <!-- Custom styles for this template -->
        <link href="layout/assets/css/style.css" rel="stylesheet">
        <link href="layout/assets/css/style-responsive.css" rel="stylesheet">
    </head>
    <body>
        
        <div id="login-page">
	  <div class="container">
                <form action="control" method="POST">
                 <input type="hidden" name="ac" value="saveUsuario"/> 
                 <h2 class="form-login-heading">Pre-Cadastro</h2>
                 <div class="form-group">
                     <label for="nome">Nome Completo:</label>
                     <input id="nome" name="nome" class="form-control" type="text"
                            placeholder="Digite o seu nome complelto...">
                 </div>                 
                   <div class="form-group">
                     <label for="login">Login</label>
                     <input id="login" name="login" class="form-control" type="text" placeholder="Digite o Login...">
                 </div>
                   <div class="form-group">
                     <label for="senha">Senha</label>
                     <input id="senha" name="senha" class="form-control" type="text" placeholder="Digite o Senha...">
                 </div>
                 <div class="form-group">
                     <label for="email">Email:</label>
                     <input id="email" class="form-control" name="email" type="email" placeholder="Digite o Login...">
                 </div>
                 <div class="form-group">
                     <label for="rua">Nome da Rua:</label>
                     <input id="rua" class="form-control" name="rua" type="text" placeholder="Digite a Rua...">
                 </div>
                 <div class="form-group">
                     <label for="numero">Numero:</label>
                     <input id="numero" class="form-control" name="numero" type="number" placeholder="Digite o Login...">
                 </div>
                 <div class="form-group">
                     <label for="complemento">Complemento:</label>
                     <input id="complemento" class="form-control" name="complemento" type="text" placeholder="Digite o Complemento...">
                 </div>
                 <div class="form-group">
                     <label for="bairro">Bairro:</label>
                     <input id="bairro" class="form-control" name="bairro" type="text" placeholder="Digite o Bairro...">
                 </div>
                 <div class="form-group">
                     <label for="cidade">Cidade:</label>
                     <input id="cidade" class="form-control" name="cidade" type="text" placeholder="Digite a Cidade...">
                 </div>
                 <div class="form-group">
                     <label for="estado">Estado:</label>
                     <input id="estado" class="form-control" name="estado" type="text" placeholder="Digite o Estado...">
                 </div>
                 <div>
                     <button class="btn btn-primary" type="submit"> Salvar</button>
                 </div>
             </form>
          </div>
        </div>
        
        <script src="layout/assets/js/jquery.js"></script>
        <script src="layout/assets/js/bootstrap.min.js"></script>
        <script src="layout/assets/js/jquery-ui-1.9.2.custom.min.js"></script>
        <script src="layout/assets/js/jquery.ui.touch-punch.min.js"></script>
        <script class="include" type="text/javascript" src="layout/assets/js/jquery.dcjqaccordion.2.7.js"></script>
        <script src="layout/assets/js/jquery.scrollTo.min.js"></script>
        <script src="layout/assets/js/jquery.nicescroll.js" type="text/javascript"></script>


        <!--common script for all pages-->
        <script src="layout/assets/js/common-scripts.js"></script>
        <script src="layout/assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
            <script>
                $.backstretch("../imagens/fundo.jpeg", {speed: 500});
            </script>

    </body>
</html>
