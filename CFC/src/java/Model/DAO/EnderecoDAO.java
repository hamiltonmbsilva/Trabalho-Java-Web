/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.Endereco;
import javax.persistence.EntityManager;

/**
 *
 * @author Hamil
 */
public class EnderecoDAO extends DaoGeneric{
    
    public void save(Endereco end) {
        
        EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.persist(end);
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    public Endereco get(String idendereco) {
        EntityManager em = null;
        try {
            em = open();
        Endereco end = em.getReference(Endereco.class, idendereco);
            
            return end;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }
    }

    public void edit(Endereco end) {
    EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.merge(end);
            em.getTransaction().commit();
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
//            String jpql = "SELECT u FROM Usuario u WHERE "
//                    + "u.usuarioPK.loginIdlogin = :loginIdlogin and "
//                    + "u.usuarioPk.login = :log and u.usuarioPk.senha = : sen"; 
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
//    
    //Buscando a lista de todas a matriculas
//    public List<Usuario> getUsuarioPK(Usuario a) {
//        EntityManager em = null;
//        try {
//            em = open();
//            
//           Usuario usuario = em.getReference(Usuario.class, a.getUsuarioPK());
//            //esta passando o paramentro para a função
//           
//            
//            return (List<Usuario>) usuario.getUsuarioPK();
//            
//        } finally {
//            if(em!=null){
//                em.close();
//            }
//        }
//    }
    
    
}
