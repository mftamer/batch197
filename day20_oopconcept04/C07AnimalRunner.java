package day20_oopconcept04;

import day19_oopconcept03.C05Student;

public class C07AnimalRunner {

    public static void main(String[] args) {

        //C03Animal myAnimal = new C03Animal();
        // can't do this, because objects do things.
        // and the abstract method, there is no 'thing' for it to call to do

        C04Dog Arlo = new C04Dog();
        Arlo.eat();

        C05Cat myCat = new C05Cat();
        myCat.eat();

    }

}
