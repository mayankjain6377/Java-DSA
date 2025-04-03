//package java_oops.Generics;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class CustomArrayList<T> {
//    private T[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size = 0;
//
//    public CustomArrayList() {
//
//        this.data = new T[DEFAULT_SIZE];
//    }
//
//    public void add(int num) {
//        if (isfull()) {
//            resize();
//
//        }
//        data[size++] = num;
//    }
//    public int remove (){
//       int removed= data[--size];
//       return removed;
//
//    }
//
//    private void resize() {
//        size = data.length * 2;
//        int[] temp = new int[size];
//
//        System.arraycopy(data, 0, temp, 0, data.length);
//        data = temp;
//    }
//
//    private boolean isfull() {
//        return data.length == size;
//    }
//public void ArrayListDisplay(){
//    System.out.println(Arrays.toString(data));
//
//}
//    public static void main(String[] args) {
//
//CustomArrayList list=new CustomArrayList();
//list.add(21);
//list.add(2);
//list.add(1);
//list.add(321);
//list.add(241);
//list.remove();
//list.ArrayListDisplay();
//
//
//    }
//}
