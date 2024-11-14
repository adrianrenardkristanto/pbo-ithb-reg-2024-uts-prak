package Model;

public abstract class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;
    private Passenger passenger;
    private OnlinePayment payment;
    private Train train;

    public Ticket(String ticketID, String seatNumber, ClassType classType, TicketStatus status, double price,
            Passenger passenger, OnlinePayment payment, Train train) {
        this.ticketID = ticketID;
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.status = status;
        this.price = price;
        this.passenger = passenger;
        this.payment = payment;
        this.train = train;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public OnlinePayment getPayment() {
        return payment;
    }
    public void setPayment(OnlinePayment payment) {
        this.payment = payment;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String printTicket();

    public abstract void getTicketStatus();
}
