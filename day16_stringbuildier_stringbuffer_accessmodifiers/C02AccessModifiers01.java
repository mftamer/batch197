package day16_stringbuildier_stringbuffer_accessmodifiers;

public class C02AccessModifiers01 {

    /*
        1) Access Modifiers are used to modify who can access to data
        2) There are four types of access modifiers: Public > Protected > Default > Private
        3) Private access modifiers cannot be reached from other Classes
        4) Public data can be reached from anywhere
        5) Default data can be reached by classes on the same package.
             i)Default also called as package private.
        6)Protected data can be reached from the same package and from other packages as well if it is a child.
     */


    public static void main(String[] args) {

        C03AccessModifiersClass obj = new C03AccessModifiersClass(); //this is a constructor
                                                                        // this will let us reach data from there
                                                                        //private cannot be reached at all
        System.out.println(obj.name);
        int a = obj.age;



    }

}
