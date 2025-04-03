package java_Leetcode_Problems;

public class java32_CapitalDetect {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("llllll"));

    }

    public static boolean detectCapitalUse(String word) {
        int cap=0;
        int small=0;
        char c=word.charAt(0);
        boolean first=false;
        if(c>=65&&c<=90){
             first=true;
        }
        for(Character ch:word.toCharArray()){
                if((int)ch>=65 && (int)ch<=90){
                    cap++;
                }
                else{
                    small++;
                }

        }
if(word.length()==cap||word.length()==small){
    return true;
}
if(first &&small==word.length()-1){
    return true;
}
return false;
    }

}
