/**
 * Created by aleksandrap on 6/29/2018
 */
public class Tribonacci {

    public static void main(String args[]) {
        int n = 4;          // the index n for F(n), starting from n=3
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;
        int fnMinus3 = 2;   // F(n-2), init to F(1)
        int count = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2 + fnMinus3;  // Need sum to compute average
        double average;

        System.out.println("The first " + count + " Tribonacci numbers are:");
        System.out.print(fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");

        while (n <= count) {  // n starts from 4
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            System.out.print(fn + " ");

            ++n;

            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
        }


        average = (double) sum / (double) count;
        System.out.println("\nThe average is " + average);
    }



}
