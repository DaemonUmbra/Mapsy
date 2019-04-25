package info.mdhs.mapsy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassMapping
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String Id;

    String notchName;

    String mapping;

    String version;

    String mapperId;
}
