public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;
        if (x == 0)
            return 0;
        else if (x == 1)
            return 1;
        boolean flag = true;
        if (n < 0)
            flag = false;
        n = Math.abs(n);
        double ret1 = pow(x, n/2);
        double ret2 = pow(x, n%2);
        double ret = ret1*ret1*ret2;
        if (flag == false)
            ret = 1/ret;
        return ret;
    }
}
