public class Solution {
    public int calculate(String s) {    
        
        int len = s.length();
        int res = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int cur = 0;
        char sign = '+';
        
        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                cur = s.charAt(i) - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    cur = cur * 10 + s.charAt(i + 1) - '0';
                    i++;
                }
            } 
            if((!Character.isDigit(s.charAt(i)) &&' '!=s.charAt(i)) || i==len-1){
                if (sign == '+') {
                    stack.push(cur);
                }
                else if (sign == '-') {
                    stack.push(-cur);
                } else if (sign == '*') {
                    int last = stack.pop();
                    stack.push(last * cur);
                } else if (sign == '/') {
                    int last = stack.pop();
                    stack.push(last / cur);
                }
                sign = s.charAt(i);
                cur = 0;
            }
        }
        for (int itr: stack) {
            res += itr;
        }
        
        return res;
    }
}