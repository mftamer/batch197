package day14_varargs_passbyvalue_passbyreference;

public class C02PassByValuePassByReference {
    public static void main(String[] args) {
        int a =5;
        int b=7;
        int r1= add(a,b);
        System.out.println("in the main 'original' ---->" + a);
        System.out.println("r1 = " + r1);
    }

    public static int add(int a, int b){
        a=a+2;
        System.out.println("in the method ----->" + a);
        return a+b;
    }

}

/*Pass by value: assignment operator and adjustments to the value of variable do not change the
value of variable in the main method. Java uses pass by value.*/
/*Pass by reference: assignment operator and adjustments to the value of variable change the
 value of variable in the main method. Some other programming languages use pass by reference*/