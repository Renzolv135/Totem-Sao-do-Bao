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
@Table(name = "pedido", catalog = "totem_fastfood", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByPedId", query = "SELECT p FROM Pedido p WHERE p.pedId = :pedId")
    , @NamedQuery(name = "Pedido.findByProId", query = "SELECT p FROM Pedido p WHERE p.proId = :proId")
    , @NamedQuery(name = "Pedido.findByProNome", query = "SELECT p FROM Pedido p WHERE p.proNome = :proNome")
    , @NamedQuery(name = "Pedido.findByQuantidade", query = "SELECT p FROM Pedido p WHERE p.quantidade = :quantidade")
    , @NamedQuery(name = "Pedido.findBySubtotal", query = "SELECT p FROM Pedido p WHERE p.subtotal = :subtotal")})
public class Pedido implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ped_id")
    private Integer pedId;
    @Column(name = "pro_id")
    private Integer proId;
    @Column(name = "pro_nome")
    private String proNome;
    @Column(name = "quantidade")
    private Integer quantidade;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "subtotal")
    private BigDecimal subtotal;

    public Pedido() {
    }

    public Pedido(Integer pedId) {
        this.pedId = pedId;
    }

    public Integer getPedId() {
        return pedId;
    }

    public void setPedId(Integer pedId) {
        Integer oldPedId = this.pedId;
        this.pedId = pedId;
        changeSupport.firePropertyChange("pedId", oldPedId, pedId);
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        Integer oldQuantidade = this.quantidade;
        this.quantidade = quantidade;
        changeSupport.firePropertyChange("quantidade", oldQuantidade, quantidade);
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        BigDecimal oldSubtotal = this.subtotal;
        this.subtotal = subtotal;
        changeSupport.firePropertyChange("subtotal", oldSubtotal, subtotal);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedId != null ? pedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.pedId == null && other.pedId != null) || (this.pedId != null && !this.pedId.equals(other.pedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Pedido[ pedId=" + pedId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
