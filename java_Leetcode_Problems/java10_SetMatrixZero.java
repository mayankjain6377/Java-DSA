package java_Leetcode_Problems;

import java.util.Arrays;

public class java10_SetMatrixZero {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 0},
                {2, 4, 3},
                {4, 50, 0}};
        int[][] ans = setZeroes(mat);
        for (int i = 0; i < ans.length; i++) {

            System.out.println(Arrays.toString(ans));
        }

    }

    public static int[][] setZeroes(int[][] mat) {
        boolean[][] zero = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    zero[i][j] = true;
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (zero[i][j]) {
                    int tempRow = i;
                    int tempCol = j;
                    i = 0;
                    while (i < mat.length) {
                        mat[i][tempCol] = 0;
                        i++;
                    }

                    i = tempRow;
                    j = 0;
                    while (j < mat[0].length) {
                        mat[tempRow][j] = 0;
                        j++;
                    }

                    i = tempRow;
                    j = tempCol;
                }
            }

        }
        return mat;
    }
}
