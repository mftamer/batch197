package day28_iterators_lambda;

import java.time.LocalDate;

public class C01StaticAndInstanceBlock {
    /*
        1) "static block": is used to initialize static variable.
            We sometimes need to write codes to initialize static variables.
            If we need to write code to initialize static variable, we use "static block".

        2) "instance block": is used, when you need to execute some codes in every time we run constructor.
            "Instance block" prevents repetition.
     */

    public static int price;

    static {
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==2){
            price = 800;
        }else {
            price = 1000;
        }
    }

    public C01StaticAndInstanceBlock() {

    }

    public C01StaticAndInstanceBlock(int price) {
        this.price = price;

    }

    {
        System.out.println("Hi!"); //instance block is any code in curly brackets and it is always active.
    }

}
