package java_Leetcode_Problems;

public class java5_RotateImage {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3},
                        {4, 5, 6},
                {7, 8, 9}};
        Transpose(mat);
        reverseRows(mat);
        print(mat);
    }

    private static void reverseRows(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int left=0;
            int right=mat.length-1;
            while(left<right){
                int temp=mat[i][right];
                mat[i][right]=mat[i][left];
                mat[i][left]=temp;
                left++;
                right--;
            }

        }

    }
    private static void Transpose(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <=i ; j++) {
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
    }

    public static void print(int[][] mat) {
//        int count=1;
        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {

                System.out.print(" "+mat[i][j]);
            }
            System.out.println();
        }
    }
}
