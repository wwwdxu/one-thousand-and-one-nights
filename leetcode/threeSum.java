public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        HashMap<ArrayList<Integer>, Boolean> map = HashMap<ArrayList<Integer>, Boolean>();
        int n = num.length;
        for (int i=0; i<n-2; i++) {
            int target = -num[i];
            int index1 = i+1;
            int index2 = n-1;
            if (index1+1<=index2 && num[index1]+num[index1+1] > target)
                continue;
            if (index2-1>=index1 && num[index2]+num[index2-1] < target)
                continue;
            while (index1 < index2) {
                if (num[index1]+num[index2] == target) {
                    ArrayList<Integer> tmp = new ArrayList<Integer>();
                    tmp.add(num[i]);
                    tmp.add(num[index1]);
                    tmp.add(num[index2]);
                    if (!map.containsKey(tmp)) {
                        ret.add(tmp);
                        map.put(tmp, true);
                    }
                    index1++;
                    while (index1 < index2 && num[index1] == num[index1-1]) {
                        index1++;
                    }
                    index2--;
                    while (index1 < index2 && num[index2] == num[index2+1]) {
                        index2--;
                    }
                }
                else if (num[index1]+num[index2] < target) {
                    index1++;
                    while (index1 < index2 && num[index1] == num[index1-1]) {
                        index1++;
                    }
                }
                else {
                    index2--;
                    while (index1 < index2 && num[index2] == num[index2+1]) {
                        index2--;
                    }
                }
            }
        }
        return ret;
    }
}
