public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return true;
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char cStart = s.charAt(start);
            char cEnd = s.charAt(end);
            if (!Character.isLetterOrDigit(cStart)) {
                start++;
            } else if(!Character.isLetterOrDigit(cEnd)) {
                end--;
            } else {
                if (Character.toLowerCase(cStart) != Character.toLowerCase(cEnd)) return false;
                start++;
                end--;
            }
        }
        return true;
    }
}