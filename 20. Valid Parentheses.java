public class Solution {
    public boolean isValid(String s) {
        if (s == null) {
            return true;
        }
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stk.push(s.charAt(i));
            } else {
                if (stk.empty()) {
                    return false;
                } else if (s.charAt(i) == ')' && stk.pop() == '(') {
                    continue;
                } else if (s.charAt(i) == ']' && stk.pop() == '[') {
                    continue;
                } else if (s.charAt(i) == '}' && stk.pop() == '{') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (stk.empty()) {
            return true;
        }
        return false;
    }
}