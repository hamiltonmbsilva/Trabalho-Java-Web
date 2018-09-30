<%-- 
    Document   : marcarAula
    Created on : 29/09/2018, 01:19:48
    Author     : Hamil
--%>



<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/stayle.css" rel="stylesheet" id="bootstrap-css">
<script src="js/bootstrap.min.js"></script>
<script src="js/style.js"></script>
<script src="js/jquery-1.11.2.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<form action="control" method="POST">
    <input type="hidden" name="ac" value="marcarAulasSecured" />
        <div class="container  col-md-12" id="tabela">
                <div class="row  col-md-12">
                        <h2>Tabela de Aulas</h2>
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <h3>Listar aulas

                                </h3>
                            </div>		    
                            <table class="table table-striped table-hover col-md-12">
                                <thead >
                                    <tr >		                
                                        <th>Id</th>
                                        <th>Data da Aula</th>
                                        <th>Data da Aula</th>
                                        <th>Tipo de aula</th>
                                        <th>Tipo de aula</th>
                                        <th>Professor</th>		                
                                        <th>Marcar Aula</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr class="success">
                                        <c:forEach var="aula" items="${requestScop.TabelaAula}">
                                            <td value="${aula.idtabela_aula}">${aula.idtabela_aula}</td>
                                            <td>aula.data_teorica</td>
                                            <td>aula.data_pratica</td>
                                            <td>aula.aula_teorica</td>
                                            <td>aula.aula_paratica</td>
                                            <td>aula.professor_idprofessor/td> 
                                            <td><button id="btn-admin" class="btn btn-default"><span class="glyphicon glyphicon-pencil"></span> Marcar aula</button></td>
                                        </c:forEach>
                                    </tr>

                                </tbody>
                            </table>
                        </div>
                </div>
        </div>
</form>    