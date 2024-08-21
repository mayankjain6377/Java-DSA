package java4_2DBinarySearch;

public class java2_MedianOfSortedArray {
    public static void main(String[] args) {
int []num1={1,4,5,6};
int []num2={2,6,8};
int sum=0;
        for (int i = 0; i < num1.length; i++) {
            sum=sum+num1[i];
        }
//        System.out.println(sum);
        for (int i = 0; i < num2.length; i++) {
            sum=sum+num2[i];
        }
        float ans=(float)sum/(num1.length+num2.length);
        System.out.println(ans);

    }
}
