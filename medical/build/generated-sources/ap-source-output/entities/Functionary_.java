package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-12T22:05:12")
@StaticMetamodel(Functionary.class)
public class Functionary_ { 

    public static volatile SingularAttribute<Functionary, String> firstName;
    public static volatile SingularAttribute<Functionary, String> lastName;
    public static volatile SingularAttribute<Functionary, Date> admissionDate;
    public static volatile SingularAttribute<Functionary, Long> idFunctionary;
    public static volatile SingularAttribute<Functionary, String> idDocument;
    public static volatile SingularAttribute<Functionary, Integer> idFunctionaryType;
    public static volatile SingularAttribute<Functionary, Integer> idWorkArea;
    public static volatile SingularAttribute<Functionary, String> middleName;
    public static volatile SingularAttribute<Functionary, String> thirdName;

}