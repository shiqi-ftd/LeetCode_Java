public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String, List<String>> hm = new HashMap<String, List<String>>();
        if (strs == null) {
            return res;
        }
        Arrays.sort(strs);
        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            if (hm.containsKey(String.valueOf(ch))) {
                hm.get(String.valueOf(ch)).add(strs[i]);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                hm.put(String.valueOf(ch), newList);
            }
        }
        for (List<String> item: hm.values()) {
            res.add(item);
        }
        return res;
    }
}