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

public class VehicleInsurancePaymentCalculation {

    public static void main(String[] args) {

    startCalculation();


    }

    public static void startCalculation(){
        boolean isFailed;
        Scanner input = new Scanner(System.in);

        do {
            isFailed=false; // to move on the application

            System.out.println("--------Welcome to Vehicle Insurance Calculation Application--------");
            System.out.println("Choose a term for payment calculation.");
            System.out.println("Press 1 for term June 2024 or Press 2 for term December 2024!");

            int term = input.nextInt();

            if (term ==1 || term ==2){

                Vehicle objVehicle = new Vehicle(); //default constructor
                System.out.println("Enter the type of the vehicle for payment calculation: ");
                System.out.println("Car, Truck, Bus, Motorcycle");

                objVehicle.type = input.next().toUpperCase(); // to get the calculation from Vehicle class
                objVehicle.payment = objVehicle.countPayment(term);
                //Check if the payment value is greater than 0 give a message to the user "Calculation is done!"
                //If the payment is 0, then give a message to the user "Calculation Failed!"

                String termName = term==1 ? "June 2024" : "December 2024";

                int select;

                if (objVehicle.payment>0){
                    System.out.println("Calculation is Done!");
                    System.out.println("Vehicle Type: " + objVehicle.type);
                    System.out.println("Term: " + termName);
                    System.out.println("The Total Payment: "+objVehicle.payment);

                    System.out.println("To Restart Please Press 1, To Exit Please Press 0");
                    select=input.nextInt();

                    if (select ==1){
                        isFailed=true;
                    }else {
                        isFailed=false;
                        System.out.println("Goodbye user! ");
                    }

                }else {
                    System.out.println("Incorrect data entrance!");
                    System.out.println("To Restart Please Press 1, To Exit Please Press 0");
                    select= input.nextInt();

                    if (select ==1){
                        isFailed=true;
                    }else {
                        isFailed=false;
                        System.out.println("Goodbye user! ");
                    }


                }



            }else {
                System.out.println("Incorrect data entrance");
                //System.out.println("To restart press 1, to exit press 0");
                isFailed=true;




            }



        }while(isFailed);


    }

}
