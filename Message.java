package proj;

public class Message {

    private Integer date;
    private String content;
    private Employee receiver;
    private Employee sender; // Renamed from employee to sender
    private Employee ccEmployee; // Added ccEmployee as an additional recipient

    // Getters and setters

    public Integer getDate() {
        return this.date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Employee getReceiver() {
        return this.receiver;
    }

    public void setReceiver(Employee receiver) {
        this.receiver = receiver;
    }

    public Employee getSender() {
        return this.sender;
    }

    public void setSender(Employee sender) {
        this.sender = sender;
    }

    public Employee getCcEmployee() {
        return this.ccEmployee;
    }

    public void setCcEmployee(Employee ccEmployee) {
        this.ccEmployee = ccEmployee;
    }

    // Additional methods

    public void sendMessage() {
        // TODO: Implement the logic to send the message
    }

    public void forwardMessage(Employee newReceiver) {
        // TODO: Implement the logic to forward the message to a new receiver
    }

    @Override
    public String toString() {
        // TODO: Implement the logic to represent the object as a string
        return "";
    }
}
