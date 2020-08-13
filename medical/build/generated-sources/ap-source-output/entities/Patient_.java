package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:24:58")
@StaticMetamodel(Patient.class)
public class Patient_ { 

    public static volatile SingularAttribute<Patient, Date> birthday;
    public static volatile SingularAttribute<Patient, String> patientName;
    public static volatile SingularAttribute<Patient, String> address;
    public static volatile SingularAttribute<Patient, String> nationality;
    public static volatile SingularAttribute<Patient, Integer> idPhone;
    public static volatile SingularAttribute<Patient, Long> idPatient;
    public static volatile SingularAttribute<Patient, String> bloodType;
    public static volatile SingularAttribute<Patient, String> email;

}