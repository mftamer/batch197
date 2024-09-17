package ssg_classes;

public class DoWhileLoop01 {

    public static void main(String[] args) {
        // Question 1: Check if a number is a palindrome using a do-while loop.
        //12321
        //madam

        int number = 12321;
        int temp = number;
        int rev =0;
        do{
            int digit = temp%10;
            rev=rev*10 +digit;
            temp=temp/10;

        } while (temp>0);
        boolean isPal = (number ==rev);
        System.out.println("is Palindrome = " + isPal);


        // Question 2: Check if a number is prime number or not.
        int num=24;
        boolean isPrime = true;
        int divisor =2;
        do{
            if (num%divisor==0){
                isPrime = false;
                break;
            }
            divisor++;
        }while (divisor<num);
        System.out.println("is Prime = " + isPrime);


        //Question 3: Write a program to count the number of vowels in a given string using a do-while loop.
        String input = "Hello World!";
        int count =0;
        int i =0;
        do {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch=='i' ||ch=='o' || ch=='u'){
                count++;
            }
            i++;
        }while (i< input.length());
        System.out.println("Number of vowels = " + count);


        //Question 4: Write a program to remove all spaces from a given string using a do-while loop.
        //Question 4: Write a program to remove all spaces from a given string using a do-while loop.

        String st= "Hello World! This is a sample string";
        String result ="";
        int ind =0;
        do {
            char ch = st.charAt(ind);
            if (ch !=' ') {
                result = result+ch;
            }
            ind++;
        }while (ind<st.length());
        System.out.println("String without space: " + result);

    }

}
