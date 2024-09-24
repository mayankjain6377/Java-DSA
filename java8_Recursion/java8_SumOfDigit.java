package java8_Recursion;

public class java8_SumOfDigit {
    public static void main(String[] args) {

        int num = 2876;
        System.out.println(SumOfDigit(num));

    }
    static int sum = 0;

    private static int SumOfDigit(int num) {
        int rem = 0;
        if (num ==0) {
            return 0;
        }
       rem= num % 10;
        sum=sum*10+rem;
        return SumOfDigit(num / 10);
    }
}
