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
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario")
    , @NamedQuery(name = "Usuario.findByEmail", query = "SELECT u FROM Usuario u WHERE u.email = :email")
    , @NamedQuery(name = "Usuario.findByCpf", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf")
    , @NamedQuery(name = "Usuario.findByRg", query = "SELECT u FROM Usuario u WHERE u.rg = :rg")
    , @NamedQuery(name = "Usuario.findByAtivado", query = "SELECT u FROM Usuario u WHERE u.ativado = :ativado")
    , @NamedQuery(name = "Usuario.findByDataNascimento", query = "SELECT u FROM Usuario u WHERE u.dataNascimento = :dataNascimento")
    , @NamedQuery(name = "Usuario.findByNota", query = "SELECT u FROM Usuario u WHERE u.nota = :nota")
    , @NamedQuery(name = "Usuario.findByQtdaulaTeorica", query = "SELECT u FROM Usuario u WHERE u.qtdaulaTeorica = :qtdaulaTeorica")
    , @NamedQuery(name = "Usuario.findByQtdaulaPratica", query = "SELECT u FROM Usuario u WHERE u.qtdaulaPratica = :qtdaulaPratica")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idusuario;
    @Basic(optional = false)
    @Column(nullable = false, length = 45)
    private String email;
    @Column(length = 12)
    private String cpf;
    @Column(length = 12)
    private String rg;
    @Column(length = 2)
    private String ativado;
    @Column(length = 10)
    private String dataNascimento;
    @Column(length = 5)
    private String nota;
    @Column(name = "qtd_aulaTeorica", length = 3)
    private String qtdaulaTeorica;
    @Column(name = "qtd_aulaPratica", length = 3)
    private String qtdaulaPratica;
    @OneToMany(mappedBy = "usuarioIdusuario")
    private List<Endereco> enderecoList;
    @JoinColumn(name = "login_idlogin", referencedColumnName = "idlogin")
    @ManyToOne
    private Login loginIdlogin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<TabelaAula> tabelaAulaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdusuario")
    private List<TabelaPreco> tabelaPrecoList;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(Integer idusuario, String email) {
        this.idusuario = idusuario;
        this.email = email;
    }

    public Usuario(String email, String cpf, String rg, String ativado, String dataNascimento, String nota, String qtdaulaTeorica, String qtdaulaPratica) {
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.ativado = ativado;
        this.dataNascimento = dataNascimento;
        this.nota = nota;
        this.qtdaulaTeorica = qtdaulaTeorica;
        this.qtdaulaPratica = qtdaulaPratica;
    }
    
    

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAtivado() {
        return ativado;
    }

    public void setAtivado(String ativado) {
        this.ativado = ativado;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getQtdaulaTeorica() {
        return qtdaulaTeorica;
    }

    public void setQtdaulaTeorica(String qtdaulaTeorica) {
        this.qtdaulaTeorica = qtdaulaTeorica;
    }

    public String getQtdaulaPratica() {
        return qtdaulaPratica;
    }

    public void setQtdaulaPratica(String qtdaulaPratica) {
        this.qtdaulaPratica = qtdaulaPratica;
    }

    @XmlTransient
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
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

    @XmlTransient
    public List<TabelaPreco> getTabelaPrecoList() {
        return tabelaPrecoList;
    }

    public void setTabelaPrecoList(List<TabelaPreco> tabelaPrecoList) {
        this.tabelaPrecoList = tabelaPrecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Classe.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
