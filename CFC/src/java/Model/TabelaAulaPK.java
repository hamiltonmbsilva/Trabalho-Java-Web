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
public class TabelaAulaPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idtabela_aula", nullable = false)
    private int idtabelaAula;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario", nullable = false)
    private int usuarioIdusuario;
    @Basic(optional = false)
    @Column(name = "professor_idprofessor", nullable = false)
    private int professorIdprofessor;
    @Basic(optional = false)
    @Column(name = "professor_login_idlogin", nullable = false)
    private int professorLoginIdlogin;
    @Basic(optional = false)
    @Column(name = "professor_usuario_idusuario", nullable = false)
    private int professorUsuarioIdusuario;

    public TabelaAulaPK() {
    }

    public TabelaAulaPK(int idtabelaAula, int usuarioIdusuario, int professorIdprofessor, int professorLoginIdlogin, int professorUsuarioIdusuario) {
        this.idtabelaAula = idtabelaAula;
        this.usuarioIdusuario = usuarioIdusuario;
        this.professorIdprofessor = professorIdprofessor;
        this.professorLoginIdlogin = professorLoginIdlogin;
        this.professorUsuarioIdusuario = professorUsuarioIdusuario;
    }

    public int getIdtabelaAula() {
        return idtabelaAula;
    }

    public void setIdtabelaAula(int idtabelaAula) {
        this.idtabelaAula = idtabelaAula;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public int getProfessorIdprofessor() {
        return professorIdprofessor;
    }

    public void setProfessorIdprofessor(int professorIdprofessor) {
        this.professorIdprofessor = professorIdprofessor;
    }

    public int getProfessorLoginIdlogin() {
        return professorLoginIdlogin;
    }

    public void setProfessorLoginIdlogin(int professorLoginIdlogin) {
        this.professorLoginIdlogin = professorLoginIdlogin;
    }

    public int getProfessorUsuarioIdusuario() {
        return professorUsuarioIdusuario;
    }

    public void setProfessorUsuarioIdusuario(int professorUsuarioIdusuario) {
        this.professorUsuarioIdusuario = professorUsuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idtabelaAula;
        hash += (int) usuarioIdusuario;
        hash += (int) professorIdprofessor;
        hash += (int) professorLoginIdlogin;
        hash += (int) professorUsuarioIdusuario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaAulaPK)) {
            return false;
        }
        TabelaAulaPK other = (TabelaAulaPK) object;
        if (this.idtabelaAula != other.idtabelaAula) {
            return false;
        }
        if (this.usuarioIdusuario != other.usuarioIdusuario) {
            return false;
        }
        if (this.professorIdprofessor != other.professorIdprofessor) {
            return false;
        }
        if (this.professorLoginIdlogin != other.professorLoginIdlogin) {
            return false;
        }
        if (this.professorUsuarioIdusuario != other.professorUsuarioIdusuario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TabelaAulaPK[ idtabelaAula=" + idtabelaAula + ", usuarioIdusuario=" + usuarioIdusuario + ", professorIdprofessor=" + professorIdprofessor + ", professorLoginIdlogin=" + professorLoginIdlogin + ", professorUsuarioIdusuario=" + professorUsuarioIdusuario + " ]";
    }
    
}
