import java.util.Arrays;

public class java9_Conversion {
    public static void main(String[] args )
    {
        int [] digits={1,5,6};
        int k=121;
        String str="";
        for (int i = 0; i < digits.length; i++) {
            str=str+(digits[i]);
        }
        int digitss=Integer.parseInt(str);
        int sum=digitss+k;
        String str2=Integer.toString(sum);
        System.out.println(Arrays.toString(str2.toCharArray()));

//        System.out.println(sum);


    }
}
