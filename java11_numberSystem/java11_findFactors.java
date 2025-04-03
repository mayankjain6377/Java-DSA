package java11_numberSystem;

import java.util.Map;

public class java11_findFactors {
    public static void main(String[] args) {
int num=20;
factors(num);
        factors2(num);

    }

    //this is with O(n) complexity
    private static void factors(int num){
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.print(i+" ");

        }
}
    }

    private static void factors2(int num){
        System.out.println();
        for (int i = 1; i < Math.sqrt(num); i++) {
            if(num%i==0){
                if(num/i==i){
                    System.out.print(i+" ");
                }
                System.out.print(i+" "+num/i+" ");
            }

        }
    }
}
