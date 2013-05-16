public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int[] S) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (S.length == 0)
            return ret;
        ArrayList<Integer> buf = new ArrayList<Integer>();
        ret.add(buf);
        Arrays.sort(S);
        for (int i=0; i<S.length; i++) {
            ArrayList<ArrayList<Integer>> tmp = new ArrayList<ArrayList<Integer>>();
            for (ArrayList<Integer> al : ret) {
                tmp.add(al);
                ArrayList<Integer> dup = (ArrayList<Integer>) al.clone();
                dup.add(S[i]);
                tmp.add(dup);
            }
            ret = tmp;
        }
        return ret;
    }
}
