package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:24:58")
@StaticMetamodel(Appointment.class)
public class Appointment_ { 

    public static volatile SingularAttribute<Appointment, Date> date;
    public static volatile SingularAttribute<Appointment, Integer> idStatus;
    public static volatile SingularAttribute<Appointment, String> comments;
    public static volatile SingularAttribute<Appointment, Long> idAppointment;
    public static volatile SingularAttribute<Appointment, Integer> idWorkArea;
    public static volatile SingularAttribute<Appointment, Date> time;

}