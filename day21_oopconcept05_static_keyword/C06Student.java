package day21_oopconcept05_static_keyword;

public class C06Student {

    /*
        What is the difference between "Static" and "non-static" keywords?
           i) Static class members are common for all objects, non-static class members are shared only by the object
                itself.
           ii) When we make updates on "Static class" members, the update will affect all objects.
               When we make updates on "Non-Static" class members, the update will affect only the object.
               If we want another object to be informed, we need to type code.
           iii) To access "Static" members, we need only class name.
                To access "non-static" members, we need to create object
           iv) "Static" class members are created together with class.
               "Non-Static" class members are created while we are creating on an object.
           v) "Static" class members are created once,
              "Non-static" class members are created in every object creation.
     */

    public static int numOfStudents = 0;

    public int numOfEyes = 0;

    public C06Student() {
        this.numOfEyes = numOfEyes +2;
        numOfStudents++;
    }
}
