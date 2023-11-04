package practice_dt.practice04;

public class Q01_VarArgs {

    public static void main(String[] args) {

        //Type a method that accepts a variable number of integers as arguments
        //***3 dots (...) only ***

        System.out.println("The sum is: " + sum (1,2,3,4,5)); //15
        System.out.println(sum(45, 54, 789)); //888

    }
    /*
    Type a method that accepts a variable number of integers as arguments and sums them
    1) Access Modifier
    2) Static
    3)Return Type
    4)Method Name
    5)Parenthesis(parameters if there is any)
    6)Method Body
    7)Curly Brace
    */

    public static int sum(int ... numbers){

        int sum=0;

        for (int number:numbers) {

            sum= sum+number; //sum+=number;

        }
        return sum;
    }


}
