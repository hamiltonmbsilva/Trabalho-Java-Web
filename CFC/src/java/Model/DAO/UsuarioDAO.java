/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Classe.Endereco;
import Model.Classe.TabelaAula;
import Model.Classe.TabelaPreco;
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
    
    public List<Endereco> getIdusuario(Usuario u) {
        EntityManager em = null;
        try {
            em = open();

            Usuario usu = em.getReference(Usuario.class,u.getIdusuario());
            
            return usu.getEnderecoList();
            
        } finally {
            if (em!= null){
                em.close();
            }
        }

    }
    
    public List<TabelaAula> getIdusuarioByTabelaAula(Usuario usu, String aula_teorica, String aula_pratica,
            Date data_teorica, Date data_pratica) {
        EntityManager em = null;
        try {
            em = open();
            
            String jpql = "select distinct usu.TabelaAulaList from Usuario usu inner join usu.TabelaAulaList t "
                    + "where usu = :log and (t.aula_teorica = :aula_teorica or t.aula_pratica = :aula_pratica or"
                    + " t.data_teorica = :data_teorica or data_pratica = :data_pratica) ";
            
            Query q = em.createQuery(jpql);
             q.setParameter("log", usu);
             q.setParameter("aula_teorica", aula_teorica);
             q.setParameter("aula_pratica", aula_pratica);
             q.setParameter("data_teorica", data_teorica);
             q.setParameter("data_pratica", data_pratica);
              
            List<TabelaAula> t =  q.getResultList();
            return t;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }

    }
    
    public List<TabelaPreco> getIdusuarioOrTabelaPreco(Usuario u, String valor, String numeroParcela, String id ) {
        EntityManager em = null;
        try {
            em = open();

           String jpql = "select distinct u.tabelaPrecoList from Usuario u inner join u.tabelaPrecoList t "
                    + "where u = :log and (t.valor = :valor or t.numeroParcela = :numeroParcela or t.idtabelaPreco = :idd ) ";

            Query q = em.createQuery(jpql);
            q.setParameter("log", u);
            q.setParameter("valor", Integer.parseInt(valor));
            q.setParameter("numeroParcela", Integer.parseInt(numeroParcela));
            q.setParameter("idd", Integer.parseInt(id));
            
            List<TabelaPreco> t =  q.getResultList();
            return t;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }

    }
    
    public Usuario get(String idusuario) {
        EntityManager em = null;
        try {
            em = open();

            Usuario usuario = em.getReference(Usuario.class, idusuario);
            
            return usuario;
            
        } finally {
            if (em!= null){
                em.close();
            }
        }
    }
    
    public void edit(Usuario usu) {
    EntityManager em = null;
        try {
            em = open();
            em.getTransaction().begin();
            em.merge(usu);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }    
    }
    
  
}
