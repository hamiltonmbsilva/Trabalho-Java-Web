/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Classe;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hamil
 */
@Entity
@Table(catalog = "db_cfcweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Atendente.findAll", query = "SELECT a FROM Atendente a")
    , @NamedQuery(name = "Atendente.findByIdatendente", query = "SELECT a FROM Atendente a WHERE a.idatendente = :idatendente")})
public class Atendente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idatendente;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin", nullable = false)
    @ManyToOne(optional = false)
    private Login loginIdlogin;

    public Atendente() {
    }

    public Atendente(Integer idatendente) {
        this.idatendente = idatendente;
    }

    public Integer getIdatendente() {
        return idatendente;
    }

    public void setIdatendente(Integer idatendente) {
        this.idatendente = idatendente;
    }

    public Login getLoginIdlogin() {
        return loginIdlogin;
    }

    public void setLoginIdlogin(Login loginIdlogin) {
        this.loginIdlogin = loginIdlogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idatendente != null ? idatendente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atendente)) {
            return false;
        }
        Atendente other = (Atendente) object;
        if ((this.idatendente == null && other.idatendente != null) || (this.idatendente != null && !this.idatendente.equals(other.idatendente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Classe.Atendente[ idatendente=" + idatendente + " ]";
    }
    
}
