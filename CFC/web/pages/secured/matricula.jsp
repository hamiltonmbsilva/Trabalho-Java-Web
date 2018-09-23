<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 class="alert alert-success">Minhas Matriculas ::  
    <c:if test="${sessionScope.user != null}">
     ${sessionScope.user.nome} 
    </c:if>
</h1><hr>
<h3><i class="fa fa-angle-right"></i> Matriculas</h3>
<div id="table">
    
    <form>
        <input type="button" value="Nova Matricula"/>
    </form>
    <table class="table table-striped table-responsive">
        <tr class="alert alert-success">
            <td>Disciplina</td>
            <td>Ano</td>
            <td>Semestre</td>
            <td>Professor</td>
            <td>         </td>
         </tr> 
         <c:if test="${requestScope.lista.size()==0}">
             <tr>
                 <td colspan="5"> Não tem matricula</td>
             </tr>
             
         </c:if>
         
            <c:forEach items="${requestScope.lista}" var="m">                       
                <tr class="alert alert-success">
                    <td>${m.nome}</td>
                    <td>${m.ano}</td>
                    <td>${m.semestre}</td>
                    <td>${m.professor.nome}</td>
                    <td>         </td>
                 </tr>  
                 </c:forEach>    
        
        <!--restante da Tabela-->
    </table>
</div>
        