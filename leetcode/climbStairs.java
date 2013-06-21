public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] stairs = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;
        for (int k = 2; k <= n; k++) {
            stairs[k] = stairs[k-1]+stairs[k-2];
        }
        return stairs[n];
    }
}
