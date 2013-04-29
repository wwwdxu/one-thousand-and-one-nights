public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x == 0)
            return 0;
        if (x == 1)
            return 1;
        int low = 1;
        int high = x/2+1 < (int)Math.sqrt(Integer.MAX_VALUE)? x/2+1: (int)Math.sqrt(Integer.MAX_VALUE);
        while (low<high) {
            int mid = low+(high-low)/2;
            if (mid*mid > x)
                high = mid-1;
            else if (mid*mid <= x && (mid+1)*(mid+1) > x)
                return mid;
            else
                low =  mid+1;
        }
        return low+(high-low)/2;
    }
}
