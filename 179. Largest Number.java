public class Solution {
    class NumbersComparator implements Comparator<String> {
    	@Override
    	public int compare(String s1, String s2) {
    		return (s2 + s1).compareTo(s1 + s2);
    	}
    }

    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = Integer.toString(nums[i]);
        }
        Arrays.sort(strs, new NumbersComparator());
        StringBuilder sb = new StringBuilder();
        if (strs[0].charAt(0) == '0') {
            return "0";
        }
        for (int i = 0; i < strs.length; i++) {
            sb.append(strs[i]);
        }
        String result = sb.toString();
        return result;
    }
}