package day16_stringbuildier_stringbuffer_accessmodifiers;

public class C01StringBuilderAndStringBuffer {

    public static void main(String[] args) {

        /*
        1)Java has three ways to create String data;
            i) String Class
            ii)StringBuilder
            iii)StringBuffer Class

        2) String Class "immutable" but the other two are "mutable".
            When we update a value inString class, Java does not change the original value. ---> "Immutable"
            Java creates a new container and puts updated data in this container.
            When you update value in StringBuilder or StringBuffer, Java updates the original value. ---->"mutable"

        3) Is there other immutable class in Java: Yes, all Wrapper classes are immutable.

        4) The difference between StringBuilder and StringBuffer are;
            i) StringBuilder is faster
            ii) StringBuffer is "thread-safe" and "synchronized"
                a) Thread-safe = Can handle multiple tasks (threads) at the same time
                b) Synchronized = Can put threads in logical order.
         */

        String s = "Java";
        String t = "Java";
        String w = "Apex";
        System.out.println("before " + s); //Java
        //s=s+ "!"; // Even if you change 's', the original will stay in the memory, but we don't have the link with it.
        s = s.concat("!");
        System.out.println("after " + s); //Java

        StringBuilder y = new StringBuilder("Python");
        StringBuilder z = new StringBuilder("Python");
        y.append("!"); //append is concatenation for StringBuilder
        System.out.println(y);
        //Mutable class original values have changed, but immutable original data stays, but you create a new container.

        StringBuffer x = new StringBuffer("Ruby");
        System.out.println(x);

        // Methods used in StringBuilder:

        StringBuilder a = new StringBuilder(); //StringBuilder can only contain 16 characters. Capacity is 16.
        a.append("Hi!").append(" Java!..."); //But here length is 12.
        System.out.println(a);

        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("FL").append("Why").append("Fatih"); //capacity is 18 ---> 8*2+2
        System.out.println("a.length() = " + a.length());
        System.out.println("a.capacity() = " + a.capacity());
        System.out.println("stateAbbr.capacity() = " + stateAbbr.capacity()); // extra capacity = currentcapacity*2 +2 when there are multiple appends;
        System.out.println("stateAbbr.length() = " + stateAbbr.length());
        //If there is only one append and exceeds capacity, it adds whatever capacity it needs.

        /* SOME EXAMPLES
        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("FL").append("Why").append("Fatih"); //capacity is 18 ---> 8*2+2
        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("123456789"); // capacity is 9
        StringBuilder stateAbbr = new StringBuilder(3);
        stateAbbr.append("123456789").append("1"); // capacity is 20 and length is 10
         */

        //If they as you to reverse a word, let them use StringBuilder nad reverse method. If they say no use for loop methods
        //FAMOUS INTERVIEW QUESTION ^^^^^

        a.reverse();
        System.out.println(a); //...!avaJ !iH

        a.replace(0,4,"*");
        System.out.println(a); //*avaJ !iH

        /*
        a.replace(0,4,"what");
        System.out.println(a); //whatJ !iH
         */

        a.insert(6,"!");
        System.out.println(a); //*avaJ !!iH

        a.delete(6,8);
        System.out.println(a); //*avaJ iH

        a.deleteCharAt(0);
        System.out.println(a); //avaJ iH

        //StringBuffer methods
        StringBuffer sbf = new StringBuffer("Java");
        StringBuffer sbf1 = new StringBuffer("Kava"); //-1
        System.out.println(sbf.compareTo(sbf1)); //Compares two StringBuffer instances lexicographically
        StringBuffer sbf11 = new StringBuffer("Kaya");
        System.out.println(sbf.compareTo(sbf11)); // -1
        StringBuffer sbf111 = new StringBuffer("avaJ");
        System.out.println(sbf.compareTo(sbf111)); // -23. It will check the first letter at the beginning.


    }

}
