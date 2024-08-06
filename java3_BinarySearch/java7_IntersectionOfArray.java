package java3_BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class java7_IntersectionOfArray {
    public static void main(String[] args ){
int [] nums1={1,5,5,6,7};
int [] nums2={1,5,6,5,5,23};
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i < nums1.length ; i++) {
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i]==nums2[j])

                {
                    list.add(nums1[i]);
                    if(nums2[j]==nums2[j+1])
                    {
                        j++;
                    }
                }
            }

        }

//        System.out.println(Arrays.toString(ans));
//        System.out.println(list.toString());
   int []ans=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]=list.get(i);
        }
        System.out.println(Arrays.toString(ans));
        for (int i = 0; i < ans.length-2; i++) {
            if(ans[i]!=ans[i+1])
            {
//                list.add(i)=ans[i];
            }
        }
//        ArrayList<Integer> list2 = new ArrayList<>();
//        System.out.println(list2.toString());
    }
}
