public class MethodsLec {

    //        public static returnType nameOfMethod() {}
    public static int returnNum(int num) {
//            Pay attention to type of param declared
        return num;
    }
//        Void method= no output

    public static void leaveHouse() {
        System.out.println("I'm leaving the house..");
    }

    //     Method overloading
//    Way to define the same method with different method signatures(parameters).
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
//            sayHello();
        }
    }

//    public static void sayHello() {
//    sayHello("Hello", "World");
//}
//    TO DO Ex:Create method, getDifference, that takes in two integers and return the difference between
//    the higher integer and the lower integer (subtract).
//
//    public static int getDifference(int num1, num2) {
//            if(num1 > num2) {
//                return num1 -num2);
//            }else{
//                return num2 -num1;
//}
//        return getDifference(num1, 0);
//    }

//    RECURSION
//        /method calls itself repeatedly
//        method calls itself referred to as recursive method.
//        recursive method must have condition that will end the recursive calls
//    USE CASES

//    Allows programmers to express certain algorithms in a simpler way. Recursive solutions can be less efficient and
//    possibly be less efficient.

//    TO DO:
//       Create method that changes o's in a string to zeros
//public static String oToZero(String input) {
//        inout =input.toLowerCase();
//        int indexOfNext0h = input.indexOf('o');
//        if (indexOfNext0h == -1);
//
//}

//    Main method
        public static void main(String[] args){
//            return used to exit out no need for them unless needed
            System.out.println(returnNum(8));
            leaveHouse();
        }
    }
