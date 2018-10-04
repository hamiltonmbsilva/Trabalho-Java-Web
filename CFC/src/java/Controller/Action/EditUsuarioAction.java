/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.Login;
import Model.DAO.UsuarioDAO;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class EditUsuarioAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Login a = (Login) request.getSession().getAttribute("user");
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
         
         try {
            List listaUsuario = usuarioDAO.getAllUsuario();
            request.setAttribute("editarUsuario", listaUsuario);
            RequestDispatcher rd = request.getRequestDispatcher("templateAreaUsuario.jsp?page=editarUsuario");
            rd.forward(request, response);
         
        } catch (Exception e) {
            //Logger.getLogger(listaAula.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
}
