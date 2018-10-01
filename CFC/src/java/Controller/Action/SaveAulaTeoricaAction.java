/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Action;

import Controlles.Actions.Faces.ICommander;
import Model.Classe.TabelaAula;
import Model.DAO.TabelaAulaDAO;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public class SaveAulaTeoricaAction implements ICommander{

    @Override
    public void executar(HttpServletRequest request, HttpServletResponse response) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
       TabelaAula tab = new TabelaAula(   
                request.getParameter("aulaTeorica")               
                //request.getParameter("aulaPratica")
                );
       tab.setDataTeorica( sdf.parse(request.getParameter("dataAulaTeorica")));
       //
       
       
//       TabelaAula tab1 = new TabelaAula(
//               request.getParameter("aulaPratica")
//       );
       //tab.setDataPratica(sdf.parse(request.getParameter("dataAulaPratica"))); 
        
    
//    
          new TabelaAulaDAO().save(tab);
//           new TabelaAulaDAO().save(tab1);
          
          request.setAttribute("info", "Salvo com Sucesso");
          request.setAttribute("jsAlertAtivo", true);
      
          new AreaAlunoAction().executar(request, response); 
    }
}
