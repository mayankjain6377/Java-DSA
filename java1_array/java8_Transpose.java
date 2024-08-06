import java.util.Arrays;
public class java8_Transpose {
    public static void main(String[] args ){
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} , {7, 8, 9}};
       int row=matrix.length;
        int col=matrix[0].length;
int arr[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[j][i] = matrix[i][j];
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
//            System.out.println(Arrays.toString(arr[i]));
        }
    }


    }

