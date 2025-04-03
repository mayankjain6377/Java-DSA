package java_Leetcode_Problems;

public class java3_LongestPrefix {
    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};
        String ans = longestCommonPrefix(arr);
        System.out.println(ans);
    }
//    private static String logestCommonPrefix(String[] strs) {
//        String str = "";
//        int j = 0;
//        while (j < strs[0].length()) {
//            char ch = strs[0].charAt(j);
//            for (int i = 1; i < strs.length; i++) {
//                if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
//                    return str;
//                }
//            }
//                str += ch;
//                j++;
//            }
//        return str;
//    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i =0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);

            }
        }
        return prefix;
    }
}
