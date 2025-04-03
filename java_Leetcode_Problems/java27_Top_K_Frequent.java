package java_Leetcode_Problems;

import java.util.*;

public class java27_Top_K_Frequent {
    public static void main(String[] args) {
top(new int[]{1,1,1,2,2,2,2,3,3},2);

    }
    public static void top(int[]nums,int k){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }
            else{
                map.put(nums[i],1);
            }

        }
        List<Integer> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)-> map.get(b)-map.get(a));
        int[]result=new int[k];
        int index=0;
        for (int i = 0; i < k; i++) {
            result[index]=list.get(i);
            index++;

        }
        System.out.println(Arrays.toString(result));
        System.out.println(map);
    }
}
