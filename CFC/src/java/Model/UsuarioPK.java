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
public class UsuarioPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    private int idusuario;
    @Basic(optional = false)
    @Column(name = "endereco_idendereco", nullable = false)
    private int enderecoIdendereco;
    @Basic(optional = false)
    @Column(name = "login_idlogin", nullable = false)
    private int loginIdlogin;
    @Basic(optional = false)
    @Column(name = "tabela_preco_idtabela_preco", nullable = false)
    private int tabelaPrecoIdtabelaPreco;

    public UsuarioPK() {
    }

    public UsuarioPK(int idusuario, int enderecoIdendereco, int loginIdlogin, int tabelaPrecoIdtabelaPreco) {
        this.idusuario = idusuario;
        this.enderecoIdendereco = enderecoIdendereco;
        this.loginIdlogin = loginIdlogin;
        this.tabelaPrecoIdtabelaPreco = tabelaPrecoIdtabelaPreco;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getEnderecoIdendereco() {
        return enderecoIdendereco;
    }

    public void setEnderecoIdendereco(int enderecoIdendereco) {
        this.enderecoIdendereco = enderecoIdendereco;
    }

    public int getLoginIdlogin() {
        return loginIdlogin;
    }

    public void setLoginIdlogin(int loginIdlogin) {
        this.loginIdlogin = loginIdlogin;
    }

    public int getTabelaPrecoIdtabelaPreco() {
        return tabelaPrecoIdtabelaPreco;
    }

    public void setTabelaPrecoIdtabelaPreco(int tabelaPrecoIdtabelaPreco) {
        this.tabelaPrecoIdtabelaPreco = tabelaPrecoIdtabelaPreco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idusuario;
        hash += (int) enderecoIdendereco;
        hash += (int) loginIdlogin;
        hash += (int) tabelaPrecoIdtabelaPreco;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioPK)) {
            return false;
        }
        UsuarioPK other = (UsuarioPK) object;
        if (this.idusuario != other.idusuario) {
            return false;
        }
        if (this.enderecoIdendereco != other.enderecoIdendereco) {
            return false;
        }
        if (this.loginIdlogin != other.loginIdlogin) {
            return false;
        }
        if (this.tabelaPrecoIdtabelaPreco != other.tabelaPrecoIdtabelaPreco) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.UsuarioPK[ idusuario=" + idusuario + ", enderecoIdendereco=" + enderecoIdendereco + ", loginIdlogin=" + loginIdlogin + ", tabelaPrecoIdtabelaPreco=" + tabelaPrecoIdtabelaPreco + " ]";
    }
    
}
