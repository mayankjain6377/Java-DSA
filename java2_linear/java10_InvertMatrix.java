package java2_linear;

import java.util.Arrays;

public class java10_InvertMatrix {
    public static void main(String[] args ){
        int [][]image={
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        int [][] ans=new int [image.length][image.length];
for( int i=0; i<image.length;i++)
{
    int k=image[i].length;
    for(int j=image[i].length-1;j>=0;--j){
        ans[i][k-(j+1)]=image[i][j];
        {

        }
    }
}
        for (int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans[i].length; j++) {
//                System.out.print(ans[i][j] + " ");
                if(ans[i][j] ==0)
                {
                    ans[i][j] =1;
                }
                else
                    ans[i][j] =0;
            }
//            System.out.println();

        }
        for(int i=0; i<ans.length; i++)
        {
            System.out.println(Arrays.toString(ans[i]));
        }
//        System.out.println(Arrays.toString(ans));

    }
}
