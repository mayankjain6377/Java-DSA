import java.util.Arrays;
public class java6_wealth {
    public static void main(String[] args) {
        int [][] accounts={
            {1,4,6},
            {7,9,2},
            {3,0,2}
        };
        int temp[]=new int [accounts.length];
        int sum=0;
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
             for(int j=0;j<accounts[i].length;j++)
             {
                 temp[i]=temp[i]+accounts[i][j];  
             }
             sum=0;
            }
             System.out.println(Arrays.toString(temp));
         max=temp[0];
        for(int i=1;i<temp.length;i++)
        {
            if(temp[i]>max)
            {
                max=temp[i];
            }
        }
        
        // return max;
        System.out.println(max);
    }
    
}
