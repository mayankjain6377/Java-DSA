package java3_BinarySearch;

public class java2_CeilingNumber {
    public static void main(String[] args) {
int [] letters={13,15,19,22,31,33,45,54,57,59,60};
int target=167;
int i=0;
int start=0;
int end=letters.length-1;
int ans=0;


while(start<=end)
{
    int mid =start+(end-start)/2;
    if(target<letters[mid])
    {
        end=mid-1;
    } else if (target>letters[mid]) {
        start=mid+1;
    }
    else
        {
        ans=letters[mid];
        break;
    }
}
if(start>end)
{
    ans=letters[start-1];
}
if(target>letters.length-1)
{
    ans=letters[0];
}
        System.out.println(ans);
    }
}



//class Solution {
//    public char nextGreatestLetter(char[] letters, char target) {
//        int start=0;
//        int end=letters.length-1;
//        while(start<=end)
//        {
//            int mid =start+(end-start)/2;
//            if(target<letters[mid])
//            {
//                end=mid-1;
//            }
//            else {
//
//                start=mid+1;
//            }
//        }
//        return letters[start%letters.length];
//    }
//}