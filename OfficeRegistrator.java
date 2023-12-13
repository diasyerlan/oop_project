package proj;
public class OfficeRegistrator extends ManagerManager {
    
    private Queue<Request> listOfRequestsOR;
    
    private Queue<Request> getListOfRequestsOR() {
        return this.listOfRequestsOR;
    }
    
    private void setListOfRequestsOR(Queue<Request> listOfRequestsOR) {
        this.listOfRequestsOR = listOfRequestsOR;
    }
    public boolean addCourse() {
        return false;
    }
    
    public void manageCourse() {
        
    }
    
    public boolean deleteCourse() {
        return false;
    }
    
    public Queue<Request> getlistOfRequestOR() {
        return null;
    }
    
    public Queue<Request> setListOfRequests() {
        return null;
    }
    
    public ViewRequests getRequest() {
      
        return null;
    }
    
    public boolean openCourse() {
       
        return false;
    }
    
    public void closeCourse() {
        
    }
    
    public void printOptions() {
        
    }
    
    public void getMenu() {
        // TODO
    }
}
