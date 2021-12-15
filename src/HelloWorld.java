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

        long myNumber;
//        System.out.println(myNumber); //variable myNumber not initialized

//        myNumber = 3.14; //incompatible: possible lossy conversion from double to long

        myNumber = 123L;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);



    }
}
