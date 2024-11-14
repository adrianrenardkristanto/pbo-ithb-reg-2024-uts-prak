package Model;

public class Train {
    private int trainNumber;
    private String trainName;
    private TrainType trainType;
    private Ticket ticket;
    
    public Train(int trainNumber, String trainName, TrainType trainType, Ticket ticket) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainType = trainType;
        this.ticket = ticket;
    }
    
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    
    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public TrainType getTrainType() {
        return trainType;
    }
    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public String getTrainDetails(){
        return  "Train Number: " + this.trainNumber + ", Train Name: " + this.trainName + ", Train Type: " + (this.trainType == TrainType.FASTTRAIN? "Fast Train" : "Standard");
    }
}
