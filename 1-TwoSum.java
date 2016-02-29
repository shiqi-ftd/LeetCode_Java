public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
	//  contains *KEY*
            if (hm.containsKey(nums[i])) {
                return new int[]{hm.get(nums[i]), i};
            } else{
	// PUT not add for hashmap
                hm.put(target - nums[i], i);
            }
        }
        return new int[]{0};
    }
}