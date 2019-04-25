package info.mdhs.mapsy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FieldName
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String Id;

    String mapping;

    String name;

    String Comment;

    String version;

    String namerId;

    Date namedDate;

    Boolean locked;

}
