public class ControlFlowExercises {
    public static void main(String[] args) {
//        LOOPS BASICS
//        a. While
//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }
//        b. Do While
//       int i = 0;
//        do{
//            System.out.println(i +=2);
//        } while(i < 100);
//        for loop for counting by 2s
//        for (int i = 0; i <=100; i+=2) {
//            System.out.println(i);
//;        }

//        int i = 100;
//        do {
//            System.out.println(i -= 5);
//        }while(i >-10);
//        for loops for 5s
//            for (int i = 100; i >= -10; i-= 5) {
//                System.out.println(i);
//            }

//        double i = 2;
//        do {
//            System.out.println((int)i);
//            i = Math.pow(i, 2);
//        }while(i < 1000000);

        for (double i =  2; i < 1000000; i = Math.pow(i, 2)) {
            System.out.println((int)i);
        }
    }
}
