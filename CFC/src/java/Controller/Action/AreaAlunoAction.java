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
public class AreaAlunoAction implements  ICommander{   
   

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        RequestDispatcher rd = request.getRequestDispatcher("templateAreaUsuario.jsp?pages=templateAreaUsuario");
         rd.forward(request, response);
    }
}
