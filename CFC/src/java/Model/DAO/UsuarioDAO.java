/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

/**
 *
 * @author Hamil
 */
public class UsuarioDAO extends DaoGeneric{
    
    public void save(Usuario usu) {
        
        EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.persist(usu);
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    public Usuario validaLogin(String login, String senha) {
        
        EntityManager em = null;
        try {
            em = open();
            String jpql = "SELECT u FROM Usuario u "
                    + "where u.login = :log and u.senha = :sen ";  
            
            Query q = em.createQuery(jpql);
            q.setParameter("log", login);
            q.setParameter("sen", senha);
            
            Usuario a = (Usuario) q.getSingleResult();
            
            return a;
            
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
    
    //Buscando a lista de todas a matriculas
    public List<Usuario> getUsuarioPK(Usuario a) {
        EntityManager em = null;
        try {
            em = open();
            
           Usuario usuario = em.getReference(Usuario.class, a.getUsuarioPK());
            //esta passando o paramentro para a função
           
            
            return (List<Usuario>) usuario.getUsuarioPK();
            
        } finally {
            if(em!=null){
                em.close();
            }
        }
    }
    
}
