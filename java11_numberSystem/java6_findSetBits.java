package java11_numberSystem;

public class java6_findSetBits {
    public static void main(String[] args) {
int num=2;
        System.out.println("this is the number of set bits "+setbits(num));;

    }

    private static int setbits(int num) {
        int count=0;
        int nocount=0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            else
                nocount++;

            num= num>>1;
        }
        System.out.println("the no of reset bits are:"+nocount);
        return count;
    }
}
