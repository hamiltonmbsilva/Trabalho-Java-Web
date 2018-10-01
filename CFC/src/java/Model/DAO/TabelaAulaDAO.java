/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.TabelaAula;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Hamil
 */
public class TabelaAulaDAO extends DaoGeneric{
    
    public void save(TabelaAula tab) {
            
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

    
    public List<TabelaAula> getAll() {
        EntityManager em = null;
        try {
            em = open();

            Query q = em.createNamedQuery("TabelaAula.findAll");

            return q.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public TabelaAula get(int idtabela_aula) {
        EntityManager em = null;
        try {
            em = open();

            return  em.getReference(TabelaAula.class, idtabela_aula);
        } catch (Exception e) {
            return null;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    

    public void edit(TabelaAula tab) {
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
