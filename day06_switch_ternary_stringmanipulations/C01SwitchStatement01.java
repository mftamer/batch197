package day06_switch_ternary_stringmanipulations;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01SwitchStatement01 {

    public static void main(String[] args) {

        // Example 1: Type code that gives you the name of the day after you give number of the day.
        // 2-----> "Monday"     1-----> "Sunday"

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter day number....");
        byte dayNum = input.nextByte();


        //First Way
        if (dayNum == 1) {
            System.out.println( "It is Sunday.");
        } else if (dayNum == 2) {
            System.out.println( "It is Monday.");
        } else if (dayNum == 3) {
            System.out.println( "It is Tuesday.");
        } else if (dayNum == 4) {
            System.out.println( "It is Wednesday.");
        } else if (dayNum == 5) {
            System.out.println( "It is Thursday.");
        } else if (dayNum == 6) {
            System.out.println( "It is Friday.");
        } else if (dayNum == 7) {
            System.out.println( "It is Saturday.");
        } else {
            System.out.println(" Please enter a number between 1 and 7.");
        }

        //Second Way: Switch Statement

        switch (dayNum) {
            case 1:
                System.out.println("It is Sunday.");
                break;
            case 2:
                System.out.println("It is Monday.");
                break;
            case 3:
                System.out.println("It is Tuesday.");
                break;
            case 4:
                System.out.println("It is Wednesday.");
                break;
            case 5:
                System.out.println("It is Thursday.");
                break;
            case 6:
                System.out.println("It is Friday.");
                break;
            case 7:
                System.out.println("It is Saturday.");
                break;
            default: // Acts like else in if statement
                System.out.println(" Please enter a number between 1 and 7.");
                break; //Last break in switch statement is optional.
        }

        // Switch statement can take byte (Byte), short, int, char and String data types as input
        // Switch Statement doesn't accept long, double, float and boolean data types

    }

}
