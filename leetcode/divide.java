public class Solution {
    public int divide(int dividend, int divisor) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int flag = 1;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            flag = -1;
        }
        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);


        int cnt = 0;

        while (ldividend >= ldivisor) {
            long cur = ldivisor;
            int i = 1;
            while (ldividend >= cur) {
                cnt += i;
                ldividend -= cur;
                cur <<= 1;
                i <<= 1;
            }
        }
        if (flag == -1) {
            cnt = -cnt;
        }
        return cnt;
    }
}
