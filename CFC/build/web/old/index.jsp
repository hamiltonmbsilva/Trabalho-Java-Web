<%-- 
    Document   : index
    Created on : 30/08/2018, 19:54:36
    Author     : aluno
--%>

<%@page import="br.aluno.curso.model.Disciplina"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="br.aluno.curso.model.Aluno"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="boostrap/css/bootstrap.min.css">
        <script src="boostrap/js/bootstrap.min.js"></script>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/myscript.js"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <%
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("WebAlunoPU");
            EntityManager em  = emf.createEntityManager();
            Aluno a = new Aluno("23","aluno","12312312312",new Date());
            a.setDisciplinas(new ArrayList<Disciplina>());
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
            
        %>
        <h1>Hello World!</h1>
    </body>
</html>
