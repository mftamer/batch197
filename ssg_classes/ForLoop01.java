package ssg_classes;

public class ForLoop01 {

    public static void main(String[] args) {


//        //Example 1: Calculating the sum of numbers from 1 to 10
//        int sum = 0;
//        for (int i =1; i<=10 ; i++){
//            //sum= sum+i;
//            sum+= i;
//        }
//        System.out.println("Sum = "+sum );

        //Example 2: Printing characters of a string in negative order and uppercase.
        String message = "Hello World";
        for (int i = message.length()-1 ; i>=0 ; i--){
            System.out.print(message.toUpperCase().charAt(i));
        }



        System.out.println("***************");

        //Example 3: Iterating over an array and calculating its sum
        int[] numbers = {1, 2, 5, 4, 8, 12};
        int sum1 = 0;
        for (int i = 0; i < numbers.length; i++){
            //sum1 = sum1 +numbers[i];
            sum1+=numbers[i];
        }
        System.out.println("Sum "+ sum1);

        //Example 4: Type "Nested 'for' loops for pattern printing" like (00 01 10 11 20 21).
        for (int i =0 ; i<3 ; i++){
            for (int j =0; j<2 ; j++){
                System.out.print(i + ""+j+ " ");
            }
        }

        System.out.println("***************");

        //Example 5: Displaying a multiplication table it should be from one to ten
        for (int i = 1; i<=10; i++){
            for (int j = 1; j <=10 ; j++){
                System.out.print(i*j +  "\t");
            }
            System.out.println();

        }





    }

}
