public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = num.length;
        Arrays.sort(num);
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<len-2; i++) {
            int t = target-num[i];
            int start = i+1;
            int end = len-1;
            while (start<end) {
                map.put(Math.abs(num[start]+num[end]-t), num[i]+num[start]+num[end]);
                if (num[start]+num[end]-t == 0) {
                    return target;
                }
                else if (num[start]+num[end]-t<0) {
                    start++;
                }
                else {
                    end--;
                }
            }
        }
        int key = Integer.MAX_VALUE;
        for (int k: map.keySet()) {
            if (k < key)
                key = k;
        }
        return map.get(key);
    }
}
