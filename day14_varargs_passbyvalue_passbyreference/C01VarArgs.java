package day14_varargs_passbyvalue_passbyreference;

public class C01VarArgs {

    public static void main(String[] args) {

        int r1 = add();
        System.out.println(r1);

        int r2 = add(3);
        int r3 = add(3,4,9);
        int r4 = add(3,7,5,3,4,98,65,32,1,11,23,43);
        System.out.println(r4);
        System.out.println(r3);
        System.out.println(r2);

    }
    /*
    //Type a method to add integers

    public static int add(int a, int b){
        return a+b;
    }

    //What if I give you three ints?
    public static int add (int a, int b, int c) {
        return a + b + c;
    }

    //What if I give you four ints?
    public static int add (int a, int b, int c, int d) {
        return a + b + c +d;
    }

     */

    // "VarArgs" stands for "Variable Arguments"
    // "VarArgs" has logic of Arrays behind. When using "VarArgs" think of Arrays.
    // You cannot add another parameter after VarArg.
    //You cannot add another parameter (variable) after Vararg, because it is never ending pit.
    //You can input parameter before Vararg, so they do that action first then fill the Vararg.
    //You cannot use more than one VarArg in a method.


    public static int add (int ... a){ // Just 3 dots
        int sum = 0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }

}
