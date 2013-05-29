public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (String str:strs) {
            String key = calcKey(str);
            if (map.containsKey(key)) {
                ArrayList<String> list = (ArrayList<String>)map.get(key);
                list.add(str);
                map.put(key, list);
            }
            else {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(key, list);
            }
        }
        ArrayList<String> ret = new ArrayList<String>();
        for (String k: map.keySet()) {
            ArrayList<String> list = map.get(k);
            if (list.size() < 2)
                continue;
            for (String entry: map.get(k))
                ret.add(entry);
        }
        return ret;
    }

    private String calcKey(String str) {
        char[] chs = str.toCharArray();
        Arrays.sort(chs);
        return new String(chs);
    }
}
