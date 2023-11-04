package day21_oopconcept05_static_keyword;

public class C04Cat implements C01Animal,C02Mammal,C03Carnivorous{
    @Override
    public int eat() {
    return 3;
    }

    @Override
    public String eat (String foodName){
        return foodName.toUpperCase();
    }
}
