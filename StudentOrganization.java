package proj;

import java.io.Serializable;
import java.util.Vector;

public class StudentOrganization implements Serializable {
    private static final long serialVersionUID = -8802658280658679084L;

    private String name;
    private int number;
    private Vector<Student> members;
    public StudentOrganization() {
        name = "";
        members = new Vector<>();
    }
    public StudentOrganization(String name, int number) {
        this.name = name;
        this.number = number;
    }
    private String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid organization name. Please provide a valid name.");
        }
    }
    
    private Vector<Student> getMembers() {
        return this.members;
    }
    
    public void setMembers(Vector<Student> members) {
        if (members != null) {
            this.members = members;
        } else {
            System.out.println("Invalid members. Please provide a valid list of members.");
        }
    }
    
    public String getOrganizationName() {
    	return name != null ? name : "No organization name";
    }
    
    public void setOrganizationName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName;
        } else {
            System.out.println("Invalid organization name. Please provide a valid name.");
        }
    }
    
    public Vector<Student> getOrganizationMembers() {
        return null;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

