/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.Atendente;
import javax.persistence.EntityManager;

/**
 *
 * @author Hamil
 */
public class AtendenteDAO extends DaoGeneric{
    
    public void save(Atendente at) {
            
            EntityManager em = null;
            try {
                em = open();
                em.getTransaction().begin();
                em.persist(at);
                em.getTransaction().commit();
            } finally {
                if(em != null){
                    em.close();
                }
            }
        }

    

    public Atendente get(int idatendente) {
        EntityManager em = null;
        try {
            em = open();

            return  em.getReference(Atendente.class, idatendente);
        } catch (Exception e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    public void edit(Atendente at) {
    EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.merge(at);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }
    
    
}
