public class Solution {
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long ret = 0;
        boolean flag = true;
        str = str.trim(); // remove blanks at the head and tail
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                if (ch == '-' && i == 0) {
                    flag = false;
                }
                else if (ch == '+' && i == 0) {
                    flag = true;
                }
                else {
                    break;
                }
            }
            else {
                ret = ret*10+ch-'0';
            }
        }
        if (flag == false) {
            ret = -ret;
        }
        if (ret < Integer.MIN_VALUE) {
            ret = Integer.MIN_VALUE;
        }
        if (ret > Integer.MAX_VALUE) {
            ret = Integer.MAX_VALUE;
        }
        return ret;
    }
}
