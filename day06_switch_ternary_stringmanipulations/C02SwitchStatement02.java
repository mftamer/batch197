package day06_switch_ternary_stringmanipulations;

import java.util.Scanner;

public class C02SwitchStatement02 {

    public static void main(String[] args) {

        // Example 2: Ask user to enter name of a month then print month name starting from given month till the end.
        // October -----> October November December

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Name of a Month:....");
        String month = input.next().toLowerCase();

        switch (month) {
            case "january" :
                System.out.println("January");
            case "february" :
                System.out.println("February");
            case "march" :
                System.out.println("March");
            case "april" :
                System.out.println("April");
            case "may" :
                System.out.println("May");
            case "june" :
                System.out.println("June");
            case "july" :
                System.out.println("July");
            case "august" :
                System.out.println("August");
            case "september" :
                System.out.println("September");
            case "october" :
                System.out.println("October");
            case "november" :
                System.out.println("November");
            case "december" :
                System.out.println("December");
                break;
            default:
                System.out.println("Please Enter a Valid Name of a Month.");
        }

    }

}
