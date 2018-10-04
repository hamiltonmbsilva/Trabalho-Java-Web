/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.TabelaAula;
import Model.Classe.Usuario;
import Model.DAO.TabelaAulaDAO;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class SalvaAulasMarcadasAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        Usuario pessoa = new Usuario( Integer.parseInt(request.getParameter("idusuario")));
        
        
       TabelaAula tab = new TabelaAula( 
              
                Integer.parseInt(request.getParameter("idTabela")),
                pessoa                
                );
       //tab.setDataTeorica( sdf.parse(request.getParameter("dataAulaTeorica")));
       //tab.setDataPratica(sdf.parse(request.getParameter("dataAulaPratica"))); 
       
        new TabelaAulaDAO().edit(tab);
//           new TabelaAulaDAO().save(tab1);
          
          request.setAttribute("info", "Salvo com Sucesso");
          request.setAttribute("jsAlertAtivo", true);
      
          new MarcarAulasAction().executar(request, response);
    
    }
    
    
}
