/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.Endereco;
import Model.Classe.Login;
import Model.Classe.TabelaPreco;
import Model.Classe.Usuario;
import Model.DAO.EnderecoDAO;
import Model.DAO.LoginDAO;
import Model.DAO.TabelaPrecoDAO;
import Model.DAO.UsuarioDAO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class SaveUsuarioEdtAction implements ICommander{

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
             
             TabelaPreco tp = new TabelaPreco(
             
                  Integer.parseInt(request.getParameter("valor")),
                   Integer.parseInt(request.getParameter("numeroParcela"))  
             );
             
                
                
                new UsuarioDAO().edit(usu);
                new LoginDAO().edit(log);  
                usu.getEnderecoList().add(end);
                end.setUsuarioIdusuario(usu);
                new EnderecoDAO().edit(end);  
                new TabelaPrecoDAO().save(tp);
                usu.setLoginIdlogin(log);
                //end.setUsuarioIdusuario(usu);
                tp.setUsuarioIdusuario(usu);
               
                
                //new UsuarioDAO().save();
                request.setAttribute("info", "Salvo com Sucesso");
                request.setAttribute("jsAlertAtivo", true);
      
               new EditUsuarioAction().executar(request, response); 
    }
    
}
