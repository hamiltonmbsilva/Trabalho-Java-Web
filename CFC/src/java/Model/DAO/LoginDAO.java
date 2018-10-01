/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.Login;
import Model.Classe.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    
    public List<Usuario> getAll() {
        EntityManager em = null;
        try {
            em = open();

            Query q = em.createNamedQuery("Usuario.findAll");

            return q.getResultList();
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public List<Usuario> getIdlogin(Login lo) {
        EntityManager em = null;
        try {
            em = open();

            Login l = em.getReference(Login.class,lo.getIdlogin());
            
            return l.getUsuarioList();
            
        } finally {
            if (em!= null){
                em.close();
            }
        }

    }    
    
    
    public List<Usuario> getIdloginByUsuario(Login lo, String cpf, String rg, String ativado,
            Date dataNascimento, String nota, String qtdaulaTeorica, String qtdaulaPratica) {
        
        EntityManager em = null;
        try {
            em = open();
            
            String jpql = "select distinct lo.usuarioList from Login lo inner join lo.usuarioList u "
                    + "where lo = :log and (u.cpf = :cpf or u.rg = :rg or"
                    + " u.ativado = :ativado or u.dataNascimento = :dataNascimento or u.nota =:nota"
                    + "or u.qtdaulaTeorica =: qtdaulaTeorica or u.qtdaulaPratica =: qtdaulaPratica) ";
            
            Query q = em.createQuery(jpql);
             q.setParameter("log", lo);
             q.setParameter("cpf", cpf);
             q.setParameter("rg", rg);
             q.setParameter("ativado", ativado);
             q.setParameter("dataNascimento", dataNascimento);
             q.setParameter("nota", nota);
             q.setParameter("qtdaulaTeorica", qtdaulaTeorica);
             q.setParameter("qtdaulaPratica", qtdaulaPratica);
              
              
            List<Usuario> u =  q.getResultList();
            return u;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }

    }
    
    public Login get(String idlogin) {
        EntityManager em = null;
        try {
            em = open();
        Login log = em.getReference(Login.class, idlogin);
            
            return log;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }
    }

    public void edit(Login log) {
    EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.merge(log);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }
}
