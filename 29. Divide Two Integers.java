public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        long result = divideLong(dividend, divisor);
        return result > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)result;
    }

    public long divideLong(long dividend, long divisor) {
        boolean negtive = dividend < 0 != divisor < 0;
        
        if (dividend < 0) {
            dividend = -dividend;
        }
        if (divisor < 0) {
            divisor = -divisor;
        }
        
        if (divisor > dividend) {
            return 0;
        }
        long sum = divisor;
        long cur = 1;
        while (sum + sum <= dividend) {
            sum += sum;
            cur += cur;
        }
        
        return negtive ? -(cur + divideLong(dividend - sum, divisor)) : cur + divideLong(dividend - sum, divisor);
        
    }
}