package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:05:12")
@StaticMetamodel(Log.class)
public class Log_ { 

    public static volatile SingularAttribute<Log, Integer> idUser;
    public static volatile SingularAttribute<Log, Integer> toStatus;
    public static volatile SingularAttribute<Log, Integer> fromStatus;
    public static volatile SingularAttribute<Log, Date> modifyDate;
    public static volatile SingularAttribute<Log, Integer> idAppointment;
    public static volatile SingularAttribute<Log, Long> idLog;

}