package java7_Pattern;

public class java1_pattern1 {
    public static void main(String[] args) {
//pattern1();
//pattern2();
pattern3();
//        System.out.println(pattern1());

    }

    static void  pattern1()
    {
        /*print this pattern
         *
         **
         ***
         ****
         ***** */
        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


    static void pattern2()
    {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
       */


        int n=5;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }


    static void pattern3()
    {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        int n=5;
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col<=n-row;col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

}
