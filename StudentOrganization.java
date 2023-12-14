package proj;

import java.util.Vector;

public class StudentOrganization {
    
    private String name;
    private Vector<Student> members;
    private Student student;
    
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
    }

