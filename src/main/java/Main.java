/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        //make static
        int number = getInputNumber();

        //make static
        int sum = sumOfNumbers(number);

        //make 2nd sum gaussian
        int sum2 = gaussianSumOfNumbers(number);

        System.out.println(sum);
        System.out.println(sum2);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        // Start the timer with long
        long startTime1 = System.nanoTime();

        int a = 1;
        for (int i = 0; i < n; i++) {
            //a = n;
            a += n;
            n--;
        }
        // End the timer
        long endTime1 = System.nanoTime();

        // Calculate the elapsed time
        long elapsedTime1 = endTime1 - startTime1;
        // returns the current time in milliseconds
        System.out.print("For loop time in nanoTime = ");

        System.out.println(elapsedTime1);
        return a;

    }
    
    
    static int getInputNumber() { // gee, may this be useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        // Start the timer with long
        long startTime2 = System.nanoTime();
        int sum2 = n * (n + 1) / 2;
        // End the timer
        long endTime2 = System.nanoTime();
        // Calculate the elapsed time
        long elapsedTime2 = endTime2 - startTime2;

        // returns the current time in nano
        System.out.print("Gaussian Wizard time in nanoTime = ");
        System.out.println(elapsedTime2);
        return sum2;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
