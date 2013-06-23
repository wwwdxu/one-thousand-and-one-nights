public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<ArrayList<Integer>, Integer>();
        if (num == null || num.length < 4)
            return ret;
        Arrays.sort(num);
        int len = num.length;
        for (int i=0; i<len-3;) {
            for (int j=i+1; j<len-2;) {
                int t = target-num[i]-num[j];
                int left = j+1;
                int right = len-1;
                if (num[left]+num[left+1] > t || num[right]+num[right-1] < t) {
                    j++;
                    while (j<len-2 && num[j] == num[j-1])
                        j++;
                    continue;
                }
                while (left < right) {
                    if (num[left]+num[right] == t) {
                        ArrayList<Integer> sub = new ArrayList<Integer>();
                        sub.add(num[i]);
                        sub.add(num[j]);
                        sub.add(num[left]);
                        sub.add(num[right]);
                        if (!map.containsKey(sub)) {
                            ret.add(sub);
                            map.put(sub,1);
                        }
                        left++;
                        while (left < right && num[left] == num[left-1])
                            left++;
                        right--;
                        while (left < right && num[right] == num[right+1])
                            right--;
                    }
                    else if (num[left]+num[right] < t) {
                        left++;
                        while (left < right && num[left] == num[left-1])
                            left++;
                    }
                    else {
                        right--;
                        while (left < right && num[right] == num[right+1])
                            right--;
                    }
                }
                j++;
                while (j<len-2 && num[j] == num[j-1])
                    j++;
            }
            i++;
            while (i<len-3 && num[i] == num[i-1])
                i++;
        }
        return ret;
    }
}
