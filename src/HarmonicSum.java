/**
 * Created by aleksandrap on 6/29/2018
 */
public class HarmonicSum {

    public static void main(String[] args) {

        int maxDenominator = 50000;

        double sumL2R = 0.0;
        double sumR2L = 0.0;
        double dif = 0.0;

        for (int denominator = 1; denominator<=maxDenominator; ++denominator){

            sumL2R += (1 / (double) denominator);
        }

        for (int denominator = maxDenominator; denominator>=1; --denominator){

            sumR2L += (1 / (double) denominator);
        }

        if (sumL2R > sumR2L ){

            dif = sumL2R - sumR2L;
        } else if (sumL2R < sumR2L ){
            dif = sumR2L - sumL2R;
        } else {
            System.out.println("Dif ravno 0");
        }


        System.out.println("The sum from left-to-right is: " + sumL2R);

        System.out.println("The sum from right-to-left is: " + sumR2L);

        System.out.println("Difference is " + dif);

    }


}
