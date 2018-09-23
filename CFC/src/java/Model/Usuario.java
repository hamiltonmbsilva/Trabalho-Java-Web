/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findByCpf", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf")
    , @NamedQuery(name = "Usuario.findByRg", query = "SELECT u FROM Usuario u WHERE u.rg = :rg")
    , @NamedQuery(name = "Usuario.findByAtivado", query = "SELECT u FROM Usuario u WHERE u.ativado = :ativado")
    , @NamedQuery(name = "Usuario.findByDataNascimento", query = "SELECT u FROM Usuario u WHERE u.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Usuario.findByNota", query = "SELECT u FROM Usuario u WHERE u.nota = :nota")
    , @NamedQuery(name = "Usuario.findByEnderecoIdendereco", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.enderecoIdendereco = :enderecoIdendereco")
    , @NamedQuery(name = "Usuario.findByLoginIdlogin", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.loginIdlogin = :loginIdlogin")
    , @NamedQuery(name = "Usuario.findByTabelaPrecoIdtabelaPreco", query = "SELECT u FROM Usuario u WHERE u.usuarioPK.tabelaPrecoIdtabelaPreco = :tabelaPrecoIdtabelaPreco")
    , @NamedQuery(name = "Usuario.findByQtdaulaTeorica", query = "SELECT u FROM Usuario u WHERE u.qtdaulaTeorica = :qtdaulaTeorica")
    , @NamedQuery(name = "Usuario.findByQtdaulaPratica", query = "SELECT u FROM Usuario u WHERE u.qtdaulaPratica = :qtdaulaPratica")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsuarioPK usuarioPK;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String email;
    private Integer cpf;
    @Column(length = 12)
    private String rg;
    private Short ativado;
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    private Integer nota;
    @Basic(optional = false)
    @Column(name = "qtd_aulaTeorica", nullable = false)
    private int qtdaulaTeorica;
    @Basic(optional = false)
    @Column(name = "qtd_aulaPratica", nullable = false)
    private int qtdaulaPratica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Professor> professorList;
    @JoinColumn(name = "endereco_idendereco", referencedColumnName = "idendereco", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Endereco endereco;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Login login;
    @JoinColumn(name = "tabela_preco_idtabela_preco", referencedColumnName = "idtabela_preco", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TabelaPreco tabelaPreco;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<TabelaAula> tabelaAulaList;

    public Usuario() {
    }

    public Usuario(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public Usuario(UsuarioPK usuarioPK, String email, int qtdaulaTeorica, int qtdaulaPratica) {
        this.usuarioPK = usuarioPK;
        this.email = email;
        this.qtdaulaTeorica = qtdaulaTeorica;
        this.qtdaulaPratica = qtdaulaPratica;
    }

    public Usuario(int idusuario, int enderecoIdendereco, int loginIdlogin, int tabelaPrecoIdtabelaPreco) {
        this.usuarioPK = new UsuarioPK(idusuario, enderecoIdendereco, loginIdlogin, tabelaPrecoIdtabelaPreco);
    }

    public UsuarioPK getUsuarioPK() {
        return usuarioPK;
    }

    public void setUsuarioPK(UsuarioPK usuarioPK) {
        this.usuarioPK = usuarioPK;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Short getAtivado() {
        return ativado;
    }

    public void setAtivado(Short ativado) {
        this.ativado = ativado;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public int getQtdaulaTeorica() {
        return qtdaulaTeorica;
    }

    public void setQtdaulaTeorica(int qtdaulaTeorica) {
        this.qtdaulaTeorica = qtdaulaTeorica;
    }

    public int getQtdaulaPratica() {
        return qtdaulaPratica;
    }

    public void setQtdaulaPratica(int qtdaulaPratica) {
        this.qtdaulaPratica = qtdaulaPratica;
    }

    @XmlTransient
    public List<Professor> getProfessorList() {
        return professorList;
    }

    public void setProfessorList(List<Professor> professorList) {
        this.professorList = professorList;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public TabelaPreco getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPreco tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
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
        hash += (usuarioPK != null ? usuarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuarioPK == null && other.usuarioPK != null) || (this.usuarioPK != null && !this.usuarioPK.equals(other.usuarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Usuario[ usuarioPK=" + usuarioPK + " ]";
    }
    
}
