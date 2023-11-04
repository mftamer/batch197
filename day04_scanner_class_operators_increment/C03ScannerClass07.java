package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C03ScannerClass07 {

    public static void main(String[] args) {

        //Example 5: Type code gets a mile from user then converts it to kilometers
        //           1 mile is 1.6 km

                Scanner scanner = new Scanner(System.in);

                // Get the number of miles from the user
                System.out.print("Enter the number of miles: ");
                double miles = scanner.nextDouble();

                // Convert miles to kilometers
                double kilometers = miles * 1.6;

                // Print the result
                System.out.println(miles + " miles is equal to " + kilometers + " kilometers");

    }

}
