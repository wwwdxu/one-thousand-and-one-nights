public class Solution {
    public boolean canJump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null || A.length == 0)
            return false;
        int len = A.length;
        int maxJump = 0;

        for (int i = 0; i<= maxJump && i<len; i++) {
            if (i+A[i] > maxJump)
                maxJump = i+A[i];
            if (maxJump >= len-1)
                return true;
        }
        return false;
    }
}
