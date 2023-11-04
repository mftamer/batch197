package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C05IfStatement03 {

    public static void main(String[] args) {

        //Example 4: Type a code to decide given day name is week day or weekend day.
        // Monday ----> Week day
        // Saturday ----> Weekend day

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Name of a day");
        String dayName = input.next();

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday")
                ||(dayName.equalsIgnoreCase("Tuesday"))
                ||(dayName.equalsIgnoreCase("Wednesday") )
                ||(dayName.equalsIgnoreCase("Thursday"))
                ||(dayName.equalsIgnoreCase("Friday"));

        boolean isWeekendDay = dayName.equalsIgnoreCase("Saturday")
                ||dayName.equalsIgnoreCase("Sunday");

        if (isWeekDay){
            System.out.println(dayName + " is Week day.");
        }else if( isWeekendDay){
            System.out.println(dayName + " is Weekend day.");
        }else {
            System.out.println("Please enter a valid name of a day.");
        }

        //Differentiate data and code
        //Make code user-friendly, easy to read


    }

}
