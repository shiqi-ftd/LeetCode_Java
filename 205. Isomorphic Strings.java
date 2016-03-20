public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        }
        int lenS = s.length();
        int lenT = t.length();
        if (lenS != lenT) {
            return false;
        }
        HashMap<Character, Character> hm = new HashMap<Character, Character>();
        
        for (int i = 0; i < lenS; i++) {
            if (hm.containsKey(s.charAt(i))) {
                if (hm.get(s.charAt(i)) != t.charAt(i)) return false;
            } else if (hm.containsValue(t.charAt(i))) {
                return false;
            } else {
                hm.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}