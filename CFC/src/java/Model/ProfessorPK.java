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
public class ProfessorPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    private int idprofessor;
    @Basic(optional = false)
    @Column(name = "login_idlogin", nullable = false)
    private int loginIdlogin;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario", nullable = false)
    private int usuarioIdusuario;

    public ProfessorPK() {
    }

    public ProfessorPK(int idprofessor, int loginIdlogin, int usuarioIdusuario) {
        this.idprofessor = idprofessor;
        this.loginIdlogin = loginIdlogin;
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getIdprofessor() {
        return idprofessor;
    }

    public void setIdprofessor(int idprofessor) {
        this.idprofessor = idprofessor;
    }

    public int getLoginIdlogin() {
        return loginIdlogin;
    }

    public void setLoginIdlogin(int loginIdlogin) {
        this.loginIdlogin = loginIdlogin;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idprofessor;
        hash += (int) loginIdlogin;
        hash += (int) usuarioIdusuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfessorPK)) {
            return false;
        }
        ProfessorPK other = (ProfessorPK) object;
        if (this.idprofessor != other.idprofessor) {
            return false;
        }
        if (this.loginIdlogin != other.loginIdlogin) {
            return false;
        }
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ProfessorPK[ idprofessor=" + idprofessor + ", loginIdlogin=" + loginIdlogin + ", usuarioIdusuario=" + usuarioIdusuario + " ]";
    }
    
}
