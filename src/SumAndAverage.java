/**
 * Created by aleksandrap on 6/29/2018
 */
public class SumAndAverage {


    //For
     /*
    public static void main(String[] args) {
        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;

        for (int number = lowerbound; number<= upperbound; ++number){

            sum+=number;
        }

        average = (double) sum / (double) upperbound;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average); }
        */

    //While-do
/*
    public static void main(String[] args) {

        double average;
        int lowerbound = 1;
        int upperbound = 100;

        int number = lowerbound;
        int sum = 0;
        while (number <= upperbound) {

            sum += number;
            ++number;
        }

        average = (double) sum / (double) upperbound;

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);

    }

/*


    //Do-while
    /*

    public static void main(String[] args) {

        double average;
        int lowerbound = 1;
        int upperbound = 100;

        int number = lowerbound;
        int sum = 0;

        do {
            sum += number;
            ++number;
        } while (number <= upperbound);


            average = (double) sum / (double) upperbound;

            System.out.println("The sum is " + sum);
            System.out.println("The average is " + average);
    }
        */

    //Count
/*
    public static void main(String[] args) {
        int count = 0;
        double average;
        int sum = 0;

        for(int i = 111; i<=8899; ++i){

            sum+=i;
            ++count;
        }

        average = (double) sum / (double) count;

        System.out.println("The average is " + average);
    }

    */

   /* public static void main(String[] args) {

        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int count = 0;

        for (int i = lowerbound; i <= upperbound; ++i) {

            if (i % 2 != 0) {

                sum += i;
                ++count;
            }

        }
        average = (double) sum / (double) count;

        System.out.println("The average is " + average);
    }*/

    /*public static void main(String[] args) {

        int sum = 0;
        double average;
        int lowerbound = 1;
        int upperbound = 100;
        int count = 0;

        for (int i = lowerbound; i <= upperbound; ++i) {

            if (i % 7 == 0) {

                sum += i;
                ++count;
            }

        }
        average = (double) sum / (double) count;

        System.out.println("The average is " + average);

    }
    */

    public static void main(String[] args) {

        int sum = 0;
        int lowerbound = 1;
        int upperbound = 100;

        for (int i = lowerbound; i <= upperbound; ++i) {
                sum += i*i;
        }
        System.out.println("The sum is " + sum);

    }
}










