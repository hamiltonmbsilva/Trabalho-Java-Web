/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.Login;
import Model.DAO.UsuarioDAO;
import Model.Classe.Usuario;
import Model.DAO.LoginDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class ValidaLoginAction  implements  ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");
        
        Login a = new LoginDAO().validaLogin(login,senha);
        
        if(a == null){
            request.setAttribute("info", "Login e senha Incorreta");
            new LoginViewAction().executar(request, response);
        }else{
            
            request.getSession().setAttribute("user", a);
            new AreaAlunoAction().executar(request, response);
        }
    
    }
    
}
