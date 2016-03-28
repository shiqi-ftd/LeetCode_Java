public class NumArray {
    int[] cache;
    public NumArray(int[] nums) {
        cache = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            cache[i] = cache[i - 1] + nums[i - 1]; 
        }
    }

    public int sumRange(int i, int j) {
        return cache[j + 1] - cache[i];
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);