package day20_oopconcept04;

public interface C10Engine {

    /*
     in interface, it should be public and abstract. |
     you cannot write concrete methods.               > my notes.
     therefore, you don't need to declare it.        |
    */

    /*
        All methods in interface are "public" and "abstract", therefore, you don't need to use these keywords in method
        declaration

        1) Interfaces have "Abstract Methods", which means uncompleted methods.
            Therefore, Java will not let us create an object from interface.
        2) "Abstract classes" are just classes, and they have constructors, but Java does not allow "Abstract classes"
            to create an object.
            Interfaces don't have constructors, and they have different structures from classes.
            We cannot create an object from Interfaces.
        3) All methods in Interface must be overridden by concrete child classes. This is why "abstract classes"
            are called as "To-do lists".

     */

    //public abstract void start(); are empty
    void start();

    void stop();

    /*
    concrete class example is accelerate()
    we cannot write concrete method in Interface
    public void accelerate(){
        System.out.println("Increase speed so fast");
    } The way to write concrete method is below
    */
    //It is called Static Concrete method:
    public static void accelerate(){
        System.out.println("Increase speed so fast");
    }
    // or just change access modifier to default
    //it is called Default concrete methods:
    default void price(){
        System.out.println("Every Engine has a price!");
    }

    /* Variable in Interface: All variables in interfaces are "final"
                              i) We have to initialize first
                              ii) We cannot change them later
                              iii) For naming convention, it should be all in capitals
                              All variables in interfaces are "public", "final" and "static" as default.
                              Therefore, we can access them through interface name. (Not through object)
    */

    public final String ENGINE_NAME = "Electrical Engine";
    
}
