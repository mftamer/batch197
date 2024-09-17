package ssg_classes;

import java.util.ArrayList;

public class ForEachLoop01 {

    public static void main(String[] args) {

        //Question 1: Calculate the average of all elements in the "matrix" 2D array using nested foreach loops.
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        double sum =0;
        int count = 0;

        for (int[] row : matrix) {
            for (int num : row){
                sum+=num;
                count++;
            }

        }
        double average = sum/count;
        System.out.println("average = " + average);

        //Question 2: Remove duplicates from the "numbers" ArrayList and store only unique numbers in the
        //              "uniqueNumbers" ArrayList using a foreach loop
        ArrayList<Integer> number = new ArrayList<>();
        number.add(6);
        number.add(2);
        number.add(10);
        number.add(5);
        number.add(4);
        number.add(4);
        number.add(10);
        number.add(6);
        System.out.println(number);

        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (int w:number){
            if (!uniqueNumbers.contains(w)){
                uniqueNumbers.add(w);
            }
        }
        System.out.println("Unique Numbers = " + uniqueNumbers);


        //Question 3: Find the common elements between "array1" and "array2" and store them in the "commonElements"
        //              ArrayList using a foreach loop
        int [] array1 = {1,2,8,4,5};
        int [] array2 = {4,5,6,7,8};

        ArrayList<Integer> comEle = new ArrayList<>();

        for (int num1:array1){
            for (int num2 : array2){
                if (num1==num2){
                    comEle.add(num1);
                    break;
                }
            }
        }
        System.out.println("Common Elements = " + comEle);






    }

}
