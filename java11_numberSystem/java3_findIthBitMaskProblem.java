package java11_numberSystem;

public class java3_findIthBitMaskProblem {
    public static void main(String[] args) {
int num=34; //binary is 100010

        int i=1 ;
        System.out.println(findithbit(num,i));
        System.out.println(setithbit(num,i));
        System.out.println(resetithbit(num,i));
    }



    //find ith bit in array;
    private static int findithbit(int num, int i) {
return (num &(1<<i))>>i;
    }

    //set the ith bit
    private static int setithbit(int num, int i) {
        return (num|(1<<i));
    }

    //Reset the ith bit
    private static  int resetithbit(int num,int i){
        return (num & ~(1<<i));
    }
}
