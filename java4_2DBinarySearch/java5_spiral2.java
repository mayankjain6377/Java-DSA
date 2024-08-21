//package java4_2DBinarySearch;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class java5_spiral2 {
//    public static void main(String[] args) {
//package java4_2DBinarySearch;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//        public class java3_SpiralMatrix {
//            public static void main(String[] args) {
//                int[][] mat =
//                        {
//                                {1, 2, 3, 4, 5, 6, 7, 8},
//                                {9, 10, 11, 12, 13, 14, 15, 16},
//                                {33, 34, 35, 36, 37, 38, 39, 40},
//                                {41, 42, 43, 44, 46, 47, 67,48},
//                                {49, 50, 51, 52, 53, 54, 55, 56},
//                        };
//                spiral(mat);
//                System.out.println(Arrays.deepToString(mat));
//            }
//
//            static List<Integer> spiral(int[][] mat) {
//                List<Integer>result=new ArrayList<>();
//                int r = mat.length;
//                int c = mat[r - 1].length;
//                int topRow = 0;
//                int bottomRow = r - 1;
//                int leftCol = 0;
//                int rightCol = c - 1;
//                int totalElements=0;
//                while (totalElements<r*c) {
//                    for (int i = leftCol; i <= rightCol && totalElements<r*c; i++) {
//                        result.add(mat[topRow][i]);
//                        totalElements++;
//                    }
//                    topRow++;
//                    for (int i = topRow; i <= bottomRow && totalElements<r*c; i++) {
//                        result.add(mat[i][rightCol]);
//                        totalElements++;
//
//                    }
//                    rightCol--;
//                    for (int i = rightCol; i >= leftCol && totalElements<r*c; i--) {
//                        result.add(mat[bottomRow][i]);
//                        totalElements++;
//
//                    }
//                    bottomRow--;
//                    for (int i = bottomRow; i >= topRow && totalElements<r*c; i--) {
//                        result.add(mat[i][leftCol]);
//                        totalElements++;
//
//                    }
//                    leftCol++;
//                }
//                return result;
//            }
//
//        }
//
//
//    }
//}
