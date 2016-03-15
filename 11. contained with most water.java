// TLE

public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
            }
        }
        return max;
    }
}

// 

public class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int max = 0;
        int left = 0, right = len - 1;
        while (left < right) {
            max = Math.max(Math.min(height[right], height[left]) * (right - left), max);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}