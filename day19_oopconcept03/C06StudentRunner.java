package day19_oopconcept03;

public class C06StudentRunner {

    public static void main(String[] args) {

        C05Student std = new C05Student();
        System.out.println("std.getStId() = " + std.getStId()); //TH001
        System.out.println("std.getGpa() = " + std.getGpa()); //3.98
        std.setStId("AC234");
        System.out.println("std.getStId() = " + std.getStId()); //AC234

        C05Student std2 = new C05Student();
        System.out.println("std2.getStId() = " + std2.getStId()); //TH001


    }

}
