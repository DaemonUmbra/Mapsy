package info.mdhs.mapsy.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class User
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String id;

    String name;

    @Email
    String email;

    String role;

    String password;

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public String getRole()
    {
        return role;
    }

    public String getPassword()
    {
        return password;
    }
}
