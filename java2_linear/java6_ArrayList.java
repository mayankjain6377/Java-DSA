package java2_linear;
import java.util.ArrayList;
import java.util.Arrays;

public class java6_ArrayList {
    public static void main(String[] args ){
        int []nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};
         ArrayList<Integer>list=new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
    int []  target=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i]=list.get(i);
        }
        System.out.println(Arrays.toString(target));
    }
}
