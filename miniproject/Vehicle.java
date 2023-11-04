package miniproject;

    /*
       Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: December 2024, June 2024
      1st term: June 2024                      2nd term: December 2024
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
       To be able to let user restart, we should present the option to restart
    */

import java.util.Scanner;
public class Vehicle {
    public String type;
    public int payment;
    public int countPayment(int term){

        if (term==1){
            switch (type){
                case "CAR":
                    payment=2000;
                    break;
                case "TRUCK":
                    payment=3000;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment=1500;
                    break;
                default:
                    System.out.println("Incorrect date entrance!");
                    payment=0;
            }
        } else if (term==2) {
            switch (type){
                case "CAR":
                    payment=2500;
                    break;
                case "TRUCK":
                    payment=3500;
                    break;
                case "BUS":
                    countBusPayment(term);
                    break;
                case "MOTORCYCLE":
                    payment=1750;
                    break;
                default:
                    System.out.println("Incorrect date entrance!");
                    payment=0;
            }
        }else {
            System.out.println("Incorrect data entrance!");
        }
        return payment;
    }
    public int countBusPayment(int term){
//countBusPayment is yellow underlined because it wants it to make it void, but we return payment, therefore, we
//cannot do it void
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the type of bus: ");
        System.out.println("For Type 1 Buses (18-30 seats) Press 1 \n For Type 2 Buses (31 and above seats) Press 2");
        int busType = input.nextInt();
        switch (busType) {
            case 1:
            if (term == 1) {
                payment = 4000;
            } else {
                payment = 4500;
            }
            break;
            case 2:
                if (term == 2) {
                    payment = 5000;
                } else {
                    payment = 5500;
                }
            break;
            default:
                System.out.println("Incorrect data entrance!");
        }
        return payment;
    }
}
