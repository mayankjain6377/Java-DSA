package java11_numberSystem;

import java.util.Arrays;

public class java9_isPrime {
    public static void main(String[] args) {
int num=13;
boolean []primes=new boolean[num+1];
isPrime(num,primes);
//        System.out.println(Arrays.toString(isPrime(num)));

    }
    static void isPrime(int num,boolean[]primes) {
            for (int i = 2; i*i<=num; i++) {
                if (!primes[i]){
                for(int j=i*2;j<=num;j+=i) {
              primes[j]=true;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (!primes[i]){

                System.out.print("  "+i);
            }

        }
    }
}
