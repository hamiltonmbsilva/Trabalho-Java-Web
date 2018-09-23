/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
    , @NamedQuery(name = "Atendente.findByIdatendente", query = "SELECT a FROM Atendente a WHERE a.atendentePK.idatendente = :idatendente")
    , @NamedQuery(name = "Atendente.findByLoginIdlogin", query = "SELECT a FROM Atendente a WHERE a.atendentePK.loginIdlogin = :loginIdlogin")})
public class Atendente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AtendentePK atendentePK;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Login login;

    public Atendente() {
    }

    public Atendente(AtendentePK atendentePK) {
        this.atendentePK = atendentePK;
    }

    public Atendente(int idatendente, int loginIdlogin) {
        this.atendentePK = new AtendentePK(idatendente, loginIdlogin);
    }

    public AtendentePK getAtendentePK() {
        return atendentePK;
    }

    public void setAtendentePK(AtendentePK atendentePK) {
        this.atendentePK = atendentePK;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (atendentePK != null ? atendentePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atendente)) {
            return false;
        }
        Atendente other = (Atendente) object;
        if ((this.atendentePK == null && other.atendentePK != null) || (this.atendentePK != null && !this.atendentePK.equals(other.atendentePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Atendente[ atendentePK=" + atendentePK + " ]";
    }
    
}
