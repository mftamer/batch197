package practice_dt.practice02;

import java.util.Scanner;

public class Q02_IfStatements {

    public static void main(String[] args) {

        /*
           Ask user to enter his age, then print his situation according to the given table
           0-4==>Baby  5-12==>Kid  13-20==>Young   21-30==>Adult  31-?==>Undefined
        */


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age, please....");

        byte age = input.nextByte();

        if (age<0 ) {
            System.out.println("Enter a valid age value.");

        } else if (age<5){
            System.out.println("Baby.");

        }else if (age<13){
            System.out.println("Kid.");
            
        } else if (age<21) {
            System.out.println("Young.");
            
        } else if (age<31) {
            System.out.println("Adult.");
        } else if (age>30) {
            System.out.println("Undefined.");
        } else
            System.out.println("Enter a valid age.");


    }


}
