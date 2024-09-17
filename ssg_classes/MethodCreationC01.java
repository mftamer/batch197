package ssg_classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MethodCreationC01 {

    public static void main(String[] args) {

        int num =30;
        int squ = square(3,3);
        System.out.println(squ);

        int num2= 4;
        int square = calsqu(num2);
        System.out.println("Square of num2 is " +square);

        MethodCreationC01 methodCreationC01 = new MethodCreationC01();
        boolean check = methodCreationC01.isEven(19);
        System.out.println(check);
        int num3=19;
        if (methodCreationC01.isEven(num3)){
            System.out.println(num3 +" is even number");
        }else {
            System.out.println(num3 + " is odd number");
        }


        int num4 =20;
        if (isEven(num4)){
            System.out.println(num4 +" is even number");
        }else {
            System.out.println(num4 + " is odd number");
        }

        methodCreationC01.printCurrentDT();

    }

    //Question 1: Create a method in Java to calculate the square of an integer?
    public static int square (int power, int a ) {

        int b = a;
        for (int i = 1; i < power; i++) {

            a = a * b;

        }
        return a;


    }

    public  static int calsqu (int number){
        return number*number;
    }

    //Question 2: Write a Java method that checks if a given number is even or odd.
    public static boolean isEven(int num3){
        return num3 % 2 == 0;
    }


    //Question 3: Write a Java method that displays the current date and time.
    public void printCurrentDT(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDT = now.format(formatter);
        System.out.println("Current Date and Time: " + formatDT);
    }
}
