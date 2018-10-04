/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class ValidarPermissaoAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
         if (request.getSession().getAttribute("user") == null) {
            request.setAttribute("info", "Acesso Negado, efetue o login");
            RequestDispatcher rd = request.getRequestDispatcher("templateAreaUsuario.jsp?page=login");
            rd.forward(request, response);
        }
    }
    
}
