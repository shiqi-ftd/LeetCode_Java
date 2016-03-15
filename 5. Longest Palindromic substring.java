public class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int len = s.length();
        int max = 0;
        for (int i = 0; i < len - 1; i++) {
	// Two possible palindrome
            int len1 = localMax(s, i, i);
            int len2 = localMax(s, i, i + 1);
            if (len1 > len2 && len1 > max) {
                max = len1;
                start = i - len1 / 2;
                end = i + len1 / 2;
            }
            if (len2 > len1 && len2 > max) {
                max = len2;
                start = i + 1 - len2 / 2;
                end = i + len2 / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    int localMax(String s, int startL, int startR) {
	// Be careful with this statement
        while (startL >= 0 && startR < s.length() && s.charAt(startL) == s.charAt(startR)) {
            startL--;
            startR++;
        }
        return startR - startL - 1;
    }
}