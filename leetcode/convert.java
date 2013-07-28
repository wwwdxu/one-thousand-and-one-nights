public class Solution {
    public String convert(String s, int nRows) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (nRows <= 0)
            return null;
        if (nRows == 1)
            return s;
        HashMap<Integer, LinkedList<Character>> map = new HashMap<Integer, LinkedList<Character>>();
        char[] chs = s.toCharArray();
        for (int i=0; i<chs.length;) {
            for (int j=0; i < chs.length && j<nRows-1; j++) {
                if (map.containsKey(j)) {
                    LinkedList<Character> tmp = map.get(j);
                    tmp.add(chs[i]);
                    map.put(j, tmp);
                }
                else {
                    LinkedList<Character> tmp = new LinkedList<Character>();
                    tmp.add(chs[i]);
                    map.put(j, tmp);
                }
                i++;
            }
            for (int k=nRows-1; i < chs.length && k>0; k--) {
                if (map.containsKey(k)) {
                    LinkedList<Character> tmp = map.get(k);
                    tmp.add(chs[i]);
                    map.put(k, tmp);
                }
                else {
                    LinkedList<Character> tmp = new LinkedList<Character>();
                    tmp.add(chs[i]);
                    map.put(k, tmp);
                }
                i++;
            }
        }
        String ret = "";
        for (int i=0; i<nRows; i++) {
            LinkedList<Character> tmp = map.get(i);
            if (tmp == null)
                break;
            for (int j=0; j<tmp.size(); j++) {
                ret += tmp.get(j);
            }
        }
        return ret;
    }
}
