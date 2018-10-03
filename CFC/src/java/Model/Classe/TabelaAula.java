/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Classe;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hamil
 */
@Entity
@Table(name = "tabela_aula", catalog = "db_cfcweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelaAula.findAll", query = "SELECT t FROM TabelaAula t")
    , @NamedQuery(name = "TabelaAula.findByIdtabelaAula", query = "SELECT t FROM TabelaAula t WHERE t.idtabelaAula = :idtabelaAula")
    , @NamedQuery(name = "TabelaAula.findByAulaTeorica", query = "SELECT t FROM TabelaAula t WHERE t.aulaTeorica = :aulaTeorica")
    , @NamedQuery(name = "TabelaAula.findByAulaPratica", query = "SELECT t FROM TabelaAula t WHERE t.aulaPratica = :aulaPratica")
    , @NamedQuery(name = "TabelaAula.findByMarcarSimulado", query = "SELECT t FROM TabelaAula t WHERE t.marcarSimulado = :marcarSimulado")
    , @NamedQuery(name = "TabelaAula.findByDataTeorica", query = "SELECT t FROM TabelaAula t WHERE t.dataTeorica = :dataTeorica")
    , @NamedQuery(name = "TabelaAula.findByDataPratica", query = "SELECT t FROM TabelaAula t WHERE t.dataPratica = :dataPratica")})
public class TabelaAula implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtabela_aula", nullable = false)
    private Integer idtabelaAula;
    @Column(name = "aula_teorica", length = 20)
    private String aulaTeorica;
    @Column(name = "aula_pratica", length = 20)
    private String aulaPratica;
    @Column(name = "marcar_simulado", length = 20)
    private String marcarSimulado;
    @Column(name = "data_teorica")
    @Temporal(TemporalType.DATE)
    private Date dataTeorica;
    @Column(name = "data_pratica")
    @Temporal(TemporalType.DATE)
    private Date dataPratica;
    @JoinColumn(name = "professor_idprofessor", referencedColumnName = "idprofessor")
    @ManyToOne
    private Professor professorIdprofessor;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario")
    @ManyToOne
    private Usuario usuarioIdusuario;

    public TabelaAula() {
        this.aulaPratica = aulaPratica;
    }

    public TabelaAula(String aulaTeorica, String aulaPratica) {
        this.aulaTeorica = aulaTeorica;
        this.aulaPratica = aulaPratica;
    }

    public TabelaAula(String aulaTeorica) {
        this.aulaTeorica = aulaTeorica;
        
    }

    public TabelaAula(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    } 
    
    public TabelaAula(Integer idtabelaAula) {
        this.idtabelaAula = idtabelaAula;
    }

    public Integer getIdtabelaAula() {
        return idtabelaAula;
    }

    public void setIdtabelaAula(Integer idtabelaAula) {
        this.idtabelaAula = idtabelaAula;
    }

    public String getAulaTeorica() {
        return aulaTeorica;
    }

    public void setAulaTeorica(String aulaTeorica) {
        this.aulaTeorica = aulaTeorica;
    }

    public String getAulaPratica() {
        return aulaPratica;
    }

    public void setAulaPratica(String aulaPratica) {
        this.aulaPratica = aulaPratica;
    }

    public String getMarcarSimulado() {
        return marcarSimulado;
    }

    public void setMarcarSimulado(String marcarSimulado) {
        this.marcarSimulado = marcarSimulado;
    }

    public Date getDataTeorica() {
        return dataTeorica;
    }

    public void setDataTeorica(Date dataTeorica) {
        this.dataTeorica = dataTeorica;
    }

    public Date getDataPratica() {
        return dataPratica;
    }

    public void setDataPratica(Date dataPratica) {
        this.dataPratica = dataPratica;
    }

    public Professor getProfessorIdprofessor() {
        return professorIdprofessor;
    }

    public void setProfessorIdprofessor(Professor professorIdprofessor) {
        this.professorIdprofessor = professorIdprofessor;
    }

    public Usuario getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(Usuario usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtabelaAula != null ? idtabelaAula.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaAula)) {
            return false;
        }
        TabelaAula other = (TabelaAula) object;
        if ((this.idtabelaAula == null && other.idtabelaAula != null) || (this.idtabelaAula != null && !this.idtabelaAula.equals(other.idtabelaAula))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Classe.TabelaAula[ idtabelaAula=" + idtabelaAula + " ]";
    }
    
}
