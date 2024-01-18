package day30_lambda;

import java.util.stream.IntStream;

public class C02Lambda05 {

    public static void main(String[] args) {

        System.out.println(findSumOfDigits(45, 47)); //30
        System.out.println(getSquareOfLastDigitOfEvens(10, 14)); //20

    }

    //Example 1: Create a method to calculate the sum of digits of every integer between given two integers
    //          45 46 47 ==? 4+5+4+6+4+7 = 30
    public static int findSumOfDigits(int s, int e){
        return IntStream.
                rangeClosed(s,e).
                map(Utils::sumOfDigits).
                sum();
    }
    //Example 2: Create a method to calculate the sum of the squares of the last digit of even elements.
    public static int getSquareOfLastDigitOfEvens(int s, int e){
        return IntStream.
                rangeClosed(s,e).
                filter(Utils::isEven).
                map(t->t%10).
                map(Utils::takeSquare).
                sum();
    }
}
