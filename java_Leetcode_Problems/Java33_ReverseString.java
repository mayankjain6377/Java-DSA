package java_Leetcode_Problems;

public class Java33_ReverseString {
    public static void main(String[] args) {
        reverseWords("let's make a website");
    }

    public static String reverseWords(String str) {
        String[] words = str.split(" "); // Split the string by spaces
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse(); // Reverse each word
            result.append(reversedWord).append(" "); // Append reversed word and space
        }

        System.out.println(result.toString().trim()); // Print result
        return result.toString().trim(); // Return without extra space at end
    }
}
