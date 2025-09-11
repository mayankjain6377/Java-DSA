package java_Leetcode_Problems;

import java.util.Scanner;

public class java47_sumOfFactDigits {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
//                int num = sc.nextInt();
int num=40321;
                System.out.println(factDigit(num));
            }

            public static int fact(int n) {
                if (n < 2) {
                    return 1;
                }
                else {
                    return n * fact(n - 1);
                }
            }

            public static int factDigit(int num) {
                int sum = 0;
                int originalNum = num;
                for(int i=15;i<50;i++){
                    int tempi=i;
                    while (tempi > 0) {
                        int rem = tempi % 10;
                        sum += fact(rem);
                        tempi /= 10;
                    }

                    if(sum==originalNum){
                        return i;
                    }
                    sum=0;
                }
                return sum;
            }
        }
