package java2_linear;

public class java4_GoodPair {
    public static void main(String[] args ){
        int sum=0;
        int [] nums={1,2,3,1,2,1,3};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
            }


        }
        System.out.println(sum);

    }
}
