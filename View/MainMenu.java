package View;

import Controller.TrainController;

public class MainMenu {
    private TrainController ctrl;

    public MainMenu(TrainController ctrl) {
        this.ctrl = ctrl;
    }

    public void printProcessPayment(){
        System.out.println(ctrl.processPayment("credit", 111));
    }

    public void printTotalRevenue(){
        System.out.println(ctrl.calculateTotalRevenue());
    }
}