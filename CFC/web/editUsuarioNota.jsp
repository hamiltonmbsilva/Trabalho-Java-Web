<%-- 
    Document   : editUsuarioNota
    Created on : 01/10/2018, 07:57:52
    Author     : Hamil
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.io.File"%>

<link href="boostrap/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="boostrap/js/bootstrap.min.js"></script>

<h3>Minhas Matriculas :: 
    <c:if test="${sessionScope.user != null}">        
        ${sessionScope.user.nome}
    </c:if>
</h3><hr />


<form action="control" method="POST">
<input type="hidden" name="ac" value="editUsuarioNota"/> 

    <div class="container">
        <div class="row">


            <div class="col-md-12">
            <h4>Editar Usuario</h4>
            <div class="table-responsive">
                
                
                


        <table id="mytable" class="table table-bordred table-striped">
            
            Usuario: <select id="pesqUsuario">
                <option value="1">Selecione</option>
                <c:forEach items="${requestScope.tabelaAulaList}" var="u">
                    <option value="${u.idusuario}">${u.aula_teorica}</option>
                </c:forEach>

                <thead>
                        <th>Name</th>
                        <th>Nota</th>
                        <th>Editar</th>
                        <th>Excluir</th>
                    </thead>
            <tbody id="tabela">
                 <c:if test="${requestScope.lista.size() == 0}">
                     <tr>
                         <td colspan="5">  Não há Matriculas </td>
                     </tr>
                 </c:if> 
                 <c:forEach items="${requestScope.usuarioList}" var="u">   
                    <tr>    
                       <td>${u.nome}</td>
                       <td>$(u.nota)</td>                
                       <td><button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" href="control?ac=editUsuario&id=${u.idusuario}"></button></td>
                       <td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>
                   </tr>
                </c:forEach> 
            </tbody>

        </table>

    <div class="clearfix"></div>
    <ul class="pagination pull-right">
      <li class="disabled"><a href="#"><span class="glyphicon glyphicon-chevron-left"></span></a></li>
      <li class="active"><a href="#">1</a></li>
      <li><a href="#">2</a></li>
      <li><a href="#">3</a></li>
      <li><a href="#">4</a></li>
      <li><a href="#">5</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-chevron-right"></span></a></li>
    </ul>

                </div>

            </div>
            </div>
    </div>


    <div class="modal fade" id="edit" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
          <div class="modal-dialog">
        <div class="modal-content">
              <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
            <h4 class="modal-title custom_align" id="Heading">Edit Your Detail</h4>
          </div>
              <div class="modal-body">
              <div class="form-group">
            <input class="form-control " type="text" placeholder="Mohsin">
            </div>
            <div class="form-group">

            <input class="form-control " type="text" placeholder="Irshad">
            </div>
            <div class="form-group">
            <textarea rows="2" class="form-control" placeholder="CB 106/107 Street # 11 Wah Cantt Islamabad Pakistan"></textarea>


            </div>
          </div>
              <div class="modal-footer ">
            <button type="button" class="btn btn-warning btn-lg" style="width: 100%;"><span class="glyphicon glyphicon-ok-sign"></span> Update</button>
          </div>
            </div>
        <!-- /.modal-content --> 
      </div>
          <!-- /.modal-dialog --> 
        </div>



        <div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
          <div class="modal-dialog">
        <div class="modal-content">
              <div class="modal-header">
            <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
            <h4 class="modal-title custom_align" id="Heading">Delete this entry</h4>
          </div>
              <div class="modal-body">

           <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span> Are you sure you want to delete this Record?</div>

          </div>
            <div class="modal-footer ">
            <button type="button" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span> Yes</button>
            <button type="button" class="btn btn-default" data-dismiss="modal"><span class="glyphicon glyphicon-remove"></span> No</button>
          </div>
            </div>
        <!-- /.modal-content --> 
      </div>
          <!-- /.modal-dialog --> 
        </div>

<script src="js/jquery-1.11.2.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/style.js"></script>