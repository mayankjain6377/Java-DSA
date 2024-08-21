package java4_2DBinarySearch;

import java.util.Arrays;

public class java3_SpiralMatrix {
    public static void main(String[] args) {
//        int[][] mat =
//                {
//                        {1, 2, 3, 4, 5, 6, 7, 8},
//                        {9, 10, 11, 12, 13, 14, 15, 16},
//                        {33, 34, 35, 36, 37, 38, 39, 40},
//                        {41, 42, 43, 44, 46, 47, 48},
//                        {49, 50, 51, 52, 53, 54, 55, 56},
//                };
//        int n=5;

        int [][]mat=new int[5][5];
        spiral(mat);
        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));

        }

    }

    static int[][] spiral(int[][] mat) {
        int n= mat.length;
        int topRow = 0;
        int bottomRow = n- 1;
        int leftCol = 0;
        int rightCol = n - 1;
        int sum=1;
        int totalElements=0;
        while (totalElements< n* n) {
            for (int i = leftCol; i <= rightCol && totalElements< n* n; i++) {
                mat[topRow][i]=sum;
//                System.out.print(mat[topRow][i] + " ");
//                System.out.print(sum+ " ");
                sum++;
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements< n* n; i++) {
                mat[i][rightCol]=sum;
//                System.out.print(mat[i][rightCol] + " ");
//                System.out.print(sum+ " ");
                sum++;
                totalElements++;

            }
            rightCol--;
            for (int i = rightCol; i >= leftCol && totalElements< n* n; i--) {
                mat[bottomRow][i]=sum;
//                System.out.print(mat[bottomRow][i] + " ");
//                System.out.print(sum+ " ");
                sum++;
                totalElements++;

            }
            bottomRow--;
            for (int i = bottomRow; i >= topRow; i--) {
                mat[i][leftCol]=sum;
//                System.out.print(mat[i][leftCol] + " ");
//                System.out.print(sum+ " ");
                sum++;
                totalElements++;

            }
            leftCol++;
        }
        return mat;
    }
}
