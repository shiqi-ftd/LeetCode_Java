// TLE

public class Solution {
    public int minCut(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        for (int i = 1; i <= len; i++) {
//  Initializing is important! dp[0] = -1;
            dp[i] = i - 1;
        }
        for (int i = 2; i <= len; i++) {
            for(int j = 0; j < i; j++) {
                if (isPalindrome(s.substring(j, i))) {
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }
        return dp[len];
    }
    private boolean isPalindrome(String str) {
        int len = str.length() - 1;
        int start = 0;
        while (start < len) {
            if (str.charAt(start++) != str.charAt(len--)) return false;
        }
        return true;
    }

}

// Cached Solution
public class Solution {
    public int minCut(String s) {
        int len = s.length();
        int[] dp = new int[len + 1];
        boolean[][] cache = getIsPalindrome(s);

        for (int i = 0; i <= len; i++) {
            dp[i] = i - 1;
        }
        for (int i = 2; i <= len; i++) {
            for(int j = 0; j < i; j++) {
                if (cache[j][i - 1]) { 
                    dp[i] = Math.min(dp[j] + 1, dp[i]);
                }
            }
        }
        return dp[len];
    }
    private boolean[][] getIsPalindrome(String s) {
        boolean[][] isPalindrome = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); i++) {
            isPalindrome[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            isPalindrome[i][i + 1] = (s.charAt(i) == s.charAt(i + 1));
        }

        for (int length = 2; length < s.length(); length++) {
            for (int start = 0; start + length < s.length(); start++) {
                isPalindrome[start][start + length]
                    = isPalindrome[start + 1][start + length - 1] && s.charAt(start) == s.charAt(start + length);
            }
        }
        return isPalindrome;
    }
}