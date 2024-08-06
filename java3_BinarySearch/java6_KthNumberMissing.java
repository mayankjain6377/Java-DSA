package java3_BinarySearch;

import java.util.ArrayList;

public class java6_KthNumberMissing {
    public static void main(String[] args) {
        int []arr={2,3,4,7,11};
        ArrayList<Integer>list=new ArrayList<>();
      int n=arr.length;
      for(int i=0;i<arr[n-1];i++)
      {
          int start=0;
          int end=n-1;
          int target=i+1;
          int  temp=0;
          while(start<=end)
          {
//              temp=false;
              int mid=start+(end-start)/2;
              if(target<arr[mid])
              {
                  end=mid-1;

              } else if (target>arr[mid]) {
                  start=mid+1;
              }
              else {
                  temp = 1;
                  break;
              }

          }
          if(temp==0) {
              list.add(target);
          }
      }
        for(int i = arr[n-1]+1; i <2002; i++)
        {
list.add(i);
        }
        int k=1000000;
            System.out.println(list.get(k-1));
    }
}
