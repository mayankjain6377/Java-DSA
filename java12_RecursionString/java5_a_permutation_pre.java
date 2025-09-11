package java12_RecursionString;

import java.util.*;

public class java5_a_permutation_pre {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
permutation("","aabc",  set);
        List<String> sortedList = new ArrayList<>(newsat);
        Collections.sort(sortedList);
        for(String s : sortedList){
            System.out.println(s);
        }
    }
    static int count=0;
   static HashSet<String>newsat=new HashSet<>();
    public static void permutation(String p,String up, HashSet<String>set){
        if(up.isEmpty()){
            if(!set.contains(p)) {
//                System.out.println(p);
                set.add(p);
                newsat.add(p);
                count++;
            }
            return;


        }
        char ch=up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1),set);


        }
    }


}
