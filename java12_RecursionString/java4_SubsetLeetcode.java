package java12_RecursionString;
import java.util.ArrayList;
import java.util.List;

public class java4_SubsetLeetcode {
    public static void main(String[] args) {
int []nums={1,2,3};
List<List<Integer>>ans=subset(nums);
        System.out.println(ans);
    }

    static List<List<Integer>>result=new ArrayList<>();
    private static void findsubset(int[] nums, int index, ArrayList<Integer> sublist) {
        if (nums.length == index) {
            result.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[index]);
        findsubset(nums, index + 1, sublist);
        sublist.remove(sublist.size() - 1);
        findsubset(nums, index + 1, sublist);
//        findsubset(nums,index+1,sublist);
    }

    private static List<List<Integer>> subset(int[] nums) {
        findsubset(nums,0,new ArrayList<>());
        return result;
    }
}
