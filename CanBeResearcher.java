package proj;

import java.io.Serializable;

public interface CanBeResearcher extends Serializable {

    String getFirstName();
    String getLastName();
    String getUsername();
    String getEmail();
    String getPassword();
    String getID();
    Degree getDegree();

    //void display();
}
