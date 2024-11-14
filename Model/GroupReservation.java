package Model;

import java.sql.Date;

public class GroupReservation extends Reservation{
    String groupName;
    int numberofPassangers;
   
    public GroupReservation(String reservationID, Date reservationDate, String groupName, int numberofPassangers) {
        super(reservationID, reservationDate, isSeatReserve(), isCancelReserve());
        this.groupName = groupName;
        this.numberofPassangers = numberofPassangers;
    }
   
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public int getNumberofPassangers() {
        return numberofPassangers;
    }
    public void setNumberofPassangers(int numberofPassangers) {
        this.numberofPassangers = numberofPassangers;
    }
}
