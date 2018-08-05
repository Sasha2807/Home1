/**
 * Created by aleksandrap on 7/1/2018
 */
public class CheckerBoard {


    public static void main(String[] args) {

        int size = 7;


        for (int i = 1; i <= size; i++) {

            if (i % 2 ==0) {
                System.out.print(" "); }

            for (int x = 1; x<= size; x++) {

                System.out.print("# ");

            }

            System.out.println();

        }
    }

}
