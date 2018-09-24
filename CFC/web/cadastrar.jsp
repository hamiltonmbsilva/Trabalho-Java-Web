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
       <form action="control" method="POST">
        <input type="hidden" name="ac" value="gravarUser"/>
        <div class="form-group">
            <label for="matricula">Matricula:</label>
            <input id="matricula" name="matricula" class="form-control" type="text"
                   placeholder="Digite a matricula...">
        </div>
        <div class="form-group">
            <label for="nome">Nome Completo:</label>
            <input id="nome" name="nome" class="form-control" type="text"
                   placeholder="Digite o nome complelto...">
        </div>
        <div class="form-group">
            <label for="cpf">CPF:</label>
            <input id="cpf" name="cpf" class="form-control" type="text" placeholder="Digite o CPF...">
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
            <label for="dt_nasc">Data Nascimento:</label>
            <input id="dt_nasc" class="form-control" name="dt_nasc" type="date">
        </div>
        <div>
            <button class="btn btn-primary" type="submit"> Salvar</button>
        </div>
    </form>
    </body>
</html>
