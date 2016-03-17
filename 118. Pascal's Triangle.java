public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        if (numRows <= 0) return res;
        
        ArrayList<Integer> start = new ArrayList<Integer>();
        start.add(1);
        res.add(new ArrayList<Integer>(start));
        
        for (int i = 1; i < numRows; i++) {
            if (res.size() == i) {
                res.add(new ArrayList<Integer>());
            }
            res.get(i).add(1);
            for (int j = 1; j < i; j++) {
                res.get(i).add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            res.get(i).add(1);
        }
        return res;
    }
}