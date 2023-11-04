package day18_oopconcept02;

public class C02Mammal extends C01Animal{

    public String type;
    public int height;
    public int weight = 10;

    public void eat(){
        System.out.println("Mammals eat!");
    }

  public C02Mammal (){
      this("Arlo");
      System.out.println("M-No Parameters");
  }
    public C02Mammal(String type) {
        super();
        System.out.println("String type Parameter");
        this.type=type;
    }
  public C02Mammal(String type, int height){
      super();
      System.out.println("String type, int height Parameters");
      this.type=type;
      this.height=height;
  }

}
