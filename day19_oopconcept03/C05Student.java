package day19_oopconcept03;
/*
    Encapsulation: Data hiding...
    Q1) Why do we hide data?
        i) Because some data are private, Like; SSN No, ID, Credit Card No, etc...
        ii) We may not want people to reach that data.

    Q2) How we can hide data?
        We use private keyword in front of the class member

 */
public class C05Student {

    private String stId = "TH001";
    private String illness = "Depression";
    private double gpa = 3.98;
    private boolean disability = false;

    /*
        How to read encapsulated data?
        All get() methods starts with "get" key word except boolean
     */
    public String getStId(){
        return stId;
    }

    public String getIllness(){
        return illness; //Long way
    }

    //Shortcut. Right click-Generate-Getter

    public double getGpa() {
        return gpa;
    }

    public boolean isDisability() { //booleans getter start with "is"
        return disability;
    }

    //If we want to update encapsulated data, we use setters:
    public void setStId(String stId){
        this.stId = stId;
    }

    //Getters and setters are called JavaBeans.
}
