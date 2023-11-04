package day20_oopconcept04;

public class C01A {
    /*
    1) Create class A
    2) Create class B
    3) Create a String, an int, and a boolean variable inside the class A and encapsulate them all
    4) Make String variable just readable
    5) Make int variable just updatable
    6) Make Boolean variable both readable and updatable
     */

    // Method without a body is called as ABSTRACT METHOD.

    private String name = "Tom";
    private int age = 32;
    private boolean understood= false;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isUnderstood() {
        return understood;
    }

    public void setUnderstood(boolean understood) {
        this.understood = understood;
    }
}
