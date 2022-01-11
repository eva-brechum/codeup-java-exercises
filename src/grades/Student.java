package grades;

import java.util.ArrayList;
//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers
public class Student {
    private String name;
    private ArrayList<Integer> grades;

// The student class should have a constructor that sets name property,
//and initializes the grades property as an empty ArrayList.
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade: this.grades){
            sum += grade;
        }
        return sum/ this.grades.size();
    }

    public static void main(String[] args) {
Student eva = new Student("Eva");
        eva.addGrade(98);
        eva.addGrade(75);
        eva.addGrade(50);

        System.out.println(eva.getGradeAverage());
    }
}














