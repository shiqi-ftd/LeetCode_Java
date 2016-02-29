public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();

	// Key is to divide into chunks!
        int chunk = Math.max(numRows*2 -2 ,numRows);
        StringBuilder result = new StringBuilder();

        for (int row = 0; row < numRows; row++) {
            for (int i=0; i < len; i += chunk) {
                if (i + row < s.length())
                result.append(s.charAt(i + row));
                if (row > 0 && row < numRows - 1 && (i + chunk - row < s.length()))
                result.append(s.charAt(i + chunk - row));
            }
        }
        return result.toString();
    }
}