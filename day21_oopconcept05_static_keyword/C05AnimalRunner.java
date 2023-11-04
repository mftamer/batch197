package day21_oopconcept05_static_keyword;

public class C05AnimalRunner {


    public static void main(String[] args) {

        C04Cat myCat = new C04Cat();
        System.out.println("myCat.eat() = " + myCat.eat());
        System.out.println("myCat.eat(\"Meat\") = " + myCat.eat("Meat"));


    }


}
