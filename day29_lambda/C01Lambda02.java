package day29_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C01Lambda02 {

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

        System.out.println(sumOfSqOfDistinctEvenEle(nums)); //456
        System.out.println(proOfDistinctCubeOfOddEle(nums)); //45
        System.out.println(findMax(nums)); //131
        System.out.println(findMax2(nums)); //131
        System.out.println(findMinValueOfEvenGreaterThanNum(nums, 7)); //10
    }

// Ex 1: Create method that calculates the 'sum' of the 'square' of 'distinct' 'even' elements of a list


    public static int sumOfSqOfDistinctEvenEle(List<Integer> list) {
        return list.stream().distinct().filter(nums -> nums % 2 == 0).map(nums -> nums * nums).reduce(0,
                (nums, u) -> nums + u);  // reduce is used to add

    }

    // Ex 2: Create a method that calculates the 'multiplication' of 'last digit' of 'distinct' 'odd' elements in a list
//                                                              > this should be %10 brings you the remainder
    public static int proOfDistinctCubeOfOddEle(List<Integer> list) {
        return list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t % 10).reduce(1, (t, u) -> t * u);
    }

//Example 3: Find the maximum element in the list

    public static int findMax(List<Integer> list) {
        return list.stream().distinct().reduce(list.get(0), (t, u) -> t > u ? t : u); // reduce needs two parameters, return
        // integer

    }

    // The Second way Put the elements in ascending order, then the last element will be the maximum

    public static int findMax2(List<Integer> list) {                // sorted puts it's in natural order
        return list.stream().distinct().sorted().reduce((t, u) -> u).get();    // single parameter returns optional,
        // so we need .get, to turn it into the data type we want
    }

    //3.Way: Put the elements in descending order then the first element will be the maximum
    public static int findMaximum3(List<Integer> list) {
        return list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
    }
    //Homework: Find the minimum element in the list by using 3 ways.
    //Example 4: Create a method to find the minimum value which is greater than 7 and even from the list

    public static int findMinValueOfEvenGreaterThanNum(List<Integer> list, int num) {
        return list.
                stream().
                distinct().
                filter(t -> t % 2 == 0 && t > num).
                sorted().
                findFirst().
                get(); //get() is to remove optional.
    }
}

