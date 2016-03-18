public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        while (n > 0) {
	// The key is to substract 1 first **************
            n--;
            int idx = n % 26;
            result.insert(0, (char)('A' + idx));
            n = n / 26;
        }
        return result.toString();
    }
}