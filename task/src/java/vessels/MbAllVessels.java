package vessels;

import javax.faces.view.ViewScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.List;
import entities.VesselInfo;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import model.VesselInfoFacade;

@ManagedBean(name = "mbAllVessels")
@ViewScoped
public class MbAllVessels implements Serializable {

    @EJB
    private VesselInfoFacade vesselInfoFacade;

    @PostConstruct
    public void init() {
    }

    public List<VesselInfo> findAllVessels() {
        return this.vesselInfoFacade.findAll();

    }

    public VesselInfoFacade getVesselInfoFacade() {
        return vesselInfoFacade;
    }

    public void setVesselInfoFacade(VesselInfoFacade vesselInfoFacade) {
        this.vesselInfoFacade = vesselInfoFacade;
    }
}
