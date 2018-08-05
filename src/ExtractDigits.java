/**
 * Created by aleksandrap on 6/29/2018
 */
public class ExtractDigits {

    public static void main(String[] args) {
        int n = 123456789;
        String string1 = String.valueOf(n);

        char[] string2 = string1.toCharArray();

        StringBuilder string3 = new StringBuilder();

        for (int i = string2.length-1; i >= 0; i-- ) {

            string3.append(string2[i]);
        }

        System.out.println(string3);

    }
}
