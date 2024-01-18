package day29_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C02Lambda03 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        printAscendListAccToLengthUpCase(names); //TOM JIM ALEX MARY ALEX MICHAEL ALEXANDER
        System.out.println("");
        printAscendListAccToLengthAndAlphaUpCase(names); //JIM TOM ALEX ALEX MARY MICHAEL ALEXANDER
        System.out.println("");
        System.out.println(isLenghtOfAllElementsGreaterThanNum(names, 2)); //true
        System.out.println(isLenghtOfAnyElementsGreaterThanNum(names, 7)); //true
        System.out.println(isNonOfElementsStartWithValue(names, "9")); //true

    }

    //Example 1: Print the list elements on the console with all characters in uppercase by sorting in ascending order
                //  by using length
    public static void printAscendListAccToLengthUpCase(List<String> list){
        list.
                stream().
                sorted(Comparator.comparing(String::length)). //t-> t.toString().length()) can be after comparing
                map(String::toUpperCase). //t -> t.toUpperCase() , String::toUpperCase
                forEach(t-> System.out.print(t+" "));
    }

    //Example 2: Sort the elements by using their lengths if some elements are in the same length put them in
                // alphabetical order (continue from example 1)
    public static void printAscendListAccToLengthAndAlphaUpCase(List<String> list){
        list.
                stream().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.toString().length()).thenComparing(t -> t.toString().charAt(0))).
                forEach(t-> System.out.print(t+" "));
    }

    //Example 3: Create a method checks if the lengths of all elements are greater than a given value
    public static boolean isLenghtOfAllElementsGreaterThanNum (List<String> list, int num){
        return list.
                stream().
                allMatch(t->t.length()>num);
    }

    //Example 3: Create a method checks if the lengths of any elements are greater than a given value
    public static boolean isLenghtOfAnyElementsGreaterThanNum (List<String> list, int num){
        return list.
                stream().
                anyMatch(t->t.length()>num);
    }

    //Example 5: Create a method checks if no element starts with the given value
    public static boolean isNonOfElementsStartWithValue(List<String> list,String s){
        return list.
                stream().
                noneMatch(t-> t.substring(0,1).equals(s));
    }

}
