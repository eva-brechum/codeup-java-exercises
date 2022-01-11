package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grades;
    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    public Student(ArrayList<Integer> grades) {
        this.grades = grades;
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
