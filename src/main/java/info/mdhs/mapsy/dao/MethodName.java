package info.mdhs.mapsy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MethodName
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String Id;

    String mapping;

    String name;

    String Comment;

    String version;

    String namerId;

    String date;

    Boolean locked;
}
