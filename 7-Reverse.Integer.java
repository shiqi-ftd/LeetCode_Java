// The key is to handle overflow
public class Solution {
    public int reverse(int x) {
        boolean tag = false;
        if (x < 0) {
            tag = true;
            x = -x;
        }
	// Use long instead of int for result
        long y = 0;
        while (x > 0) {
            y = y * 10 + x % 10;
            x = x / 10;
        }
        if (y > 0x7fffffff) return 0;        
        if (tag) return -(int)y;
        return (int)y;
    }
}