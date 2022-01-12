package grades;

import java.util.HashMap;

//Create a class named GradesApplication with a main method.

//It should have keys that are strings that represent github usernames,
//and values that are Student objects. Create at least 4 Student objects
//with at least 3 grades each, and add them to the map.
public class GradesApplication {

    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        HashMap<String,String> students = new HashMap<>();
        students.put("EvaDiva", "Eva");
        students.put("Tomclumsy", "Tom");
        students.put("pourjane", "Jane");
        students.put("hellKat", "Kat");
        System.out.println(students);

        Student s1 = new Student("Eva");
        s1.addGrade(95);
        s1.addGrade(77);
        s1.addGrade(80);
        Student tom= new Student("Tom");
        tom.addGrade(84);
        tom.addGrade(69);
        tom.addGrade(90);
        Student s3 = new Student("Jane");
        s3.addGrade(88);
        s3.addGrade(94);
        s3.addGrade(86);
        Student s4 = new Student("Kat");
    s4.addGrade(91);



    }

}
