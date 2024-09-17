package ssg_classes;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {

        //Question 1: Write a Java program to add elements to an ArrayList of integers then remove the second element.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(50);
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println("ArrayList after removing the second Index: " + numbers);

        //Question 2
        //Write a Java program to retrieve the elements at a specific index from an ArrayList of strings.
        int fourth = numbers.get(3);
        System.out.println(fourth);

        //to find the size
        int size = numbers.size();
        System.out.println(size);

        //Question 3
        //Write a Java program to check if an ArrayList of strings is empty or not then
        //remove the first and last elements from the ArrayList of string.
        ArrayList<String> name = new ArrayList<>();
        name.add("John");
        name.add("Alice");
        name.add("Bob");
        name.add("Fatih");
        name.add("Ahmet");
        name.add("Walli");

        boolean check = name.isEmpty();
        System.out.println("Is the name ArrayList empty? " + check);

        name.remove(0);
        name.remove(name.size()-1);
        System.out.println(name);

        //Question 4:
        //Write a Java program to sort an ArrayList of strings in ascending and descending order then check either it
        // contain "Ali Can" or not. If the Ali Can was not exist, please add "Ali Can" as a third element in to the
        // list.
        Collections.sort(name);
        System.out.println(name);

        Collections.sort(name,Collections.reverseOrder());
        System.out.println(name);

        boolean isExist = name.contains("Ali Can");
        System.out.println("Is Ali Can exist? " + isExist);

        name.set(2, "Ali Can");
        System.out.println(name);





    }

}
