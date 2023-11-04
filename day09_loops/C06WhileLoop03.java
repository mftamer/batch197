package day09_loops;

public class C06WhileLoop03 {

    public static void main(String[] args) {

        //Example 3: Type code to find the sum of the digits of integer
        //           587 ==> 5+8+7=20

        int i=587;
        int sum=0;

        while (i>0){
            sum = sum +i%10;
            i=i/10;

        }
        System.out.println(sum);


        //Example: Type a code to print table of multiplication for a given number. Print on separate lines
        // 3 ----> 3*1=3 3*2=6 3*3=9 .... 3*10=30

        //MY CODE

        int k=3;
        int grade =0;
        int sum1=0;

        while (grade<11) {
            sum1 = grade * k;
            System.out.println("3*" + grade + "="+ sum1);

            grade++;
        }


        // MR.SELIM'S CODE
        int num=3;
        int l=1;
        while (l<11){
            System.out.println(num + "*0" +l +"=" + num*l);
            l++;
        }



    }

}
