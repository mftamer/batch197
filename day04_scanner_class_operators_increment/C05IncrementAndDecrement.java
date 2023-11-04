package day04_scanner_class_operators_increment;

public class C05IncrementAndDecrement {

    public static void main(String[] args) {
        /*
        Increment means to increase the value of a variable
         */

        int age = 15;
        System.out.println(age+1); //16
        System.out.println(age);  //15

        // First way of Increment
        age = age +1; //Assignment Operator
        System.out.println(age); //16

        //Second way of Increment
        age +=5;
        System.out.println(age); //21

        //We can do increment by multiplication as well
        age = age*2;
        System.out.println(age); //42

        //Second way of multiplication in increment
        age *= 2;
        System.out.println("age = " + age); //84

        /*
        Decrement means to decrease the value of a variable
         */

        age = age - 3;
        System.out.println(age); //81

        //Second way

        age -= 1;
        System.out.println(age); // 80

        //Division

        age = age/4;
        System.out.println(age); //20

        //second way

        age /= 5;
        System.out.println("age = " + age); //4

        // Special format for increment by 1 and decrement by 1
        age++;
        System.out.println(age); //5

        age--;
        System.out.println(age); //4


    }

}
