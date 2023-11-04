package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C02ScannerClass06 {

    public static void main(String[] args) {

        //Example 4: Ask user to enter 5 digit integer like 45678
        //           Type codes to print the sum of the first two and the last two numbers
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 5 digit integer number; ");
        int fiveDigit = input.nextInt();
        int firstTwoDigits = fiveDigit/1000; //to get the first two digits
        /*
        Modulus Operator: Returns the remainder of the division operation.
                          It is used very often.
                          The symbol for modulus operator is '%'
         */
        int lastTwoDigits = fiveDigit % 100; // 45678/100=456, and the remainder is 78
                                             //the operation will take 78

        int sum = firstTwoDigits + lastTwoDigits;
        System.out.println("The sum of first two digits and last digits of " + fiveDigit + " is "+ sum);
    }
}
