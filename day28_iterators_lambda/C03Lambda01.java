package day28_iterators_lambda;

import java.util.ArrayList;
import java.util.List;

public class C03Lambda01 {
    /*
        1) Lambda is "Functional Programming Language".So far we were using "Structural Programming Language"
        2) "Structural Programming" focuses on "how to do" part
            "Functional Programming" focuses on "what to do" part
     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        System.out.println(nums); //[12, 9, 131, 14, 9, 10, 4, 12, 15]

        printElements(nums); //12 9 131 14 9 10 4 12 15
        System.out.println(); // just to separate them
        printElements2(nums); //12 9 131 14 9 10 4 12 15
        System.out.println(); // just to separate them
        printEvenElements(nums); //12 14 10 4 12
        System.out.println(); // just to separate them
        printEvenElements2(nums); //12 14 10 4 12
        System.out.println(); // just to separate them
        printSquareOfOddElements(nums); //81 17161 81 225
        System.out.println(); // just to separate them
        printCubeOfUniqueEvenElements(nums); //1728 2744 1000 64
        System.out.println(); // just to separate them
        System.out.println(printSumOfSquareUniqueEvenElements(nums)); //456
    }
    // Create a method that prints all elements on the same line with space between them

    //First way: Structural Programming
    public static void printElements(List<Integer> list){
        for (Integer w:list){
            System.out.print(w + " ");
        }
    }
    //Second way: Functional Programming
    public static void printElements2(List<Integer> list){
        list.stream().forEach(t-> System.out.print(t + " ")); //stream(): Returns a sequential Stream with this
                                                                // collection as its source.
                                                                //forEach(): Performs an action for each element of this
                                                                // stream.
    }
    //Example 2: Create a method to print even elements on the console in the same line with a space between them

    //First way:
    public static void printEvenElements(List<Integer> list){
        for (Integer w:list){
            if (w%2==0){
                System.out.print(w + " ");
            }
        }
    }
    //Second Way:
    public static void printEvenElements2(List<Integer> list){
        list.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" ")); //filter(): Returns a stream consisting
                                                                                // of the elements of this stream that
                                                                                // match the given predicate.
    }

    //Example 3: Create a method to print the square of odd elements on the console in the same line with a space
    // between them
    public static void printSquareOfOddElements(List<Integer> list){
        list.stream().filter(t-> t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //maps():Returns a stream consisting of the results of applying the given function to the elements of this
        // stream.
    }

    //Example 4: Create a method to print the cube of unique even elements on the console in the same line with a space
    // between them

    public static void printCubeOfUniqueEvenElements(List<Integer> list){
        list.stream().filter(t-> t%2==0).distinct().map(t->t*t*t).forEach(t-> System.out.print(t+" "));
        //distinct():Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this
        // stream.
    }

    //Example 5: Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements

    public static int printSumOfSquareUniqueEvenElements(List<Integer> list){
        return list.stream().distinct().filter(t-> t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        //reduce(): Performs a reduction on the elements of this stream, using the provided identity value and an
        // associative accumulation function, and returns the reduced value.

    }

}
