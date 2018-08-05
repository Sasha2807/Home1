/**
 * Created by aleksandrap on 6/29/2018
 */
public class Product1ToN {

    public static void main(String[] args) {

        long product = 1;

        for (long i = product; i <= 14; ++i) {
            product *= i;
        }
        System.out.println("The multiply is " + product);

    }

}
