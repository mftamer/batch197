package day17_constructor_oop_concept;

/*
 1)To create an object, we need constructor. Without constructor, it is impossible to create an object
 2)When you create a class java creates cons automatically;
     This invisible cons is called as "default constructor"
 3) If we want we can create several constructors
 4) when we create constructor, default constructor is removed.
 5) To create constructors with different parameters make your code flexible.

        ***FAMOUS INTERVIEW QUESTION***
        What is the difference between method and constructor
        1)Methods are used for some actions but constructors are used to create object
        2)Methods have return types but constructors have no return type.
        Slang: 'method' moves the thing, 'constructors' are the thing.
        3)Methods can have any name, but constructors' name must be same(identical) with the class name.

*/

public class C01Students {

    String name = "Tom Hanks";
    int age = 13;
    private String stdId = "TM2010001";

    public void study(){
        System.out.println("Study hard...");
    }
    public void doSport(){
        System.out.println("Doing sports is good for health...");
    }

    // How to create constructor manually
    public C01Students (){

    }

    public C01Students (String name, int age){
    this.name = name;
    this.age = age;
    }

    //How to create constructor with the help of IntelliJ
    //Right-click, select generate then constructor


    public C01Students(String name) {
        this.name = name;
    }

    public C01Students(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }
}
