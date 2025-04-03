public class java12_TwoKiPower {
    public static void main(String[] args) {
// we have to calculate that this number is perfect to denote in 2^n;

        int num=16;
//        sqrtt(num);
        System.out.println(sqrtt(num));

    }

    public static boolean sqrtt(int num){

        if(num==1 || num==2){
            return true;
        }
        if(num%2==0)
        {
            return sqrtt(num/2);
        }

        return false;

    }
}
