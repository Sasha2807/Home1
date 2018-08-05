/**
 * Created by aleksandrap on 7/1/2018
 */
public class PrintPattern {
 /*
    public static void main(String[] args) {
        //A
        for (int i=0; i<8; i++)
        {
            for (int j = 0; j<8; j++)
            {
                if(j>i) break;

                System.out.print("# ");
            }
            System.out.println();
        }
    } */

       /*
       //B
       public static void main(String[] args) {
           for (int i = 0; i < 8; i++) {
               for (int j = 8; j > 0; j--) {
                   if (j <= i) break;

                   System.out.print("# ");
               }
               System.out.println();
           }
       }

      //C
        /*
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int s = 8; s>=i; s--){
                System.out.print("#");
            }

            System.out.println("");
        }
    }
    */

     //D
    /*
     public static void main(String[] args) {
         for (int i = 8; i >= 1; i--) {
             for (int j = 1; j <= 8; j++) {
                 System.out.print((j >= i ? "# " : "  "));
             }
             System.out.println();
         }
     }
    */

    //E
    /*
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print((i % 8 <= 1) || (j % 8 <= 1) ? "# " : "  ");
            }
            System.out.println();
        }
    }
        */
    //F
    /*
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                System.out.print((i % 8 <= 1) || (i == j) ? "# " : "  ");
            }
            System.out.println();
        }
    }
    */

    //G
    /*
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                if((i%8 <= 1) || (i + j == 8 + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    */

    //H
    /*
    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                if((i%8 <= 1) || (i == j) || (i + j == 8 + 1)) {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    */

    //I
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 1; j <= 8; j++)
            {
                if ((i%8 <= 1) ||
                        (j%8 <= 1) ||
                        (i == j)      ||
                        (i + j == 8 + 1))
                {
                    System.out.print("# ");
                    continue;
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }










}
