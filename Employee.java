package proj;



 

public class Employee extends User {
    
    
     
    
    private Integer salary;
    
    
     
    
    private Integer hiredate;
    
    
     
    
    private Integer workExperience;
    
    
    
     
    
    private Security security;
    
    
     
    
    private Message message;
    
    
    
     
    
    private Integer getSalary() {
        return this.salary;
    }
    
    
     
    
    private Integer setSalary(Integer salary) {
        this.salary = salary;
    }
    
    
     
    
    private Integer getHiredate() {
        return this.hiredate;
    }
    
    
     
    
    private Integer setHiredate(Integer hiredate) {
        this.hiredate = hiredate;
    }
    
    
     
    
    private Integer getWorkExperience() {
        return this.workExperience;
    }
    
    
     
    
    private Integer setWorkExperience(Integer workExperience) {
        this.workExperience = workExperience;
    }
    

                              Operations                                  
    
    
     
    
    public boolean sendMessage() {
        TODO
        return false;
    }
    
    
     
    
    public boolean viewMessage() {
        TODO
        return false;
    }
    
    
     
    
    public int getSalary() {
        TODO
        return 0;
    }
    
    
     
    
    public int getWorkExp() {
        TODO
        return 0;
    }
    
    
     
    
    public Vector<Message> viewMessage() {
        TODO
        return null;
    }
    
    
}
