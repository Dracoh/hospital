package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:24:58")
@StaticMetamodel(Treatment.class)
public class Treatment_ { 

    public static volatile SingularAttribute<Treatment, Long> idTreatment;
    public static volatile SingularAttribute<Treatment, Double> doseQuantity;
    public static volatile SingularAttribute<Treatment, Integer> idTreatmentType;
    public static volatile SingularAttribute<Treatment, String> doseMeasure;
    public static volatile SingularAttribute<Treatment, String> treatmentName;

}