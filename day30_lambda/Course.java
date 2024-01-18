package day30_lambda;

import java.util.List;

public class Course {
    /*
    If a class has followings, it is called "POJO Class" (Plain Old Java Object)
    1)Private Variables
    2)Constructor with all-parameters
    3)Constructor without parameter
    4)Getters
    5)Setters
    6)toString() method
     */

    private String courseName;
    private int numOfStd;
    private String seasons;
    private double stdAverage;

    public Course() {
    }

    public Course(String courseName, int numOfStd, String seasons, double stdAverage) {
        this.courseName = courseName;
        this.numOfStd = numOfStd;
        this.seasons = seasons;
        this.stdAverage = stdAverage;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumOfStd() {
        return numOfStd;
    }

    public String getSeasons() {
        return seasons;
    }

    public double getStdAverage() {
        return stdAverage;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public void setStdAverage(double stdAverage) {
        this.stdAverage = stdAverage;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' + //'\'' same thing with "'"
                ", numOfStd=" + numOfStd + //It is better to keep this way. Don't touch it
                ", seasons='" + seasons + '\'' + //'\'' is default
                ", stdAverage=" + stdAverage +
                '}';
    }


}
