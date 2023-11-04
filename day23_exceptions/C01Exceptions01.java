package day23_exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C01Exceptions01 {

    public static void main(String[] args) {

        int totalPrice =1200;
        System.out.println("Your total Price is = " + totalPrice);
        System.out.println("Your installment payment is = "+ installmentPayment(totalPrice));
        //Type a method to calculate monthly payments.
    }
    public static int installmentPayment (int price){
        Scanner input = new Scanner (System.in);
        System.out.println("How many installments do you want?");
        int numberOfInstallment = input.nextInt();
        if (numberOfInstallment==0){
            return price;
        }
        int monthlyPayment;
        monthlyPayment = price/numberOfInstallment;
        return monthlyPayment;
    }
}
