package Controller;

import java.sql.Date;

import Model.*;

public class TrainController {
    private Passenger passengers[];
    private Reservation reservations[];
    private Ticket tickets[];
    private static int counter = 1;
    
    public TrainController(Passenger passengers[], Reservation[] reservations, Ticket[] tickets) {
        this.passengers = passengers;
        this.reservations = reservations;
        this.tickets = tickets;
    }
    
    
    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }
   
    public Reservation[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public double processPayment(String trainType){
        double price = 0;
        
        for (Ticket tiket: tickets) {
            for (Reservation reservation : reservations) {
                if (tiket.getReservation().getReservationID().equals(reservation.getReservationID())) {
                    if (tiket.getPayment().getPaymentGateway().equalsIgnoreCase("PayPal") || tiket.getPayment().getPaymentGateway().equalsIgnoreCase("DOKU") || tiket.getPayment().getPaymentGateway().equalsIgnoreCase("Xendit")) {
                        if (tiket.getTrain().getTrainType() == TrainType.FASTTRAIN) {
                            if (tiket.getClassType() == ClassType.FIRST_CLASS) {
                                price = 600000;
                            }else if(tiket.getClassType() == ClassType.BUSINESS_CLASS){
                                price = 500000;
                            }else if(tiket.getClassType() == ClassType.ECONOMY_CLASS){
                                price = 400000;
                            }
                        }else if(tiket.getTrain().getTrainType() == TrainType.STANDARD){
                            if (tiket.getClassType() == ClassType.FIRST_CLASS) {
                                price = 350000;
                            }else if(tiket.getClassType() == ClassType.BUSINESS_CLASS){
                                price = 250000;
                            }else if(tiket.getClassType() == ClassType.ECONOMY_CLASS){
                                price = 175000;
                            }
                        }
                        
                    }
                }
            }
        }
        return price;
    }
    
    public double calculateTotalRevenue(Date date){
        double total = 0;
        for (Ticket tiket: tickets) {
            total += reservation.ge
        }
    }

}
