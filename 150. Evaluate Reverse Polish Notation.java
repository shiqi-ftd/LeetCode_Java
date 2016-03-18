public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> res = new Stack<Integer>();
        
        int len = tokens.length;
        
        for (int i = 0; i < len; i++) {
            if (tokens[i].equals("+")) {
                int first = res.pop();
                int second = res.pop();
                res.push(first + second);
            } else if (tokens[i].equals("-")) {
                int first = res.pop();
                int second = res.pop();
                res.push(second - first);
            } else if (tokens[i].equals("*")) {
                int first = res.pop();
                int second = res.pop();
                res.push(first * second);
            } else if (tokens[i].equals("/")) {
                int first = res.pop();
                int second = res.pop();
                res.push(second / first);
            } else {
                res.push(Integer.parseInt(tokens[i]));
            }
            
        }
        return res.pop();
    }
}