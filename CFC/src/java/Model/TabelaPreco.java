/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "tabela_preco", catalog = "db_cfcweb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TabelaPreco.findAll", query = "SELECT t FROM TabelaPreco t")
    , @NamedQuery(name = "TabelaPreco.findByIdtabelaPreco", query = "SELECT t FROM TabelaPreco t WHERE t.idtabelaPreco = :idtabelaPreco")
    , @NamedQuery(name = "TabelaPreco.findByValor", query = "SELECT t FROM TabelaPreco t WHERE t.valor = :valor")
    , @NamedQuery(name = "TabelaPreco.findByNumeroParcela", query = "SELECT t FROM TabelaPreco t WHERE t.numeroParcela = :numeroParcela")})
public class TabelaPreco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtabela_preco", nullable = false)
    private Integer idtabelaPreco;
    @Basic(optional = false)
    @Column(nullable = false)
    private int valor;
    @Basic(optional = false)
    @Column(nullable = false)
    private int numeroParcela;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tabelaPreco")
    private List<Usuario> usuarioList;

    public TabelaPreco() {
    }

    public TabelaPreco(Integer idtabelaPreco) {
        this.idtabelaPreco = idtabelaPreco;
    }

    public TabelaPreco(Integer idtabelaPreco, int valor, int numeroParcela) {
        this.idtabelaPreco = idtabelaPreco;
        this.valor = valor;
        this.numeroParcela = numeroParcela;
    }

    public Integer getIdtabelaPreco() {
        return idtabelaPreco;
    }

    public void setIdtabelaPreco(Integer idtabelaPreco) {
        this.idtabelaPreco = idtabelaPreco;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumeroParcela() {
        return numeroParcela;
    }

    public void setNumeroParcela(int numeroParcela) {
        this.numeroParcela = numeroParcela;
    }

    @XmlTransient
    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtabelaPreco != null ? idtabelaPreco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TabelaPreco)) {
            return false;
        }
        TabelaPreco other = (TabelaPreco) object;
        if ((this.idtabelaPreco == null && other.idtabelaPreco != null) || (this.idtabelaPreco != null && !this.idtabelaPreco.equals(other.idtabelaPreco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.TabelaPreco[ idtabelaPreco=" + idtabelaPreco + " ]";
    }
    
}
