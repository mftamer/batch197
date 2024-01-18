package day30_lambda;

public class Utils {

    public static int sumOfDigits(int num){
        int sum = 0;
        for (int i = num; i>0 ; i/=10){
            sum=sum+ i%10;
        }
        return sum;
    }

    public static boolean isEven(int num){
        return num%2==0;
    }

    public static int takeSquare(int num){
        return num*num;
    }
}
