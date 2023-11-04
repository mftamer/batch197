package day18_oopconcept02;

public class C03Dog extends C02Mammal{

    public double price;
    public int weight = 8;

    public void eat(){
        System.out.println("Dogs eat!");
    }

    public C03Dog(){
        super();     // goes inside the same class
        System.out.println("Super var: --->"+super.weight);  //super.weight call the weight in the upper class
        System.out.println("Super var: --->"+this.weight);  //this.weight call the weight in the same class
        System.out.println("D-No Parameters");

    }

    public C03Dog(double price ){
        super();
        System.out.println("Price parameter");
        this.price=price;
    }
}
