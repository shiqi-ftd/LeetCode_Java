public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
    Arrays.sort(num);
    List<List<Integer>> res = new LinkedList<>(); 
    for (int i = 0; i < num.length - 3; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            for (int j = i + 1; j < num.length - 2; j++) {
                if (j == i + 1 || num[j] != num[j - 1]) {
                    int lo = j+1, hi = num.length - 1, sum = target - num[i] -num[j];
                    while (lo < hi) {
                        if (num[lo] + num[hi] == sum) {
                            res.add(Arrays.asList(num[i], num[j], num[lo], num[hi]));
                            while (lo < hi && num[lo] == num[lo+1]) {
                                lo++;
                            }
                            while (lo < hi && num[hi] == num[hi-1]) {
                                hi--;
                            }
                            lo++; 
                            hi--;
                        } else if (num[lo] + num[hi] < sum) {
                            while (lo < hi && num[lo] == num[lo+1]) {
                                lo++;
                            }
                            lo++;
                        }
                        else {
                            while (lo < hi && num[hi] == num[hi-1]) {
                                hi--;
                            }
                            hi--;                    
                        } 
                    }
               }
            }
        }
    }
    return res;
    }
}