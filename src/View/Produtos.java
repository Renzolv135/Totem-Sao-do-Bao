/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author alunos
 */
@Entity
@Table(name = "produtos", catalog = "totem_fastfood", schema = "")
@NamedQueries({
    @NamedQuery(name = "Produtos.findAll", query = "SELECT p FROM Produtos p")
    , @NamedQuery(name = "Produtos.findByProId", query = "SELECT p FROM Produtos p WHERE p.proId = :proId")
    , @NamedQuery(name = "Produtos.findByProNome", query = "SELECT p FROM Produtos p WHERE p.proNome = :proNome")
    , @NamedQuery(name = "Produtos.findByProTipo", query = "SELECT p FROM Produtos p WHERE p.proTipo = :proTipo")
    , @NamedQuery(name = "Produtos.findByProPreco", query = "SELECT p FROM Produtos p WHERE p.proPreco = :proPreco")})
public class Produtos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pro_id")
    private Integer proId;
    @Column(name = "pro_nome")
    private String proNome;
    @Column(name = "pro_tipo")
    private String proTipo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "pro_preco")
    private BigDecimal proPreco;

    public Produtos() {
    }

    public Produtos(Integer proId) {
        this.proId = proId;
    }

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        Integer oldProId = this.proId;
        this.proId = proId;
        changeSupport.firePropertyChange("proId", oldProId, proId);
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        String oldProNome = this.proNome;
        this.proNome = proNome;
        changeSupport.firePropertyChange("proNome", oldProNome, proNome);
    }

    public String getProTipo() {
        return proTipo;
    }

    public void setProTipo(String proTipo) {
        String oldProTipo = this.proTipo;
        this.proTipo = proTipo;
        changeSupport.firePropertyChange("proTipo", oldProTipo, proTipo);
    }

    public BigDecimal getProPreco() {
        return proPreco;
    }

    public void setProPreco(BigDecimal proPreco) {
        BigDecimal oldProPreco = this.proPreco;
        this.proPreco = proPreco;
        changeSupport.firePropertyChange("proPreco", oldProPreco, proPreco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produtos)) {
            return false;
        }
        Produtos other = (Produtos) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Produtos[ proId=" + proId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
