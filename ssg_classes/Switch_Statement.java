package ssg_classes;

import java.util.Scanner;

public class Switch_Statement {

    // Example 1: Type a program like ask user to enter a month name then by using the switch
    //              statement find the number of days in that month.

    //"January"=31
    //"March"=31
    //"May"=31
    //"July"=31
    //"August"=31
    //"October"=31
    //"December"=31
    //****
    //"April"=30
    //"Jun"=30
    //"September"=30
    //case "November"=30
    //****
    //"February"=28

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of a month:");
        String month = scan.next();
        String monthLow= month.toLowerCase();
        int daysInMonth;
        switch (month){
            case "January", "March", "May", "July", "August","October","December":
                daysInMonth = 31;
            break;

            case  "April", "June","September","November":
                daysInMonth=30;
                break;

            case "February":
                daysInMonth=28;
                break;

            default:
                daysInMonth=-1;
                break;
        }
        System.out.println(month +" has"+daysInMonth + " days!");

        /* Example 2: Ask user to enter age of a child then determine the category of a given age.
            0,1,2 = "Infant"
            3,4,5 = "Child"
            6,7,8,9,10 = "Preteen"
         */

        System.out.println("Enter age of your child:");
        int age = scan.nextInt();
        String category;

        switch (age){
            case 0,1,2:
            category = "Infant";
            break;

            case 3,4,5:
                category ="child";
                break;

            case 6,7,8,9,10:
            category = "Preteen";
            break;

            default:
                category = "Unknown";
       }
        System.out.println("The age category is: "+category);


        //Example 3: Ask a user to type a language then use a switch statement to assign a message based on the provided
        //              language.
        //              "Java", "Python", "C+
        System.out.println("Please enter a programming language");
        String language  = scan.next();
        String message;

        switch (language){
            case "Java":
                message = "Welcome to the world of Java!";
                break;
            case "Python":
                message = "Welcome to the world of Python";
                break;
            case "C++":
                message = "Welcome to the world of C++";
                break;
            default:
                message = "Unknown language";

        }
        System.out.println(message);


    }

}
