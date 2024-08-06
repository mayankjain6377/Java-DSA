package java3_BinarySearch;

import java.util.Arrays;

public class java5_twoSum2 {
    public static void main(String[] args ){
    int[] ans={-1,-1};
     int[] myans=answer(ans);
        System.out.println(Arrays.toString(myans));
        }
public static int [] answer(int[]ans)
{
    int []numbers={7,9,10,17,18,23,25,42,48,64};
    int n=numbers.length;
    int target=34;
    for (int i = 0; i < n-1; i++) {
        int start = i+1;
        int end = (n) - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (numbers[i] + numbers[mid] < target) {
                start = mid + 1;

            } else if (numbers[i] + numbers[mid] > target) {
                end = mid - 1;

            } else
            {
//                ans[0]=i;
//                ans[1]=mid;
                ans=new int[]{i,mid};
                break;
            }

//                return ans;
            }
        }
        return ans;
    }
}


