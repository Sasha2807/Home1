/**
 * Created by aleksandrap on 7/1/2018
 */
public class Factorial {
    // Print factorial of n

    public static void main(String[] args) {  // Set an initital breakpoint at this statement
        int n = 20;
        int factorial = 1;

        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + n + " is " + Math.abs(factorial));
    }

}
