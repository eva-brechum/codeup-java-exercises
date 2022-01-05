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

    public static void main(String[] args) {
        Person eva = new Person("eva");
        eva.sayHello();
        Person John = new Person();
        John.setName("John");
        System.out.println(John.getName());
        John.sayHello();
    }
}