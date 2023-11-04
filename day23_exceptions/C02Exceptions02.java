package day23_exceptions;

public class C02Exceptions02 {
    /*
        1) Exceptions are strict rules in Java to protect developers from critical mistakes.
            For example, when doing division if we try to divide by zero, this is a critical mathematical mistake. When
                Java encounters such a mistake, it "throws exception":
                    i) Explain about the exception
                    ii) Stop execution
        2) When exception occurs in the codes, the following codes will not be executed.
        3) When exception occurs in try block following codes will not be executed, Java will jump to catch block.
     */

    public static void main(String[] args) {

        System.out.println("divide(6,2) = " + divide(6, 2)); //3
        System.out.println("divide(1,2) = " + divide(1, 2)); //0
        System.out.println("divide(0,2) = " + divide(0, 2)); //0
        System.out.println("divide(4,0) = " + divide(4, 0)); //Exception Error - Arithmetic Exception
                                                                    //When it faces critical mathematical mistakes
        System.out.println("Hi!");
        System.out.println("divide(4,0) = " + divideTwoNumber(8, 0));
        System.out.println("Goodbye!");

        System.out.println(numberOfCharInString("Java"));
        System.out.println(numberOfCharInString(""));
        System.out.println(numberOfCharInString(null)); //.NullPointerException - Java throws NullPointerException when
                                                        // using null value for same methods
        System.out.println("numberOfCharactersInString(null) = " + numberOfCharactersInString(null));

    }
    // Type a method to divide two integers

    //First Way: (Not Recommended)
    public static int divide(int a,int b){

        if (b==0){
            return 0;
        } //else no need to write because return is zero
        return a/b;

    }

    //Second Way: try-catch block
    public static int divideTwoNumber(int a,int b){

        int result=0;
        try {
            result =a/b;
            System.out.println("Hello World!");
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by zero!");
        }

        return result;
    }

    //Type a method that finds number of chars in a given String

    //First Way: Not recommended
    public static int numberOfCharInString(String str){
        if (str==null){
            return 0;
        }

        return str.length();
    }

    public static int numberOfCharactersInString(String str){
       int result = 0;
       try {
           result = str.length();
       }catch (NullPointerException e){
           System.out.println("Deep!");
           result = 0;
       }
        return result;
    }


}
