package day17_constructor_oop_concept;

public class C02StudentRunner {

    public static void main(String[] args) {

        C01Students std1 = new C01Students();
        System.out.println(std1.name);

        C01Students std2 = new C01Students("Cagatay", 14);

        std1.name = "Emre";
        std1.age = 12;

        System.out.println(std2.name);
    }


}
