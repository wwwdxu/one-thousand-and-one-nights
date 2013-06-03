public class Solution {
    public int reverse(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean minus_sign = false;
        if (x < 0) {
            minus_sign = true;
            x = -x;
        }
        long ret = 0;
        while (x != 0) {
            int n = x%10;
            ret = ret*10+n;
            x = x/10;
        }
        if (ret > Integer.MAX_VALUE) {
            if (minus_sign)
                ret = Integer.MIN_VALUE;
            else
                ret = Integer.MAX_VALUE;
        }
        else {
            if (minus_sign)
                ret = -ret;
        }
        return (int)ret;
    }
}
