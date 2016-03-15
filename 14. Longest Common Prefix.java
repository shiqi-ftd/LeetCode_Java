// My method, Slow
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs[0] == null) return "";
        int num = strs.length;
        
        int cur;
        boolean flag = true;
        
        for (cur = 0; cur < strs[0].length() && flag; cur++) {
            String pre = strs[0].substring(0, cur + 1);
            for (int j = 0; j < num; j++) {
                if (strs[j] != null && strs[j].length() >= cur + 1 && strs[j].substring(0, cur + 1).equals(pre)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (!flag) {
            return strs[0].substring(0, cur - 1);
        }
        return strs[0];
    }
}

// 
public class Solution {
    public String longestCommonPrefix(String[] strs) {    
        if (strs.length == 0) return "";
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++)
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0, pre.length() - 1);
    return pre;
    }
}