package java8_Recursion;

public class java9_ReverseNumber {
    static int sum = 0;

    private static void reverseNum(int num) {
        int rem = 0;
        if (num == 0) {
            return;
        }
        rem = num % 10;
        num = num / 10;
        sum = sum * 10 + rem;
        reverseNum(num);

    }

    public static void main(String[] args) {
//        int num = 32445;
        int num=3003;
        reverseNum(num);

        System.out.println(sum);
        if(num==sum){
            System.out.println("this is a palindrome number");
        }
        else
            System.out.println("this is not a palindrome number");
    }
}
