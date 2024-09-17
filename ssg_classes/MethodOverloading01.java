package ssg_classes;

public class MethodOverloading01 {

    //Q1. Write a Java method that calculates the area of a rectangle or a square using method overloading.
    public static double area (int a, int b){
        return a*b;
    }

    public static double area (int a){
        return a*a;
    }


    //Q2. Write a Java method that concatenates two or three strings using method overloading.
    public static String add (String a, String b){
        //return a.concat(b);
        return a+" "+b;
    }

    public static String add (String a, String b, String c){
        return a.concat(b.concat(c));
    }

    public static String StrConc (String a, String b){
        return a + " " +b;
    }
    public static String StrConc (String a, String b,String c){
        return a + " " +b+" " +c;
    }


    //Q3. Write a Java method that finds the maximum of two numbers using method overloading.
    public static int maxNum (int num1, int num2){
        return Math.max(num1,num2);
    }
    public static double maxNum (double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static int findMaximum(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double findMaximum(double a, double b) {
        return (a > b) ? a : b;
    }

    //Q4. Write a Java method that calculates the average of an array of numbers or decimals  using method overloading.
    public static int calAve(int[] numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        return sum/numbers.length;
    }

    public static double calAve(double[] numbers){
        double sum = 0.0;
        for (double num : numbers){
            sum = sum+ num;
        }
        return sum/numbers.length;
    }

    public static void main(String[] args) {

        //Q-01
        System.out.println(area(3));
        System.out.println(area(3, 5));

        //Q-02
        System.out.println(add("Fatih", "Tamer"));
        System.out.println(StrConc("Fatih", "Tamer", "Hocam"));

        //Q-03
        System.out.println(maxNum(5, 20));
        System.out.println(maxNum(20.5, 20.3));

        System.out.println(findMaximum(1.23, 1.22));
        System.out.println(findMaximum(10, 12));

        //Q-04
        int[] numbers4 = {1, 2, 3, 4, 5};
        System.out.println(calAve(numbers4));

        double[] numbers3 = {1.2, 5.4, 6.3, 8.1};
        System.out.println(calAve(numbers3));

    }

}