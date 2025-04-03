package java13_Backtracking;

import java.util.ArrayList;

//we have to return the total number of ways to reach the
public class java1_MazeProblem {
    public static void main(String[] args) {
//        System.out.println(mazeCountWay(3,3));
//        System.out.println(mazeDiagnoal("",3,3));
        boolean[][]board={
                {true,false,true},
                {true,false,true},
                {false,true,true}

        };
        mazeObstacles("",board,0,0);
    }
    //calculate the no of ways to reach the destination
    private static int mazeCountWay(int i,int j){
        if(i==1||j==1){
            return 1;
        }
        int left=mazeCountWay(i-1,j);
        int right=mazeCountWay(i,j-1);
        return left+right;

    }

//calculate maze Vertical ,Horizontal,Diagonal
    private static  ArrayList<String> mazeDiagnoal(String p,int i, int j) {
        ArrayList<String>list=new ArrayList<>();
        if(i==1&&j==1){
            list.add(p);
            return list;
        }
        if(i>1&&j>1){
            list.addAll(mazeDiagnoal(p+"D",i-1,j-1));
        }
        if (i>1) {
            list.addAll(mazeDiagnoal(p + "V", i - 1, j));
        }
        if (j>1) {
            list.addAll(mazeDiagnoal(p + "H", i, j - 1));
        }
        return list;
    }

//calculate maze Vertical ,Horizontal,Diagonal with obstacles like as River

private static void mazeObstacles(String p,boolean[][]maze,int i,int j){
        if(i==maze.length-1&&j==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[i][j]){
            return;
        }
        if(i<maze.length-1&&j<maze[0].length-1){
            mazeObstacles(p+"D",maze,i+1,j+1);
        }
        if (i<maze.length-1){
            mazeObstacles(p+"V",maze,i+1,j);
        }
        if (j<maze[0].length-1){
            mazeObstacles(p+"H",maze,i,j+1);
        }
}
}
