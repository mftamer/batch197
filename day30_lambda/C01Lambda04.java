package day30_lambda;

import java.util.stream.IntStream;

public class C01Lambda04 {

    public static void main(String[] args) {

        System.out.println(sumOfNumsBetween(11, 9)); //30
        System.out.println(productOfNumsBetween(6, 4)); //120
        try{
            System.out.println(factorialOfNum(-4)); //24
        }catch (IllegalArgumentException e){
            System.out.println("Please give values grater than zero!");
        }


    }
//Example 1: Create a method to find the sum of integers from 7 to 100
    public static int sumOfNumsBetween(int beginning, int ending){
        if (beginning>ending){
            int spare = beginning;
            beginning = ending;
            ending = spare;
        }
        return IntStream.
                rangeClosed(beginning, ending).
                sum();
    }

    // Example 2: Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int productOfNumsBetween(int starting, int ending){
        if (starting>ending){
            starting=starting+ending;
            ending=starting-ending;
            starting=starting-ending;
        }
        return IntStream.
                rangeClosed(starting, ending).
                reduce(Math::multiplyExact). //different way
        //      reduce(1,(t,u)->t*u);
                getAsInt(); //need this at the end if you choose the different way

    }

    // Example 3: Create a method to find the factorial of a given number(5! = 1*2*3*4*5)
    public static int factorialOfNum(int e){
        if(e<0){
            throw new IllegalArgumentException("Factorial can not be negative!");
        }
        return IntStream.
                rangeClosed(1,e).
                reduce(1,(t,u)->t*u);
    }

    /*
        Lambda Expression: "Variable(s) --> Operations" structure is called "Lambda Expression"
        Method Reference: "Class Name :: Method Name without parenthesis" is called "Method Reference"
     */


}
