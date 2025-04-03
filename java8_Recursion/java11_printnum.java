package java8_Recursion;
public class java11_printnum {
    public static void main(String[] args) {
int num=12;
printnum(num);
    }

     private static void printnum(int num) {
            if (num < 0) {
                return ;
            }
         num--;
         printnum(num);
         System.out.println(num);
     }
    }

