public class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int len = 0;
        while (right >=0 && s.charAt(right) == ' ') {
            right--;
        }
        while (right >=0 && s.charAt(right) != ' ') {
            right--;
            len++;
        }
        return len;
    }
}