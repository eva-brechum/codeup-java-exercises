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

//        int i = 100;
//        do {
//            System.out.println(i -= 5);
//        }while(i >-10);

        double i = 2;
        do {
            System.out.println((int)i);
            i = Math.pow(i, 2);
        }while(i < 1000000);
    }
}
