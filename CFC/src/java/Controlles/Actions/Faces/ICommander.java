/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlles.Actions.Faces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hamil
 */
public interface ICommander {
    
     public void executar(HttpServletRequest request, 
            HttpServletResponse response) throws Exception;
}
