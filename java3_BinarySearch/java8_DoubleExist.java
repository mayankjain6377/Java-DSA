package java3_BinarySearch;

public class java8_DoubleExist {
    public static void main(String[] args) {
int [] arr={10,2,5,3};
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                for(int k=0;k<arr.length-1;k++)
                {
                if(arr[i]==(arr[j]*arr[k])) {
                    System.out.println("[" +j +"," +k + "]");

                    break;
                }
                }
            }

        }

    }
}
