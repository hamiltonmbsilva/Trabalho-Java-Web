/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.DAO.EnderecoDAO;
import Model.DAO.LoginDAO;
import Model.DAO.UsuarioDAO;
import Model.Classe.Endereco;
import Model.Classe.Login;
import Model.Classe.Usuario;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
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
        
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Usuario usu= new Usuario(
                    
                request.getParameter("email"),               
                request.getParameter("cpf"),
                request.getParameter("rg"),
                request.getParameter("ativado"),
                request.getParameter("dataNascimento"),
                request.getParameter("nota"),
                request.getParameter("qtd_aulaTeorica"),
                request.getParameter("qtd_aulaPratica")  
//                request.getParameter("endereco_idendereco"),
//                request.getParameter("login_idlogin"),
//                request.getParameter("tabela_preco_idtabela_preco")
                           
                  );
            //usu.setUsuarioPK(new UsuarioPK);
            //usu.setDataNascimento(sdf.parse(request.getParameter("dataNascimento")));
        
            Endereco end= new Endereco(
               
                //Integer.parseInt(request.getParameter("idendereco")),
                request.getParameter("rua"),               
                request.getParameter("complemento"),
                request.getParameter("numero"),
                request.getParameter("bairro"),
                request.getParameter("cidade"),
                request.getParameter("estado")
                            
                  );
            
             Login log= new Login(
               
                //request.getParameter("status"),               
                request.getParameter("login"),
                request.getParameter("senha"),
                request.getParameter("nome")
                //request.getParameter("painel")
                            
                  );
             
                
                
                new UsuarioDAO().save(usu);
                new LoginDAO().save(log);  
                usu.getEnderecoList().add(end);
                end.setUsuarioIdusuario(usu);
                new EnderecoDAO().save(end);  
                
                usu.setLoginIdlogin(log);
                //end.setUsuarioIdusuario(usu);
                
               
                
                //new UsuarioDAO().save();
                request.setAttribute("info", "Salvo com Sucesso");
                request.setAttribute("jsAlertAtivo", true);
      
               new LoginViewAction().executar(request, response); 
    }
}
//usu.getEnderecoList().add(end);
//end.setUsuarioIdusuario(usu);