package Model;

public class Passenger {
    private String passangerID;
    private String passangerName;
    private int passangerGender;
    private int passangerAge;
    
    public Passenger(String passangerID, String passangerName, int passangerGender, int passangerAge) {
        this.passangerID = passangerID;
        this.passangerName = passangerName;
        this.passangerGender = passangerGender;
        this.passangerAge = passangerAge;
    }
    
    public String getPassangerID() {
        return passangerID;
    }
    public void setPassangerID(String passangerID) {
        this.passangerID = passangerID;
    }
    public String getPassangerName() {
        return passangerName;
    }
    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }
    public int getPassangerGender() {
        return passangerGender;
    }
    public void setPassangerGender(int passangerGender) {
        this.passangerGender = passangerGender;
    }
    public int getPassangerAge() {
        return passangerAge;
    }
    public void setPassangerAge(int passangerAge) {
        this.passangerAge = passangerAge;
    }
    
    public String getPasangerInfo(){
        return "ID: " + this.passangerID + ", Name: " + this.passangerName + ", Gender: " + (this.passangerGender == 1? "Male" : "Female") + ", Age: " + this.passangerAge;
    }
}