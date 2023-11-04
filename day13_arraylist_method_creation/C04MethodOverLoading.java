package day13_arraylist_method_creation;

public class C04MethodOverLoading {

    public static void main(String[] args) {
        //Method Call
    add(3,8);

    }
    //Create a method to add two integers,
    public static int add(int a, int b){
        return a + b;
    }

    //Create a method to add three integers,
    public static int add(int a, int b, int c){
        return a+b+c;
    }

    //Create a method to add one integer, and one double
    protected static double add(int a, double b) {
        return a+b ;
    }

    //Create a method to add one double and one integer
    public static double add(double a, int b){
        return a+b;
    }
    public static double add(double a, double b) { return a+b; }

    //Method overloading: using the same method name with different parameters in a class
    //Parameters can be made different by three ways;
    //          i) different number of parameters
    //          ii) different data type
    //          iii) order of parameters if they have a different data type

    //Method signature: method name + parameters. Example: add(int a, int b)

    //Static and non-static methods can be over-loaded
    //Access modifiers, static keyword and return types cannot make methods different and can be used in method overloading

    //Java is OOP language. It has four principles;
    //                      i) Inheritance
    //                      ii) Polymorphism = method overloading + method overwriting
    //                      iii) Encapsulation
    //                      iv) Abstraction










}
