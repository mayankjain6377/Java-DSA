package java4_2DBinarySearch;

import java.util.Arrays;

public class java1_BinarySearch {
    public static void main(String[] args) {
    int [] []arr={{1,4,6},
            {8,9,11},
            {14,45}};
    int target=45;
int ans[]=Search(arr,target);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] Search(int[] []arr,int target)
    {
                int r=0;
                int c=arr.length-1;
                while(r< arr.length && c<arr[r].length-1)
                {
                    if(arr[r][c]<target)
                    {
                        r++;
                    }
                    else if(arr[r][c]>target)
                    {
                        c--;
                    }
                    else {
                        return new int[]{r,c};
                    }

                }
         return new int []{-1,-1};
        }
        }

