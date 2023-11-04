package day21_oopconcept05_static_keyword;

public class C07StudentRunner {

    public static void main(String[] args) {
        C06Student st1 = new C06Student();
        System.out.println(st1.numOfEyes); //2
        System.out.println(st1.numOfStudents); //1
        System.out.println(C06Student.numOfStudents); //1

        C06Student st2 = new C06Student();
        System.out.println(st2.numOfEyes); //2
        System.out.println(C06Student.numOfStudents); //2
        System.out.println(st1.numOfStudents); //2

        C06Student st3 = new C06Student();
        System.out.println(st3.numOfEyes); //2
        System.out.println(C06Student.numOfStudents); //3
    }
}
