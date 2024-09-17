package day08_for_loop;

public class C03ForLoop02 {

    public static void main(String[] args) {

        //Example 3: Type code that prints even numbers between 6 and 17.

        // First Way
        for (int i=6; i<18; i++  ){

            if (i%2==0){
                System.out.print(i + " ");
            }

        }

        System.out.println("2nd Way:");

        //Second Way

        for (int i=6; i<18; i+=2){

            System.out.print(i + " ");

            }

        System.out.println(" ");
        //Example 4: Type a code that prints all numbers between 6 and 17 but not 13.

        //First Way
        for(int i=6; i<18;i++){

            if(i!=13){
                System.out.print(i+" ");

            }

        }
        System.out.println(" ");
        //Second Way
        for(int i=6; i<18;i++){

            if (i==13){
                continue; //"continue" keyword takes you directly to the increment/decrement part
                            //It is used to skip some values

            }
            System.out.print(i+ " ");
        }

        System.out.println(" ");
        //Example 5: Type a code to print chars in the String one by one.If see you see "x" stop printing.
        //"I like extra effort"

        String str = "I like extra effort";

        for (int i=0 ; i<str.length() ; i++){
                char ch = str.charAt(i);

                if (ch=='x'){
                    break; // "break" keyword takes us to out of the loop.
                }
            System.out.print(ch);

        }








    }

}
