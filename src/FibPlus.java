import java.util.LinkedList;

/**
 * Created by bbstober on 4/25/17.
 */

public class FibPlus {


    public void addFib(int number){
    int counter = 0;
    int MAX = 4000000;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i < number; i++){

            int x = fibonacciRecursion(i);

            counter += x;

            list.add(x);

            if(counter >= MAX){
                log("Total is: "+ counter + "");
                break;

            }

            log(x + " ");
        }
    }

    public static int fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2); // tail recursion
    }


    private static void log(String number) {
        System.out.println(number);
    }

}
