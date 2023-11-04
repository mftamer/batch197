package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C04IfStatement02 {

    public static void main(String[] args) {

        /* Example 3: Ask a user to enter an initial letter of a day, then print all possible days starting with that
                     initial.
          'M' ----> Monday
          'T' ----> Tuesday and Thursday
          'W' ----> Wednesday
          'F' ----> Friday
          'S' ----> Saturday and Sunday
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter initial letter of a day");
        char initial = input.next().charAt(0); //To get char from String we use input.next().charAt(0)

        // initial Character.toLowerCase(initial)

        if(initial=='M' || initial =='m'){
            System.out.println("Monday");
        }
        else if (initial=='T'|| initial =='t') {
            System.out.println("tuesday and Thursday");
        }
        else if (initial=='W' || initial =='w') {
        System.out.println("Wednesday");
          }
        else if (initial=='F' || initial =='f') {
        System.out.println("Friday");
        }
        else if (initial=='S' || initial =='s') {
            System.out.println("Saturday and Sunday");
        }
        else {
                System.out.println("Please enter a valid initial letter");
        }










}

}
