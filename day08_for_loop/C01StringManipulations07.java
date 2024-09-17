package day08_for_loop;

public class C01StringManipulations07 {

    public static void main(String[] args) {

        String str = "Java is Java";
        char chr = str.charAt(2);
        System.out.println(chr); //v

        boolean b1 = str.startsWith("J");
        System.out.println(b1); //true

        boolean b2 = str.endsWith("A");
        System.out.println(b2); //false

        System.out.println("str.repeat(3) = " + str.repeat(3)); //str.repeat(3) = Java is JavaJava is JavaJava is Java

        boolean b3 = str.contains("Java");
        System.out.println("b3 = " + b3); //b3 = true

        //trim() removes a single leading white space and a single trailing white space, but does not remove multiple leading or trailing white spaces.
        //strip() removes both leading and trailing white spaces from a string.



    }

}
