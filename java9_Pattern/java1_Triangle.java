package java9_Pattern;

public class java1_Triangle {
    public static void main(String[] args) {
        triangle(4,0);

    }
//
//    private static void triangle(int r, int c) {
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            System.out.print(" * ");
//            triangle(r,c+1);
//        }
//        else{
//            System.out.println();
//            triangle(r-1,0);
//        }
//    }

private static void triangle(int row,int col){
        if(row==0){
            return;

        }
        if(col<=row){
            System.out.print(" * ");
            triangle(row, col+1);

        }
        else
        {
            System.out.println();
            triangle(row-1, 0);
        }


}
}
