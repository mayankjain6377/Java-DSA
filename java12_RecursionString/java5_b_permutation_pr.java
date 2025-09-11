package java12_RecursionString;

public class java5_b_permutation_pr {
        public static void main(String[] args) {
            permutation("", "abc");
        }

        public static void permutation(String p, String up) {
            if (up.isEmpty()) {
                System.out.println(p);
                return;
            }

            char ch = up.charAt(0);
            permutation(p + ch, up.substring(1));
            
        }
    }


