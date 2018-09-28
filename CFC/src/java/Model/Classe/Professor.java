/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Classe;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    , @NamedQuery(name = "Professor.findByIdprofessor", query = "SELECT p FROM Professor p WHERE p.idprofessor = :idprofessor")})
public class Professor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idprofessor;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin", nullable = false)
    @ManyToOne(optional = false)
    private Login loginIdlogin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professorIdprofessor")
    private List<TabelaAula> tabelaAulaList;

    public Professor() {
    }

    public Professor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public Integer getIdprofessor() {
        return idprofessor;
    }

    public void setIdprofessor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public Login getLoginIdlogin() {
        return loginIdlogin;
    }

    public void setLoginIdlogin(Login loginIdlogin) {
        this.loginIdlogin = loginIdlogin;
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
        hash += (idprofessor != null ? idprofessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idprofessor == null && other.idprofessor != null) || (this.idprofessor != null && !this.idprofessor.equals(other.idprofessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Classe.Professor[ idprofessor=" + idprofessor + " ]";
    }
    
}
