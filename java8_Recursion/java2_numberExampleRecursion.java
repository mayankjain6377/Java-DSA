package java8_Recursion;

public class java2_numberExampleRecursion {
    public static void main(String[] args) {
                print(4);


            }

            static  int print(int n)
            {
                if(n==0)
                {
//                    System.out.println(5);
                    return 1;
                }
                System.out.println(n * print(n-1));
//               return n * print(n-1);
                return 0;

            }


        }


