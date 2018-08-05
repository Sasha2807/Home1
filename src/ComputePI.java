/**
 * Created by aleksandrap on 6/29/2018
 */
public class ComputePI {

    public static void main(String[] args) {

        double sum = 0.0;
        int maxDenominator = 10000000;

        for (double denominator = 1; denominator < maxDenominator; denominator += 2) {

            if (denominator % 4 == 1) {
                sum += 1 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1 / denominator;
            } else {
                System.out.println("The computer has gone crazy?!");
            }
        }

        sum*=4;

        System.out.println(sum);
    }
}
