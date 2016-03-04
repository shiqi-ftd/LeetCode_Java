public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();

        if (digits == null || digits.length() == 0) {
            return res;
        }
        int end = digits.length() - 1;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        helper(0, end, digits, sb, mapping, res);
        return res;
    }
    private void helper(int start, int end, String digits, StringBuilder cur, String[] mapping, List<String> res) {
        String s = mapping[digits.charAt(start) - '0'];
        for (int i = 0; i < s.length(); i++) {
            cur.append(s.charAt(i));
            if (start == end) {

// toString() not tostring()
                res.add(cur.toString());    
            } else {
                helper(start + 1, end, digits, cur, mapping, res);
            }
// String builder delete(start, end), inclusive, exclusive
            cur.delete(cur.length() - 1, cur.length());
        }
    }
}