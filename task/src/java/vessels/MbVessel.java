package vessels;

//import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import entities.*;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import model.VesselInfoFacade;
import java.util.logging.Logger;

@ManagedBean(name = "mbVessel")
@ViewScoped
public class MbVessel implements Serializable {

    @EJB
    private VesselInfoFacade vesselInfoFacade;
    private VesselInfo vessel;
    private static final Logger LOGGER = Logger.getLogger(MbVessel.class.getName());

    @PostConstruct
    public void init() {
        // clear all objects from data 
        clearMe();
    }

    public void clearMe() {
        vessel = new VesselInfo();
    }

    public void createVessel() {
        this.vesselInfoFacade.create(vessel);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Vessel Added Successfully", "Success"));
        clearMe();
    }

    public void redirect() {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("allvessels.xhtml");
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Exception occur", ex);
        }
    }

    public VesselInfoFacade getVesselInfoFacade() {
        return vesselInfoFacade;
    }

    public void setVesselInfoFacade(VesselInfoFacade vesselInfoFacade) {
        this.vesselInfoFacade = vesselInfoFacade;
    }

    public VesselInfo getVessel() {
        return vessel;
    }

    public void setVessel(VesselInfo vessel) {
        this.vessel = vessel;
    }
}
