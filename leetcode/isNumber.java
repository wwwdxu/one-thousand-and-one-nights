public class Solution {
    public boolean isNumber(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        // s == null
        if (s == null)
            return false;
        s = s.trim();
        // s == "" or s == "   "
        if (s.length() == 0)
            return false;
        char[] chs = s.toCharArray();
        boolean dot = false;
        boolean es = false;
        boolean digit = false;

        for (int i=0; i<chs.length; i++) {
            if (chs[i] >= '0' && chs[i] <= '9') {
                digit = true;
                continue;
            }
            if (chs[i] == '+' && (i == 0 || chs[i-1] == 'e')) {
                digit = false;
                continue;
            }
            if (chs[i] == '-' && (i == 0 || chs[i-1] == 'e')) {
                digit = false;
                continue;
            }
            if (chs[i] == '.' && dot == false) {
                dot = true;
                continue;
            }
            if (chs[i] == 'e' && es == false && i != 0) {
                dot = true;
                es = true;
                digit = false;
                continue;
            }
            return false;
        }
        if (digit)
            return true;
        else
            return false;
    }
}
