/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
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
@Table(name = "tabela_aula", catalog = "db_cfcweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelaAula.findAll", query = "SELECT t FROM TabelaAula t")
    , @NamedQuery(name = "TabelaAula.findByIdtabelaAula", query = "SELECT t FROM TabelaAula t WHERE t.tabelaAulaPK.idtabelaAula = :idtabelaAula")
    , @NamedQuery(name = "TabelaAula.findByAulaTeorica", query = "SELECT t FROM TabelaAula t WHERE t.aulaTeorica = :aulaTeorica")
    , @NamedQuery(name = "TabelaAula.findByAulaPratica", query = "SELECT t FROM TabelaAula t WHERE t.aulaPratica = :aulaPratica")
    , @NamedQuery(name = "TabelaAula.findByMarcarSimulado", query = "SELECT t FROM TabelaAula t WHERE t.marcarSimulado = :marcarSimulado")
    , @NamedQuery(name = "TabelaAula.findByAulaDada", query = "SELECT t FROM TabelaAula t WHERE t.aulaDada = :aulaDada")
    , @NamedQuery(name = "TabelaAula.findByUsuarioIdusuario", query = "SELECT t FROM TabelaAula t WHERE t.tabelaAulaPK.usuarioIdusuario = :usuarioIdusuario")
    , @NamedQuery(name = "TabelaAula.findByProfessorIdprofessor", query = "SELECT t FROM TabelaAula t WHERE t.tabelaAulaPK.professorIdprofessor = :professorIdprofessor")
    , @NamedQuery(name = "TabelaAula.findByProfessorLoginIdlogin", query = "SELECT t FROM TabelaAula t WHERE t.tabelaAulaPK.professorLoginIdlogin = :professorLoginIdlogin")
    , @NamedQuery(name = "TabelaAula.findByProfessorUsuarioIdusuario", query = "SELECT t FROM TabelaAula t WHERE t.tabelaAulaPK.professorUsuarioIdusuario = :professorUsuarioIdusuario")})
public class TabelaAula implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TabelaAulaPK tabelaAulaPK;
    @Basic(optional = false)
    @Column(name = "aula_teorica", nullable = false, length = 20)
    private String aulaTeorica;
    @Basic(optional = false)
    @Column(name = "aula_pratica", nullable = false, length = 20)
    private String aulaPratica;
    @Basic(optional = false)
    @Column(name = "marcar_simulado", nullable = false, length = 20)
    private String marcarSimulado;
    @Basic(optional = false)
    @Column(name = "aula_dada", nullable = false)
    private short aulaDada;
    @JoinColumns({
        @JoinColumn(name = "professor_idprofessor", referencedColumnName = "idprofessor", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "professor_login_idlogin", referencedColumnName = "login_idlogin", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "professor_usuario_idusuario", referencedColumnName = "usuario_idusuario", nullable = false, insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Professor professor;
    @JoinColumn(name = "usuario_idusuario", referencedColumnName = "idusuario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public TabelaAula() {
    }

    public TabelaAula(TabelaAulaPK tabelaAulaPK) {
        this.tabelaAulaPK = tabelaAulaPK;
    }

    public TabelaAula(TabelaAulaPK tabelaAulaPK, String aulaTeorica, String aulaPratica, String marcarSimulado, short aulaDada) {
        this.tabelaAulaPK = tabelaAulaPK;
        this.aulaTeorica = aulaTeorica;
        this.aulaPratica = aulaPratica;
        this.marcarSimulado = marcarSimulado;
        this.aulaDada = aulaDada;
    }

    public TabelaAula(int idtabelaAula, int usuarioIdusuario, int professorIdprofessor, int professorLoginIdlogin, int professorUsuarioIdusuario) {
        this.tabelaAulaPK = new TabelaAulaPK(idtabelaAula, usuarioIdusuario, professorIdprofessor, professorLoginIdlogin, professorUsuarioIdusuario);
    }

    public TabelaAulaPK getTabelaAulaPK() {
        return tabelaAulaPK;
    }

    public void setTabelaAulaPK(TabelaAulaPK tabelaAulaPK) {
        this.tabelaAulaPK = tabelaAulaPK;
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

    public short getAulaDada() {
        return aulaDada;
    }

    public void setAulaDada(short aulaDada) {
        this.aulaDada = aulaDada;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tabelaAulaPK != null ? tabelaAulaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaAula)) {
            return false;
        }
        TabelaAula other = (TabelaAula) object;
        if ((this.tabelaAulaPK == null && other.tabelaAulaPK != null) || (this.tabelaAulaPK != null && !this.tabelaAulaPK.equals(other.tabelaAulaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TabelaAula[ tabelaAulaPK=" + tabelaAulaPK + " ]";
    }
    
}
