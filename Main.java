import Model.*;
import View.*;
import Controller.*;

public class Main {
    
    public static void main(String[] args) {
        Passenger passengers[] = new Passenger[2];
        Reservation reservations[] = new Reservation[2];
        Ticket tickets[] = new Ticket[2];
        createDummy(passengers, reservations, tickets);
        
        TrainController ctrl = new TrainController(passengers, reservations, tickets);
        MainMenu showMenu = new MainMenu(ctrl);

        // ctrl.processPayment("credit", 101);
        // ctrl.processPayment("credit", 102);

        // showMenu.printProcessPayment();
        // showMenu.printTotalRevenue();
    }

    public static void createDummy(Passenger passengers[], Reservation reservations[], Ticket tickets[]){
        passengers[0] = new Passenger("1123049", "Adrian",1, 19);
        passengers[1] =  new Passenger("1123001", "Kezia", 0, 19);

        // for (int i = 0; i < t.length; i++) {
        //     for (int j = 0; j < rooms[i].length; j++) {
        //         if (i == 0) {
        //             rooms[i][j] = new Room(Integer.parseInt((i+1) + "0" + (j+1)), (i+1), 1000000, 4, RoomStatus.EMPTY);
        //         }else if (i == 2){
        //             rooms[i][j] = new Room(Integer.parseInt((i+1) + "0" + (j+1)), (i+1), 1250000, 6, RoomStatus.EMPTY);
        //         }else if (i ==3){
        //             rooms[i][j] = new Room(Integer.parseInt((i+1) + "0" + (j+1)), (i+1), 2350000, 10, RoomStatus.EMPTY);
        //         }else{
        //             rooms[i][j] = new Room(Integer.parseInt((i+1) + "0" + (j+1)), (i+1), 2350000, 10, RoomStatus.EMPTY);
        //         }
        //     }
        // }

        // reservations[0]= new Reservation(1, 2, ReservationStatus.PAID , customers[0]);
        // reservations[0].bookRoom("Basic", rooms);
        // reservations[1] = new Reservation(2, 4, ReservationStatus.PAID, customers[1]);
        // reservations[1].bookRoom("Basic", rooms);
    }
}
