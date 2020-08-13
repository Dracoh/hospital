package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:05:12")
@StaticMetamodel(Hospitalization.class)
public class Hospitalization_ { 

    public static volatile SingularAttribute<Hospitalization, Integer> idFunctionary;
    public static volatile SingularAttribute<Hospitalization, Date> endDate;
    public static volatile SingularAttribute<Hospitalization, Long> idHospitalization;
    public static volatile SingularAttribute<Hospitalization, Integer> idPatient;
    public static volatile SingularAttribute<Hospitalization, Integer> idWorkArea;
    public static volatile SingularAttribute<Hospitalization, Integer> idAttemtiomCemter;
    public static volatile SingularAttribute<Hospitalization, Integer> idDiagnosis;
    public static volatile SingularAttribute<Hospitalization, Date> startDate;

}