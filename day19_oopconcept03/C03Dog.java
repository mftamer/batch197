package day19_oopconcept03;

public class C03Dog extends C02Mammal{

    @Override // "@Override" Annotation: checks for override rules. It is not mandatory to write @override, but it is helpful.
    public void eat() {
        System.out.println("Arlo eats!"); //Right click, generate, then override methods , delete super.eat();
    }

    @Override // "@Override" Annotation: checks for override rules. It is not mandatory to write @override, but it is helpful.
    public void drink() {
        System.out.println("Arlo drinks!"); //Right click, generate, then override methods, delete return super.eat() to modify it;
    }

    @Override
    public int getWeight() {
        return 27;
    }

    @Override
    public C03Dog create() {
        return new C03Dog();
    }
}
