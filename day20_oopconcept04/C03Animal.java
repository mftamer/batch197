package day20_oopconcept04;
/*
    1) a) Concrete Method: Method with body.
       b) Abstract Method: Method without body
    2)To make a method abstract:
        i) remove method body
        ii) add "abstract" keyword between access modifier and return type
        iii) add "abstract" keyword before class keyword
    3) If a method mode abstract all concrete child classes must override it.
        An abstract class can have concrete methods. child class does not have to override them
    4) Java does not allow us to create abjects from Abstract classes
        "Abstract Classes" have some methods without a body. This makes object have some problems. Missing method body.
        If a method is not complete, it cannot perform some operations.
    5) Abstract methods do not have to be overridden in abstract child classes.
    6) If an abstract method is overridden by a concrete child class, it is not mandatory child classes of concrete
        class to override that method.
    7) "Abstract class" can have both abstract and concrete methods
        "Concrete classes" can have only concrete methods.
    8) "Abstract methods" can have "public", "protected" and "default" access modifiers.
        "Abstract methods" cannot have "private" access modifier.
    9) "Final Method": Final means---You cannot update(change) it.
        Q) Can we declare abstract methods as final?
        A) No, because abstract does not have a body but final cannot be updated.
        Q2) Can we override to a final method?
        A2) No.
    10) Can we make an "Abstract method" static?
        Static means it is common for everyone. It can affect everyone.

 */
public abstract class C03Animal {

    public abstract void eat(); //cannot change it private because of abstract.

    public void drink(){
        System.out.println("Animal drinks!");
    }

    //public abstract void makeNoise(); Just to show that it crates a problem

}
