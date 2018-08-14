/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Karim Muhammad
 */
@Entity
@Table(name = "vessel_info")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VesselInfo.findAll", query = "SELECT v FROM VesselInfo v")
    , @NamedQuery(name = "VesselInfo.findByVesselId", query = "SELECT v FROM VesselInfo v WHERE v.vesselId = :vesselId")
    , @NamedQuery(name = "VesselInfo.findByVesselName", query = "SELECT v FROM VesselInfo v WHERE v.vesselName = :vesselName")
    , @NamedQuery(name = "VesselInfo.findByVesselImoNumber", query = "SELECT v FROM VesselInfo v WHERE v.vesselImoNumber = :vesselImoNumber")
    , @NamedQuery(name = "VesselInfo.findByVesselType", query = "SELECT v FROM VesselInfo v WHERE v.vesselType = :vesselType")
    , @NamedQuery(name = "VesselInfo.findByHasThrusters", query = "SELECT v FROM VesselInfo v WHERE v.hasThrusters = :hasThrusters")})
public class VesselInfo implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "HAS_THRUSTERS")
    private String hasThrusters;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VESSEL_ID")
    private Integer vesselId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "VESSEL_NAME")
    private String vesselName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VESSEL_IMO_NUMBER")
    private long vesselImoNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "VESSEL_TYPE")
    private String vesselType;

    public VesselInfo() {
    }

    public VesselInfo(Integer vesselId) {
        this.vesselId = vesselId;
    }

    public VesselInfo(Integer vesselId, String vesselName, long vesselImoNumber, String vesselType) {
        this.vesselId = vesselId;
        this.vesselName = vesselName;
        this.vesselImoNumber = vesselImoNumber;
        this.vesselType = vesselType;
    }

    public Integer getVesselId() {
        return vesselId;
    }

    public void setVesselId(Integer vesselId) {
        this.vesselId = vesselId;
    }

    public String getVesselName() {
        return vesselName;
    }

    public void setVesselName(String vesselName) {
        this.vesselName = vesselName;
    }

    public long getVesselImoNumber() {
        return vesselImoNumber;
    }

    public void setVesselImoNumber(long vesselImoNumber) {
        this.vesselImoNumber = vesselImoNumber;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public String getHasThrusters() {
        return hasThrusters;
    }

    public void setHasThrusters(String hasThrusters) {
        this.hasThrusters = hasThrusters;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vesselId != null ? vesselId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VesselInfo)) {
            return false;
        }
        VesselInfo other = (VesselInfo) object;
        if ((this.vesselId == null && other.vesselId != null) || (this.vesselId != null && !this.vesselId.equals(other.vesselId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ejb.VesselInfo[ vesselId=" + vesselId + " ]";
    }

}
