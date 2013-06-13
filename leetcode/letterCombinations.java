public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ret = new ArrayList<String>();
        if (digits == null)
            return ret;
        char[] chs = digits.toCharArray();
        ret.add("");
        if (chs.length == 0)
            return ret;
        for (int i=0; i<chs.length; i++) {
            String tmp = "";
            if (chs[i]-'0' == 2)
                tmp = "abc";
            else if (chs[i]-'0' == 3)
                tmp = "def";
            else if (chs[i]-'0' == 4)
                tmp = "ghi";
            else if (chs[i]-'0' == 5)
                tmp = "jkl";
            else if (chs[i]-'0' == 6)
                tmp = "mno";
            else if (chs[i]-'0' == 7)
                tmp = "pqrs";
            else if (chs[i]-'0' == 8)
                tmp = "tuv";
            else if (chs[i]-'0' == 9)
                tmp = "wxyz";
            ArrayList<String> ret2 = new ArrayList<String>();
            for (int j=0; j<ret.size(); j++) {
                String lstr = ret.get(j);
                for (int k = 0; k<tmp.length(); k++) {
                    ret2.add(lstr+tmp.charAt(k));
                }
            }
            ret = ret2;
        }
        return ret;
    }
}
