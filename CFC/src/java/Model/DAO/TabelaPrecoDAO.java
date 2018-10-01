/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.TabelaPreco;
import javax.persistence.EntityManager;

/**
 *
 * @author Hamil
 */
public class TabelaPrecoDAO extends DaoGeneric{
    
    public void save(TabelaPreco tab) {
            
            EntityManager em = null;
            try {
                em = open();
                em.getTransaction().begin();
                em.persist(tab);
                em.getTransaction().commit();
            } finally {
                if(em != null){
                    em.close();
                }
            }
        }    
    

    public TabelaPreco get(int idtabelaPreco) {
        EntityManager em = null;
        try {
            em = open();

            return  em.getReference(TabelaPreco.class, idtabelaPreco);
        } catch (Exception e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    public void edit(TabelaPreco tab) {
    EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.merge(tab);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }
    
        

    
}
