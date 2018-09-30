/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.TabelaAula;
import Model.Classe.Usuario;
import java.util.ArrayList;
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
    
//    public Usuario validaLogin(String login, String senha) {
//        
//        EntityManager em = null;
//        try {
//            em = open();
//            String jpql = "SELECT l FROM Login l "
//                    + "WHERE l.idlogin = :log and l.senha = :sen ";
//
//                    
//                    //"select distinct u.idlogin from Usuario u inner join u.idlogin l "
//                    //+ "where u = :log and l.senha = :sen ";
//            
//            Query q = em.createQuery(jpql);
//            q.setParameter("log", login);
//            q.setParameter("sen", senha);
//            
//            Usuario a = (Usuario) q.getSingleResult();
//            
//            return a;
//            
//        }catch(NoResultException e){
//            return null;
//        }catch(NonUniqueResultException e){
//            return null;
//        }
//        finally {
//             if(em != null){
//                em.close();
//            }
//        }
//    }
    
    //Buscando a lista de todas a matriculas
//    public List<Usuario> getIdusuario(Usuario a) {
//        EntityManager em = null;
//        try {
//            em = open();
//            
//           Usuario usuario = em.getReference(Usuario.class, a.getIdusuario());
//            //esta passando o paramentro para a função
//           
//            
//            return (List<Usuario>) usuario.;
//            
//        } finally {
//            if(em!=null){
//                em.close();
//            }
//        }
//    }
    
}
