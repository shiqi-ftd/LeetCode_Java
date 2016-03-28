public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split("\\s");
        HashMap<Character, String> hm = new HashMap<Character, String>();
        
        if (strs.length != pattern.length()) return false;
        
        for (int i = 0; i < strs.length; i++) {
            if (hm.containsKey(pattern.charAt(i))) {
                if (!hm.get(pattern.charAt(i)).equals(strs[i]))
                    return false;
            } else if (hm.containsValue(strs[i])) {
                    return false;
            } else {
                hm.put(pattern.charAt(i), strs[i]);
            } 
        }
        return true;
    }
}