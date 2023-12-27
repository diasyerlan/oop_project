package proj;

import java.io.Serializable;

import java.io.Serializable;

/**
 * An interface representing entities that can be researchers.
 * Classes implementing this interface should provide methods to retrieve basic information
 * such as first name, last name, username, email, password, ID, and degree.
 */
public interface CanBeResearcher extends Serializable {

    /**
     * Gets the first name of the researcher.
     *
     * @return The first name of the researcher.
     */
    String getFirstName();

    /**
     * Gets the last name of the researcher.
     *
     * @return The last name of the researcher.
     */
    String getLastName();

    /**
     * Gets the username of the researcher.
     *
     * @return The username of the researcher.
     */
    String getUsername();

    /**
     * Gets the email of the researcher.
     *
     * @return The email of the researcher.
     */
    String getEmail();

    /**
     * Gets the password of the researcher.
     *
     * @return The password of the researcher.
     */
    String getPassword();

    /**
     * Gets the ID of the researcher.
     *
     * @return The ID of the researcher.
     */
    String getID();

    /**
     * Gets the degree of the researcher.
     *
     * @return The degree of the researcher.
     */
    Degree getDegree();
}

