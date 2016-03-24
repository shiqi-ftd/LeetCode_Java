public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '-' || c == '+' || c == '*') {
                String str1 = input.substring(0, i);
                String str2 = input.substring(i + 1, input.length());
                List<Integer> res1 = diffWaysToCompute(str1);
                List<Integer> res2 = diffWaysToCompute(str2);
                for (int val1 : res1) {
                    for (int val2 : res2) {
                        if (c == '-') {
                            res.add(val1 - val2);
                        } else if (c == '+') {
                            res.add(val1 + val2);
                        } else if (c == '*') {
                            res.add(val1 * val2);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) res.add(Integer.valueOf(input));
        return res;
    }
}