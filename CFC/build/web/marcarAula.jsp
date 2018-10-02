<%-- 
    Document   : marcarAula
    Created on : 29/09/2018, 01:19:48
    Author     : Hamil
--%>




<%@page import="Model.Classe.TabelaAula"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="css/stayle.css" rel="stylesheet" id="bootstrap-css">
<script src="js/bootstrap.min.js"></script>
<script src="js/style.js"></script>
<script src="js/jquery-1.11.2.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<form action="controla?ac=marcarAulasSecured" method="POST">
    <!--<input type="hidden" name="ac" value="marcarAulasSecured" />-->
   
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
                                    <%-- <c:forEach items="${requestScop.lista}" var="aula" > --%>
                                    
                                    
                                        <c:forEach items="${marcarListaAula}" var="listaAula" > 
                                            <tr class="success">
                                                <td>${listaAula['idtabelaAula']}</td>
                                                <td>${listaAula['dataTeorica']}</td>
                                                <td>${listaAula['dataPratica']}</td>
                                                <td>${listaAula['aulaTeorica']}</td>
                                                <td>${listaAula['aulaParatica']}</td>
                                                <td>${listaAula['professorIdprofessor.nome']}</td> 
                                                <td><button id="btn-admin" class="btn btn-default" href="controla?ac=marcarAulasSecured"> Marcar aula</button></td>
                                             </tr>
                                         </c:forEach>
                                             
                                             
<!--                                             <%--
                                                 List listaAula = (List) request.getAttribute("marcarListaAula");
                                                 for(Iterator iterator = listaAula.iterator(); iterator.hasNext();){
                                                     TabelaAula tabelaAula = (TabelaAula) iterator.next();%>
                                                     
                                                     <tr class="success">
                                                <td><%=tabelaAula.getIdtabelaAula()%></td>
                                                <td><%=tabelaAula.getAulaTeorica()%></td>
                                                <td><%=tabelaAula.getAulaPratica()%></td>
                                                <td><%=tabelaAula.getDataTeorica()%></td>
                                                <td><%=tabelaAula.getDataPratica()%></td>
                                                <td><%=tabelaAula.getProfessorIdprofessor()%></td>
                                                <td>${listaAula['dataTeorica']}</td>
                                                <td>${listaAula['dataPratica']}</td>
                                                <td>${listaAula['aulaTeorica']}</td>
                                                <td>${listaAula['aulaParatica']}</td>
                                                <td>${listaAula['professorIdprofessor.nome']}</td> 
                                                <td><button id="btn-admin" class="btn btn-default" href="controla?ac=marcarAulasSecured"> Marcar aula</button></td>
                                             </tr>
                                             <%
                                                 }
                                             
                                             
                                             --%>
                                   -->

                                </tbody>
                            </table>
                        </div>
                </div>
        </div>
</form>    