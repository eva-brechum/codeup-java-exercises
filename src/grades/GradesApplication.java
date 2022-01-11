package grades;

import java.util.HashMap;

//Create a class named GradesApplication with a main method.

//It should have keys that are strings that represent github usernames,
//and values that are Student objects. Create at least 4 Student objects
//with at least 3 grades each, and add them to the map.
public class GradesApplication {
    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        HashMap<String,Student> students = new HashMap<>();
//        Student Dan = new Student("Dan", 95);
        Student s2 = new Student("Tom");
        Student s3 = new Student("Jane");
        Student s4 = new Student("Kat");

//        students.put("Dan", s1);
        System.out.println(students);

    }

}
