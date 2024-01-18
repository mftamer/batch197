package day30_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class C03Lambda06 {

    public static void main(String[] args) {

        Course c1 = new Course("Java", 145, "Spring", 94.5);
        Course c2 = new Course("SQL", 150, "Summer", 89.5);
        Course c3 = new Course("Selenium", 134, "Fall", 93.5);
        Course c4 = new Course("API", 189, "Summer", 92.5);

        //System.out.println(c1); //Course{courseName='Java', numOfStd=145, seasons='Spring', stdAverage=94.5}

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);
        System.out.println(courses);

        System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(courses, 91)); //false
        System.out.println(checkAvgScoresToBeGreaterThanGivenNumber(courses, 80.2)); //true

        System.out.println(checkCourseNameContainsGivenString(courses,"J")); //true

        System.out.println(checkWinterSeasonWithGivenAvg(courses, "winter",91)); //false

        printCourseNumOfStdHighest(courses); //Course{courseName='API', numOfStd=189, seasons='Summer', stdAverage=92.5}

        printCourseNumOfStdThirdHighest(courses);
        //Course{courseName='Java', numOfStd=145, seasons='Spring', stdAverage=94.5}
        //Course{courseName='Selenium', numOfStd=134, seasons='Fall', stdAverage=93.5}

    }

    //Example 1: Create a method to check if all average scores are greater than 91
    public static boolean checkAvgScoresToBeGreaterThanGivenNumber(List<Course> list, double n){
        return list.
                stream().
                allMatch(t->t.getStdAverage()>n);
    }
    //Example 2: Create a method to check if at least one of the course names has "J" in it.
    public static boolean checkCourseNameContainsGivenString(List<Course> list, String s){
        return list.
                stream().
                anyMatch(t->t.getCourseName().contains(s));
    }
    //Example 3: Create a method to check if there is a season which is Winter and the average score is less than 96
    public static boolean checkWinterSeasonWithGivenAvg(List<Course> list, String season, double avg){
        return list.
                stream().
                filter(t->t.getSeasons().equalsIgnoreCase(season)).
                anyMatch(t-> t.getStdAverage()<avg);
    }
    //Example 4: Create a method to print the course whose number of students is the highest
    public static void printCourseNumOfStdHighest(List<Course> list){
        System.out.println(list.
                stream().
                sorted(Comparator.comparing(Course::getNumOfStd).reversed()).
                findFirst().get());
    }
    //Example 5: Create a method to print the course whose number of students is the third highest
    public static void printCourseNumOfStdThirdHighest(List<Course> list){
            list.
                stream().sorted(Comparator.comparing(Course::getNumOfStd).reversed()).
                skip(2).
                limit(2).
                forEach(t-> System.out.println(t));
    }
}
