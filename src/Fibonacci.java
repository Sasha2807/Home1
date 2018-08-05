import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by aleksandrap on 6/29/2018
 */
public class Fibonacci {

    public static void main(String args[]) {
        int n = 3;          // the index n for F(n), starting from n=3
        int fn;             // F(n) to be computed
        int fnMinus1 = 1;   // F(n-1), init to F(2)
        int fnMinus2 = 1;   // F(n-2), init to F(1)
        int count = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
        double average;

        System.out.println("The first " + count + " Fibonacci numbers are:");
        System.out.print(fnMinus1 + " " + fnMinus2 + " ");

        while (n <= count) {  // n starts from 3
            fn = fnMinus1 + fnMinus2;
            System.out.print(fn + " ");

            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        average = (double) sum / count;
        System.out.println("The average is " + average);
    }
}



