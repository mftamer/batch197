package ssg_classes;

public class Arrays01 {

    public static void main(String[] args) {

        //Question 1: find the largest Number in this Array.
        int [] numbers = {5, 10, 3, 8, 15};

        int max = numbers[0];

        for(int w : numbers){

            max = Math.max(max,w);
        }

        System.out.println(max);

        //Question 2: Calculating the sum of all numbers.

        int sum=0;

        for (int z :numbers){
            sum = sum+ z;
        }
        System.out.println(sum);

        int check =11;
        boolean yes=false;

        for (int w:numbers){
            if (w==check){
                yes = true;
            }

        }

        if (yes){
            System.out.println("Exists");
        }else {
            System.out.println("Not Exists");
        }

        //Question 4: finding the longest string
        String [] words = {"apple", "orange", "banana", "strawberry"};

        String longest = "";

        for (String w :words){
            if (w.length()>longest.length()){
                longest=w;
            }
        }
        System.out.println("The longest string is "+longest);

        //Question 5: Concatenating all string s in the array
        String result= "";
        for (String w: words){
            result = result + w;
        }
        System.out.println(result);
    }
}
