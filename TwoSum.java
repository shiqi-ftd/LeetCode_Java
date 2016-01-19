public class Solution {
    public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hm.containsKey(nums[i])) {
				return new int[]{hm.get(nums[i]) + 1, i + 1 };
			} else {
				hm.put(target - nums[i], i);
			}
		}
        return new int[2];
    }
}
