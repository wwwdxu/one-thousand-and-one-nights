public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        if (n == 0)
            return ret;
        HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        map.put(0, true);
        int curr = 0;
        while (true) {
            int mask = 1;
            int tmp = mask ^ curr;
            int i = 1;
            while (map.containsKey(tmp) && i <= n) {
                mask = mask << 1;
                tmp = mask ^ curr;
                i++;
            }
            if (i <= n) {
                ret.add(tmp);
                map.put(tmp, true);
                curr = tmp;
            }
            else {
                return ret;
            }
        }
    }
}
