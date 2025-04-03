package java12_RecursionString;

import java.util.ArrayList;

public class java7_DiceProblem {
    public static void main(String[] args) {
       ArrayList<String>ans= dice("", 4, new ArrayList<>());
        System.out.println(ans);
    }

    private static ArrayList<String> dice(String p, int target, ArrayList<String> result) {
        if(result.contains(p)){
            result.remove(p);
            return result;
        }
        if (target == 0) {
            result.add(p);
            return result;
//        System.out.println(p);
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i, result);
        }
        return result;

    }
}
