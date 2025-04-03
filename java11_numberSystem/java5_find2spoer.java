package java11_numberSystem;
public class java5_find2spoer {
    public static void main(String[] args) {
        powerof2();
        powerofa();
    }


    private static void powerof2() {
        int num = 2;
        boolean ans = (num & (num - 1)) == 0;
        System.out.println(ans);

    }


    private static void powerofa() {
        int power = 6;
        int base = 3;
        int ans = 1;
        while (power > 0) {
            if (((power & 1) == 1)) {
                ans = ans * base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }
}


