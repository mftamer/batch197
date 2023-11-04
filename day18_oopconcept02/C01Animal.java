package day18_oopconcept02;
    /*
    How Constructors work in inheritance
    1) Java uses "Constructors" from parents Classes to Inherent child because, without having a parent, we cannot create a child.
    2) Every Constructor has invisible "super()" keyword in the first line. If you want, you can make it visible.
    3) "super()" keyword is for calling parent constructor with given parameters. {You can write parameters inside "super()" to
        decide which constructor to work}
    4) "this()" keyword is used for calling constructor in the same class
    5) Using "super()" and "this()" keyword in object creation provides flexibility.
    6) We can create an object which has a data type of parent class.
    7) If you have a variable with the same name in inheritance, the value of the variable will be selected according to Class
        used as the data type.
    8) If we use methods with the same name in inheritance, the method will be selected from the class that constructor is created
    9) "super." It Is used to call "variables" or "methods" in the parent class
        "this" is used to call "variables" or "methods" in the same class

    */
public class C01Animal {

    public String name;
    public int age;
    public boolean isPet;
    public int weight = 12;
    public void eat(){
        System.out.println("Animals eat!");
    }

        public C01Animal() {
            this("Arlo",4,true);
            System.out.println("A-No Parameter");
        }

        public C01Animal(String name, int age) {
            super();
            System.out.println("String name, int age Parameters");
            this.name = name;
            this.age = age;
        }

        public C01Animal(String name, int age, boolean isPet) {
            super();
            System.out.println("String name, int age, boolean isPet Parameters ");
            this.name = name;
            this.age = age;
            this.isPet = isPet;
        }
    }
