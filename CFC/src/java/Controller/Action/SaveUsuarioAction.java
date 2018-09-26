/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class SaveUsuarioAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Usuario usu= new Usuario(
               
                request.getParameter("email"),               
                request.getParameter("cpf"),
                request.getParameter("rg"),
                request.getParameter("ativado"),
                request.getParameter("nota"),
                request.getParameter("endereco_idendereco"),
                request.getParameter("login_idlogin"),
                request.getParameter("tabela_preco_idtabela_preco"),
                request.getParameter("qtd_aulaTeorica"),
                request.getParameter("qtd_aulaPratica")              
                  );
                
                usu.setDataNascimento(sdf.parse(request.getParameter("dataNascimento")));
                
                new UsuarioDAO().save(usu);
                
                request.setAttribute("info", "Salvo com Sucesso");
                request.setAttribute("jsAlertAtivo", true);
      
               new LoginViewAction().executar(request, response); 
    }
    
}
