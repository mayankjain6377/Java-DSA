//package java13_Backtracking;
//import java.util.ArrayList;
//
//
//public class java3_MazeProblemDRLU {
//    public static void main(String[] args) {
//        boolean[][]board={
//                {true,true,true},
//                {true,true,true},
//                {true,true,true}
//        };
//        mazeObstacles("",board,0,0);
//    }
////calculate maze Down,Up,Left,Right
//    private static void mazeObstacles(String p,boolean[][]maze,int i,int j){
//        if(i==maze.length-1&&j==maze[0].length-1){
//            System.out.println(p);
//            return;
//        }
//        if(!maze[i][j]){
//            return;
//        }
//        maze[i][j]=false;
//        if(i<maze.length-1){
//            mazeObstacles(p+"D",maze,i+1,j);
//        }
//        if (j<maze[0].length-1){
//            mazeObstacles(p+"R",maze,i,j+1);
//        }
//        if (i>0){
//            mazeObstacles(p+"U",maze,i-1,j);
//        }
//        if (j>0){
//            mazeObstacles(p+"L",maze,i,j-1);
//        }
//        maze[i][j]=true;
//    }
//}
//
//
//



package java13_Backtracking;

import java.util.Arrays;

public class java3_MazeProblemDRLU {
    public static void main(String[] args) {
        boolean[][]board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][]path=new int[board.length][board[0].length];
        int step=1;
        mazeObstacles("",board,0,0,path,step);
    }
    //calculate maze Down,Up,Left,Right
    private static void mazeObstacles(String p,boolean[][]maze,int i,int j,int[][]path,int step){
        if(i==maze.length-1&&j==maze[0].length-1){
            path[i][j]=step;
            for (int[]arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(p);
            return;
        }
        if(!maze[i][j]){
            return;
        }
        maze[i][j]=false;
        path[i][j]=step;
        if(i<maze.length-1){
            mazeObstacles(p+"D",maze,i+1,j,path,step+1);
        }
        if (j<maze[0].length-1){
            mazeObstacles(p+"R",maze,i,j+1,path,step+1);
        }
        if (i>0){
            mazeObstacles(p+"U",maze,i-1,j,path,step+1);
        }
        if (j>0){
            mazeObstacles(p+"L",maze,i,j-1,path,step+1);
        }
        maze[i][j]=true;
        path[i][j]=0;
//        count=0;
    }
}



