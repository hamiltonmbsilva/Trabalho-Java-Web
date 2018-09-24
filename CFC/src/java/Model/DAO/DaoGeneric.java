/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Hamil
 */
public class DaoGeneric {
    
    public EntityManager open() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CFCPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
}
