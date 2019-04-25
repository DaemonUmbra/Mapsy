package info.mdhs.mapsy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MethodMapping
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    String notch;

    String mapping;

    String version;

    String mapperId;
}
