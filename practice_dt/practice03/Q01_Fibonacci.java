package practice_dt.practice03;

import java.util.Scanner;

public class Q01_Fibonacci {

    public static void main(String[] args) {

        /*
   Ask user how many fibonacci numbers he wants to see. Then type the code that prints
   these fibonacci numbers.
   Ex: if user enters 6 output will be 112358

        */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount of fibonacci numbers you want to see");
        int n = input.nextInt();

        int fibo1=1;
        int fibo2=1;

        int fibonacci=0;

        System.out.print(fibo1 + " ");
        System.out.print(fibo2 + " ");

        for (int i =1 ; i<n-1 ; i++){

            fibonacci=fibo1+fibo2;
            fibo1 = fibo2; // assign fibo2 as a fibo1

            fibo2 = fibonacci; // assign fibonacci aka sum as a fibo2

            System.out.print(fibonacci+ " ");

        }



    }

}
