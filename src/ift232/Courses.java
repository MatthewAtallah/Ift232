/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ift232;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
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
 * @author matthew
 */
@Entity
@Table(name = "Courses", catalog = "Course", schema = "")
@NamedQueries({
    @NamedQuery(name = "Courses.findAll", query = "SELECT c FROM Courses c"),
    @NamedQuery(name = "Courses.findByCsId", query = "SELECT c FROM Courses c WHERE c.csId = :csId"),
    @NamedQuery(name = "Courses.findByCsCode", query = "SELECT c FROM Courses c WHERE c.csCode = :csCode"),
    @NamedQuery(name = "Courses.findByCsName", query = "SELECT c FROM Courses c WHERE c.csName = :csName"),
    @NamedQuery(name = "Courses.findByCsDescription", query = "SELECT c FROM Courses c WHERE c.csDescription = :csDescription"),
    @NamedQuery(name = "Courses.findByCsType", query = "SELECT c FROM Courses c WHERE c.csType = :csType"),
    @NamedQuery(name = "Courses.findByCsNbCredits", query = "SELECT c FROM Courses c WHERE c.csNbCredits = :csNbCredits"),
    @NamedQuery(name = "Courses.findByCsLab", query = "SELECT c FROM Courses c WHERE c.csLab = :csLab")})
public class Courses implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cs_id")
    private Integer csId;
    @Basic(optional = false)
    @Column(name = "cs_code")
    private String csCode;
    @Basic(optional = false)
    @Column(name = "cs_name")
    private String csName;
    @Column(name = "cs_description")
    private String csDescription;
    @Basic(optional = false)
    @Column(name = "cs_type")
    private String csType;
    @Basic(optional = false)
    @Column(name = "cs_nb_credits")
    private int csNbCredits;
    @Column(name = "cs_lab")
    private String csLab;

    public Courses() {
    }

    public Courses(Integer csId) {
        this.csId = csId;
    }

    public Courses(Integer csId, String csCode, String csName, String csType, int csNbCredits) {
        this.csId = csId;
        this.csCode = csCode;
        this.csName = csName;
        this.csType = csType;
        this.csNbCredits = csNbCredits;
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        Integer oldCsId = this.csId;
        this.csId = csId;
        changeSupport.firePropertyChange("csId", oldCsId, csId);
    }

    public String getCsCode() {
        return csCode;
    }

    public void setCsCode(String csCode) {
        String oldCsCode = this.csCode;
        this.csCode = csCode;
        changeSupport.firePropertyChange("csCode", oldCsCode, csCode);
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        String oldCsName = this.csName;
        this.csName = csName;
        changeSupport.firePropertyChange("csName", oldCsName, csName);
    }

    public String getCsDescription() {
        return csDescription;
    }

    public void setCsDescription(String csDescription) {
        String oldCsDescription = this.csDescription;
        this.csDescription = csDescription;
        changeSupport.firePropertyChange("csDescription", oldCsDescription, csDescription);
    }

    public String getCsType() {
        return csType;
    }

    public void setCsType(String csType) {
        String oldCsType = this.csType;
        this.csType = csType;
        changeSupport.firePropertyChange("csType", oldCsType, csType);
    }

    public int getCsNbCredits() {
        return csNbCredits;
    }

    public void setCsNbCredits(int csNbCredits) {
        int oldCsNbCredits = this.csNbCredits;
        this.csNbCredits = csNbCredits;
        changeSupport.firePropertyChange("csNbCredits", oldCsNbCredits, csNbCredits);
    }

    public String getCsLab() {
        return csLab;
    }

    public void setCsLab(String csLab) {
        String oldCsLab = this.csLab;
        this.csLab = csLab;
        changeSupport.firePropertyChange("csLab", oldCsLab, csLab);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (csId != null ? csId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Courses)) {
            return false;
        }
        Courses other = (Courses) object;
        if ((this.csId == null && other.csId != null) || (this.csId != null && !this.csId.equals(other.csId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ift232.Courses[ csId=" + csId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
