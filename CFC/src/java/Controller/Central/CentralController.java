/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Central;

import Controller.Action.AreaAlunoAction;
import Controller.Action.CadAulaPratica;
import Controller.Action.CadAulaTeoricaAction;
import Controller.Action.CadUsuarioViewAction;
import Controller.Action.EditNotaAlunoAction;
import Controller.Action.EditUsuarioAction;
import Controller.Action.HomeViewAction;
import Controller.Action.LoginViewAction;
import Controller.Action.LogoutAction;
import Controller.Action.MarcarAulasAction;
import Controller.Action.SalvaAulasMarcadasAction;
import Controller.Action.SaveAulaPraticaAction;
import Controller.Action.SaveAulaTeoricaAction;
import Controller.Action.SaveUsuarioAction;
import Controller.Action.SaveUsuarioEdtAction;
import Controller.Action.SaveUsuarioNotaAction;
import Controller.Action.ValidaLoginAction;
import Controller.Action.ValidarPermissaoAction;
import Controlles.Actions.Faces.ICommander;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
@WebServlet(name = "CentralController", urlPatterns = {"/control"})
public class CentralController extends HttpServlet {

    
     static HashMap<String, ICommander> tabela = new HashMap<>();
    
    static{
        //sempre que for num chama essa view
        tabela.put(null,new HomeViewAction());
        tabela.put("login", new LoginViewAction());
        tabela.put("validaLogin", new ValidaLoginAction());
        tabela.put("logout", new LogoutAction());
        tabela.put("cadUsuario", new CadUsuarioViewAction());
        tabela.put("saveUsuario", new SaveUsuarioAction());
        tabela.put("areaAluno", new AreaAlunoAction());
        tabela.put("marcarAulasSecured", new MarcarAulasAction());
        tabela.put("saveAula", new SaveAulaTeoricaAction());
        tabela.put("cadAula", new CadAulaTeoricaAction());
        tabela.put("saveAulaPratica", new SaveAulaPraticaAction());
        tabela.put("cadAulaPratica", new CadAulaPratica());
        tabela.put("editUsuarioNota", new EditNotaAlunoAction());
        tabela.put("editUsuario", new EditUsuarioAction());
        tabela.put("aulaMarcar", new SalvaAulasMarcadasAction());
        tabela.put("salveUsuarioEdit", new SaveUsuarioEdtAction());
        tabela.put("salveUsuarioNota", new SaveUsuarioNotaAction());
        tabela.put("validarPermissao", new ValidarPermissaoAction());
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //recebendo um parametro, tanto faz o nome
            String action = request.getParameter("ac");       
            try {
                tabela.get(action).executar(request, response);
                
            } catch (Exception ex) {
                response.getWriter().print("<h1>ERRO: </h1>" +ex.getMessage()+"</h2>");
                
            }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
