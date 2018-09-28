/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.Login;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 *
 * @author Hamil
 */
public class LoginDAO extends DaoGeneric {
    
    public void save(Login login) {
        
        EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.persist(login);
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    public Login validaLogin(String login, String senha) {
        
        EntityManager em = null;
        try {
            em = open();
            String jpql = "SELECT l FROM Login l "
                    + "WHERE l.login = :log and l.senha = :sen ";

                    
                    //"select distinct u.idlogin from Usuario u inner join u.idlogin l "
                    //+ "where u = :log and l.senha = :sen ";
            
            Query q = em.createQuery(jpql);
            q.setParameter("log", login);
            q.setParameter("sen", senha);
            
            Login l = (Login) q.getSingleResult();
            
            return l;
            
        }catch(NoResultException e){
            return null;
        }catch(NonUniqueResultException e){
            return null;
        }
        finally {
             if(em != null){
                em.close();
            }
        }
    }
}
