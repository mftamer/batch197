package day25_collections;

import java.util.Collections;
import java.util.LinkedList;

public class C02Collection02 {

    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>();
        countries.add("France");
        countries.add("Italy");
        countries.add("Albania");
        countries.add("Belgium");
        countries.add("Germany");
        System.out.println(countries); //[France, Italy, Albania, Belgium, Germany]

        LinkedList<String> names = new LinkedList<>();

        Collections.sort(countries); //use collections to sort
        System.out.println(countries); //[Albania, Belgium, France, Germany, Italy]

        /*
         peek() and element() methods return the first node without removing it
         For empty list peek() returns "null"
         For empty list element() throws exception
        */

        String country = countries.peek(); //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(country); //Albania
        System.out.println(countries); //[Albania, Belgium, France, Germany, Italy]

        System.out.println("names.peek() = " + names.peek()); //null

        String cnt = countries.element(); //Retrieves, but does not remove, the head (first element) of this list.
        System.out.println(cnt); //Albania
        System.out.println(countries); //[Albania, Belgium, France, Germany, Italy]
        //System.out.println("names.element() = " + names.element()); //throws NoSuchElementException

        System.out.println("countries.get(3) = " + countries.get(3)); //countries.get(3) = Germany
        //countries.

        // poll() and pop() methods:
        String cnt2 = countries.poll(); //Retrieves and removes the head (first element) of this list.
        System.out.println("cnt2 = " + cnt2); //cnt2 = Albania
        System.out.println(countries); //[Belgium, France, Germany, Italy]
        System.out.println("names.poll() = " + names.poll()); //names.poll() = null

        String cnt3 = countries.pop(); //Pops an element from the stack represented by this list. In other words,
                                        // removes and returns the first element of this list.
        System.out.println(cnt3); //Belgium
        System.out.println(countries); //[France, Germany, Italy]
        //System.out.println("names.pop() = " + names.pop()); // throws NoSuchElementException


    }

}
