package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:24:58")
@StaticMetamodel(HospitalizationTracing.class)
public class HospitalizationTracing_ { 

    public static volatile SingularAttribute<HospitalizationTracing, Integer> idFunctionary;
    public static volatile SingularAttribute<HospitalizationTracing, String> comments;
    public static volatile SingularAttribute<HospitalizationTracing, Integer> idTreatment;
    public static volatile SingularAttribute<HospitalizationTracing, Long> idHospitalizationTracing;
    public static volatile SingularAttribute<HospitalizationTracing, Date> dateTracing;
    public static volatile SingularAttribute<HospitalizationTracing, Integer> idHospitalization;

}