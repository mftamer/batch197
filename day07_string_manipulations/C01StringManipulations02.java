package day07_string_manipulations;

public class C01StringManipulations02 {

    public static void main(String[] args) {

        //Example 1: Make the all digits except last 4 digits of a credit card invisible by using '*'
        //           1234 1234 1234 1234 ==> **** **** **** 1234

        String ccNum = "1234 1234 1234 1234";

        //Substring and replace

        //First Part
        String ccNum1 = ccNum.substring(0,15).replaceAll("[0-9]","*");
        System.out.println(ccNum1); //**** **** ****

        //Second Part
        String ccNum2 = ccNum.substring(15); //If only one index is given in substring, it will take everything after that index.

        //Final Part - Adding part 1 and part 2 (Concatenation)
        String hiddenccNum = ccNum1 + ccNum2; //First Method
        String hiddenccNum2 = ccNum1.concat(ccNum2); //Second method - concat() method
        System.out.println("hiddenccNum = " + hiddenccNum);
        System.out.println("hiddenccNum2 = " + hiddenccNum2);


        //Example 2: Count the number of characters different from space were used in a String
        //          "Tom Hanks was born in 1975."

        //Replace spaces is nothing and the count (length method)

        String s1 = "Tom Hanks was born in 1975.";
        // When you need to check a different type of indexes, use replaceAll
        // If you need to change specific one index (single character) use replacement
        int numOfChars = s1.replace(" ", "").length();
        System.out.println(numOfChars);

        // concat() method: It concatenate strings
        // replace(char,char) or replace(String,String) is used to change single char or sequence of char
        // replaceAll() is used when we need to use regex(regular expression).




    }

}
