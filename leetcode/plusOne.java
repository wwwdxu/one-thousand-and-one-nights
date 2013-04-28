public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int flag = 1;
        int len = digits.length;
        for (int i=len-1; i>=0; i--) {
            int total = digits[i]+flag;
            digits[i] = total%10;
            flag = total/10;
        }
        if (flag>0) {
            int[] ret = new int[len+1];
            ret[0] = flag;
            for (int i=1; i<=len; i++) {
                ret[i] = digits[i-1];
            }
            return ret;
        }
        else
            return digits;
    }
}
