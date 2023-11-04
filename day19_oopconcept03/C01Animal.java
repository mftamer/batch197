package day19_oopconcept03;
/*
    1) To have specific implementations in the child class, we use "Method Overriding".
    2) In "Method overriding" we change the method body.
        i) In "Method overriding", we don't change method name and method parameters.
        ii) "Method name" and "method parameters" are called "Method Signatures".
        iii) "Method Signatures" cannot be or do not change.
    3) In "Method Overriding" if the method has "void" return type. Don't change it.
        In "Method Overriding" if the method has "primitive" return type. Don't change it.
        In "Method Overriding" if the method has "covariant" (parent-child relation) return type. You can change it.
    4) The method in the child class is "Overriding Method".
        The method in the parent class is "Overridden Method".
        Access Modifiers:

        Overridden Method-----> public
        Overriding Method-----> public

        Overridden Method-----> protected
        Overriding Method-----> protected or public

        Overridden Method-----> default
        Overriding Method-----> default , protected or public

        Overridden Method-----> private
        Overriding Method-----> Private methods cannot be overridden.

    5) Polymorphism = "Method Overriding" (Dynamic Polymorphism) + "Method Overloading" (Static Polymorphism)
    6) What is the difference between "Method Overriding" and "Method Overloading"
        i) "Method Overloading" occurs in a single class, but "Method Overriding" you need more than one class.
        ii) "Method Overriding" uses inheritance but "Method Overriding" does not.
        iii) "Private Access Modifiers" can be overloaded but cannot be overridden.
        iv) In "Method Overloading" we can change method signature, but in "Method Overriding" we cannot change method
            signature.
        v) In "Method Overriding" access modifiers and return types have some rules, but in "Method Overloading" they
            don't play a role.
        vi) "Method Overloading" we change parameters of method to work for different scenarios.
            "Method Overriding" we change method body to make method implementations more specific.
        vii) "Static Methods" can be overloaded but cannot be overridden.

**** Shift+tab to bring back the cursor space you put in the front. Basically it is a reverse tab.
 */
public class C01Animal {

    public void eat(){
        System.out.println("Animals eat....");
    }

    public void drink() {
        System.out.println("Animals eat....");
    }

    public int getWeight(){
        return 30;
    }

    public C01Animal create(){
     //   C01Animal myAnimal = new C01Animal(); //Long way
     //   return myAnimal;
        return new C01Animal(); //Short way to create an animal.
    }

}
