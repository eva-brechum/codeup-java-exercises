package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

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




















//    public Student(int grades) {
//        this.grades = grades;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//
//        public String getName();
//        public void addGrade(int grade){
//            grades.add(grade);
//        public double getGradeAverage();
//    }
//    public static void main(String[] args) {
//
//
//        
//
//        System.out.println(grades);
//        System.out.println(getName());
//    }
//    }
//}
