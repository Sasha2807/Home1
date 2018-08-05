/**
 * Created by aleksandrap on 6/29/2018
 */
public class CozaLozaWoza {

    public static void main(String[] args) {

            int lowerbound = 1, upperbound = 110;

            for (int number = lowerbound; number <= upperbound; ++number) {

                if (number % 3 == 0) {
                    System.out.print("Coza");
                }

                if (number % 5 == 0) {
                    System.out.print("Loza");
                }

                if (number % 7 == 0) {
                    System.out.print("Woza");
                }
                if (number % 3 !=0&&number % 5 !=0&&number % 7 !=0) {
                    System.out.print(number);
                }

                // After processing the number, print a newline if number is divisible by 11;

                // else print a space
                if (number % 11 == 0) {
                    System.out.println();  // print newline
                } else {
                    System.out.print(" ");  // print a space
                }
            }
        }
    }

