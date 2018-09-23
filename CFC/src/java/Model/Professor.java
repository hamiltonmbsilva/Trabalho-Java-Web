/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hamil
 */
@Entity
@Table(catalog = "db_cfcweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p")
    , @NamedQuery(name = "Professor.findByIdprofessor", query = "SELECT p FROM Professor p WHERE p.professorPK.idprofessor = :idprofessor")
    , @NamedQuery(name = "Professor.findByLoginIdlogin", query = "SELECT p FROM Professor p WHERE p.professorPK.loginIdlogin = :loginIdlogin")
    , @NamedQuery(name = "Professor.findByUsuarioIdusuario", query = "SELECT p FROM Professor p WHERE p.professorPK.usuarioIdusuario = :usuarioIdusuario")})
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfessorPK professorPK;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Login login;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor")
    private List<TabelaAula> tabelaAulaList;

    public Professor() {
    }

    public Professor(ProfessorPK professorPK) {
        this.professorPK = professorPK;
    }

    public Professor(int idprofessor, int loginIdlogin, int usuarioIdusuario) {
        this.professorPK = new ProfessorPK(idprofessor, loginIdlogin, usuarioIdusuario);
    }

    public ProfessorPK getProfessorPK() {
        return professorPK;
    }

    public void setProfessorPK(ProfessorPK professorPK) {
        this.professorPK = professorPK;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @XmlTransient
    public List<TabelaAula> getTabelaAulaList() {
        return tabelaAulaList;
    }

    public void setTabelaAulaList(List<TabelaAula> tabelaAulaList) {
        this.tabelaAulaList = tabelaAulaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (professorPK != null ? professorPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.professorPK == null && other.professorPK != null) || (this.professorPK != null && !this.professorPK.equals(other.professorPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Professor[ professorPK=" + professorPK + " ]";
    }
    
}
