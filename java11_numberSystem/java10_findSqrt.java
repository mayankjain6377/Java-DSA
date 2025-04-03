package java11_numberSystem;

public class java10_findSqrt {
    public static void main(String[] args) {
int num=36;

        System.out.println(findperfectsqrt(num));;
    }
//this is for the finding the perfect sqrt
    private static int findperfectsqrt(int num) {
        int start=0;
        int end=num;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(mid*mid>num){
                end=mid;
            } else if (mid*mid<num) {
                start=mid;

            }
            if(mid*mid==num){
                return mid;

            }

        }
        return 0;
    }


}
