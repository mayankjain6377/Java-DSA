package java_Leetcode_Problems;

public class java20_HappyNumber {
        public static boolean isHappy(int n) {
            int slow = n;
            int fast = n;
            do {
                slow = findsquare(slow);
                fast = findsquare(findsquare(fast));

            } while (slow != fast);
            if (slow == 1) {
                return true;

            }
            return false;

        }

        public static int findsquare(int num) {
            int ans = 0;
            while (num > 0) {
                int rem = num % 10;
                ans += rem * rem;
                num = num / 10;
            }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
