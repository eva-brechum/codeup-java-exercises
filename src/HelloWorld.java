public class HelloWorld {
    public static void main(String[] args) {
//      System.out.print("Hello ");
//      System.out.print("World!");

        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

//      String myString = "Today was a good day!";
//        System.out.print(myString);

//      String myString = 'C';//incompatible types: char cannot be converted
//      System.out.println(myString);

//      String myString = 3.14159; //incompatible types: double cannot be converted
//      System.out.println(myString );

//      long myNumber;
//      System.out.println(myNumber); //variable myNumber not initialized

//      myNumber = 3.14; //incompatible: possible lossy conversion from double to long

//      myNumber = 123L;
//      System.out.println(myNumber);
//
//      myNumber = 123;
//      System.out.println(myNumber);

//      float myNumber = 3.14; //possible lossy conversion from double to float
//      System.out.println(myNumber);
//      9a.
//       float myNumber = 3.14f;
//      System.out.println(myNumber);
//       b.
        float myNumber = 3.14F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//

//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//      class; //identifier expected
//      System.out.println(class);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; incompatible

//        int three = (int) "three"; //incompatible types cannot be converted to int
//        System.out.println(three);

//        int x = 4;
//        x = x + 5;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y = y * x;

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);


//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        Overflow
    }
}
