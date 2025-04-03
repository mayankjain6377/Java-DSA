package java8_Recursion;

public class java12_ReduceNumber {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        return reduce(num, 0);
    }

    private static int reduce(int num,int steps){
      while(num>0){
          if(num%2==0){
              num=num/2;

          }
          else{
              num=num-1;
          }
          steps++;
      }

        return steps;
    }



//    private static int reduce(int num, int steps) {
//        if (num == 0) {
//            return steps;
//        }
//        if (num % 2 == 0) {
//            return reduce(num / 2, steps + 1);
//        }
//        return reduce(num - 1, steps + 1);
//    }
//

}
