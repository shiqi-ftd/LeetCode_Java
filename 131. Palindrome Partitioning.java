public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        ArrayList<String> cuts = new ArrayList<String> ();
        helper(res, cuts, 0, s);
        return res;
    }
    private void helper(List<List<String>> res, ArrayList<String> cuts, int start, String s) {
        if (start == s.length()) {
            res.add(new ArrayList<String> (cuts));
            return;
        }
        for (int i = 1; i + start <= s.length(); i++) {
            String sub = s.substring(start, start + i);
            if (!isPalindrome(sub)) {
                continue;
            }
            cuts.add(sub);
            helper(res, cuts, start + i, s);
            cuts.remove(cuts.size() - 1);
        }
    }
    private boolean isPalindrome(String str) {
        int len = str.length() - 1;
        int start = 0;
        while (start < len) {
            if (str.charAt(start++) != str.charAt(len--)) return false;
        }
        return true;
    }
}