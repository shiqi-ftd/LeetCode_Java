// TLE !
public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        int wordMax = getMax(wordDict);
        ArrayList<String> sub = new ArrayList<String>();
        List<String> res = new ArrayList();
        helper(wordDict, res, sub, s, wordMax, 0);
        return res;
    }
    
    private void helper(Set<String> wordDict, List<String> res, ArrayList<String> sub, String s, int wordMax, int head) {
        if (head == s.length()) {
            int len = sub.size();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < len - 1; i++) {
                sb.append(sub.get(i) + " ");
            }
            sb.append(sub.get(len - 1));
            res.add(sb.toString());
            return;
        }
        for (int i = head + 1; i <= s.length() && i - head <= wordMax; i++) {
            if (wordDict.contains(s.substring(head, i))) {
                sub.add(s.substring(head, i));
                helper(wordDict, res, sub, s, wordMax, i);
                sub.remove(sub.size() - 1);
            }
        }
    }
    
    
    private int getMax(Set<String> wordDict) {
        int max = 0;
        for (String str : wordDict) {
            max = Math.max(max, str.length());
        }
        return max;
    }
}