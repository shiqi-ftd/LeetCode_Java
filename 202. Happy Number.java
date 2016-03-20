public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> record = new HashSet<Integer> ();
        
        while (true) {
            if (record.contains(n)) return false;
            record.add(n);
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (sum == 1) return true;
            n = sum;
        }
    }
}