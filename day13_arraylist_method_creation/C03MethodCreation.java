package day13_arraylist_method_creation;

public class C03MethodCreation {

    public static void main(String[] args) {

        //Method Call:
        int r1 = add(3,7); //Non-static method 'add(int, int)' cannot be referenced from a static context
        System.out.println("r1 = " + r1);

        double r2 = multiplyThreeNumbers(2.1,3.5,4.5);
        System.out.println("r2 = " + r2);

        String r3 = join("Ja", "va");
        System.out.println("r3 = " + r3);

    }

    //Type a method to add numbers

    public static int add(int a , int b) { //add static before int to make it work in the main method
        int sum = a + b;
        return sum;

    }

    //Type a method to multiply three numbers;

    public static double multiplyThreeNumbers(double a, double b, double c){
        return a*b*c;
    }

    // Type a method that joins two Strings;
    public static String join(String a, String b){
    //    return a+b; right but hard coding
        return a.concat(b); // better way
    }


}
