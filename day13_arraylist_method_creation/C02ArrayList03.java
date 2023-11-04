package day13_arraylist_method_creation;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02ArrayList03 {

    public static void main(String[] args) {

        //FAMOUS INTERVIEW QUESTION

        //From a given list find all pairs whose sum is a given number
        //{4, 6, 5, -10, 8, 5, 20} ==> 10
        //For example;  4+6=10, 5+5=10, -10+20=10

        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(6);
        a.add(5);
        a.add(-10);
        a.add(8);
        a.add(5);
        a.add(20);
        System.out.println("a = " + a);

        for (int i=0; i<a.size(); i++){
            for (int k=i+1; k<a.size() ;k++) {
                if (a.get(i) + a.get(k) == 10){
                    System.out.println(a.get(i)+ " + " + a.get(k) + " = 10");
                }
            }

        }


        // Short format to create ArrayList:
        // We can create ArrayList by using Arrays.asList() method as a short way.
        //But if we create a List like that, we cannot use List method which changes the size of the list;
        //like, add(), remove(), clear()
        List<Integer> d = Arrays.asList(4,6,5,-10,6);
        System.out.println(d);
        System.out.println("d.get(1) = " + d.get(1));

        /*
        System.out.println("d.get(1) = " + d.get(1));
        System.out.println("d.get() = " + d.get());
         */

        /*
        d.add(3);
        System.out.println(d);
         */

        /*
        d.remove(2);
        System.out.println(d);
        */

        /*
        d.clear();
        System.out.println(d);
        */

        d.set(2,34);
        System.out.println("d = " + d);

    }

}
