/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.Usuario;
import Model.DAO.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class EditNotaAlunoAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
       Usuario usu= new Usuario(
               Integer.parseInt(request.getParameter("idusuario")),     
               request.getParameter("email"),               
                request.getParameter("cpf"),
               request.getParameter("rg"),
                request.getParameter("ativado"),
                request.getParameter("dataNascimento"),
                request.getParameter("nota"),
               request.getParameter("qtd_aulaTeorica"),
               request.getParameter("qtd_aulaPratica") 
                );
        new UsuarioDAO().save(usu);
        //usu.setLoginIdlogin(log);
                
        request.setAttribute("info", "Editado com Sucesso");
        request.setAttribute("jsAlertAtivo", true);
      
        new AreaAlunoAction().executar(request, response); 
    }
    
}
