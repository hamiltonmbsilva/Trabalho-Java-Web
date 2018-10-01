<%-- 
    Document   : cadsatrarAula
    Created on : 30/09/2018, 16:35:07
    Author     : Hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        
        <title>Cadastrar aula</title>
        
        <!-- Bootstrap core CSS -->
        <link href="layout/assets/css/bootstrap.css" rel="stylesheet">
        <!--external css-->
        <link href="layout/assets/font-awesome/css/font-awesome.css" rel="stylesheet"/>

        <!-- Custom styles for this template -->
        <link href="layout/assets/css/style.css" rel="stylesheet">
        <link href="layout/assets/css/style-responsive.css" rel="stylesheet">
    
        
        
       
                <form action="control" method="POST">
                 <input type="hidden" name="ac" value="saveAula"/> 
                    <h2 class="form-login-heading">Cadastrar aulas</h2>
                    <div class="form-group">
                        <label for="nome">Aula Terorica:</label>
                        <input id="nome" name="aulaTeorica" class="form-control" type="text"
                               placeholder="Digite o seu nome complelto...">
                   </div> 
                    
                   
                     <!--  <div class="form-group">
                        <label for="login">Aula Pratica:</label>
                        <input id="login" name="aulaPratica" class="form-control" type="text" placeholder="Aula Pratica...">
                    </div>-->
                      <div class="form-group">
                        <label for="senha">Data da Aula Teorica</label>
                        <input id="senha" name="dataAulaTeorica" class="form-control" type="date" placeholder="Digite o Senha...">
                    </div>
<!--                    <div class="form-group">
                        <label for="email">Data Aula Paratica:</label>
                        <input id="email" class="form-control" name="dataAulaPratica" type="date" placeholder="Digite o Login...">
                    </div>-->

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
