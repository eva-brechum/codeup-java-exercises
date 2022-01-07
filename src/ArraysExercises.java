import java.util.Arrays;
public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);error we need Arrays.toString in order to get a string representation of the array;
        Person[] personList = {new Person("Eva"), new Person("Meg"), new Person("James")};
        for (Person person : personList) {
            System.out.println(person.getName());
            }
            System.out.println();
            personList = addPerson(personList,new Person("George"));
            for (Person person : personList) {
                System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] personList, Person toAdd){
        Person[] tempList = Arrays.copyOf(personList,personList.length+1);
        tempList[tempList.length-1]=toAdd;
        return tempList;
    }
}
