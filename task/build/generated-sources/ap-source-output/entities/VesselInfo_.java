package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-10T16:19:10")
@StaticMetamodel(VesselInfo.class)
public class VesselInfo_ { 

    public static volatile SingularAttribute<VesselInfo, Integer> vesselId;
    public static volatile SingularAttribute<VesselInfo, String> vesselType;
    public static volatile SingularAttribute<VesselInfo, String> hasThrusters;
    public static volatile SingularAttribute<VesselInfo, Long> vesselImoNumber;
    public static volatile SingularAttribute<VesselInfo, String> vesselName;

}