/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.Login;
import Model.Classe.Usuario;
import Model.DAO.TabelaAulaDAO;
import Model.DAO.UsuarioDAO;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class MarcarAulasAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
         RequestDispatcher rd = request.getRequestDispatcher("usuario.jsp?pages=marcarAula");
         
         Login a = (Login) request.getSession().getAttribute("user");
         request.setAttribute("tabelaAulaList", new TabelaAulaDAO().getAll());
         rd.forward(request, response);}
    
}
