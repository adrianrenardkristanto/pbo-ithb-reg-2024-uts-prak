package Model;

import java.sql.Date;

public class Reservation {
    private String reservationID;
    private Date reservationDate;
    private boolean seatReserve;
    private boolean cancelReserve;
    
    public Reservation(String reservationID, Date reservationDate, boolean seatReserve, boolean cancelReserve) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
        this.seatReserve = seatReserve;
        this.cancelReserve = cancelReserve;
    }
    
    public boolean isCancelReserve() {
        return cancelReserve;
    }

    public void setCancelReserve(boolean cancelReserve) {
        this.cancelReserve = cancelReserve;
    }

    public boolean isSeatReserve() {
        return seatReserve;
    }

    public void setSeatReserve(boolean seatReserve) {
        this.seatReserve = seatReserve;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String reserveSeat(){
        if (this.seatReserve) {
            return "Seat sudah direservasi";
        }else{
            return "Anda belum mereservasi kursi manapun";
        }
    }

    public String cancelReservation(){
        if (this.cancelReserve) {
            return "Anda membatalkan reservasi ini.";
        }else{
            return "Reservasi ini tidak dibatalkan";
        }
    }
}
