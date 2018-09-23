/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Hamil
 */
@Embeddable
public class AtendentePK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    private int idatendente;
    @Basic(optional = false)
    @Column(name = "login_idlogin", nullable = false)
    private int loginIdlogin;

    public AtendentePK() {
    }

    public AtendentePK(int idatendente, int loginIdlogin) {
        this.idatendente = idatendente;
        this.loginIdlogin = loginIdlogin;
    }

    public int getIdatendente() {
        return idatendente;
    }

    public void setIdatendente(int idatendente) {
        this.idatendente = idatendente;
    }

    public int getLoginIdlogin() {
        return loginIdlogin;
    }

    public void setLoginIdlogin(int loginIdlogin) {
        this.loginIdlogin = loginIdlogin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idatendente;
        hash += (int) loginIdlogin;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AtendentePK)) {
            return false;
        }
        AtendentePK other = (AtendentePK) object;
        if (this.idatendente != other.idatendente) {
            return false;
        }
        if (this.loginIdlogin != other.loginIdlogin) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.AtendentePK[ idatendente=" + idatendente + ", loginIdlogin=" + loginIdlogin + " ]";
    }
    
}
