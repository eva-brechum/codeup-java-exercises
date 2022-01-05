    //1.Object Basics
    //Create Person class inside of src that has a private name field that is a string, and the following methods:
    public class Person {
        private String name;

        public Person(String name) {
            this.name= name;
        }

        public Person() {

        }

        public String getName(){
            return this.name;
        }

        public void setName(String name) {
            this.name =name;
        }
        public void sayHello() {
            System.out.printf("\nHello, %s\n",this.name);
        }
    //   1. Understanding references
    //
    //    The following code blocks make use of the Person class from the previous exercise. For each code block,
    //    think about what the code will output, then copy the code into IntelliJ and run it to see if it matches your expectations.

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//    System.out.println(person1.getName().equals(person2.getName();
//    System.out.println(person1 == person2); //identifier expected
//
//
//        Person person1 = new Person("John");
//                Person person2 = person1;
//        System.out.println(person1 == person2);

//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());


        public static void main(String[] args) {
            Person eva = new Person("Eva");
            eva.sayHello();
            Person John = new Person();
            John.setName("John");
            System.out.println(John.getName());
            John.sayHello();
    //        Person allyson = new Person();
    //        allyson.setName("Allyson");
    //        System.out.println(allyson.getName());
    //        Person jane = new Person();
    //        jane.setName("Jane");
    //        System.out.println(jane.sayHello());
        }
    }
