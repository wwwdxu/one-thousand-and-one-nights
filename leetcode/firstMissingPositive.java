public class Solution {
    public int firstMissingPositive(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null || A.length == 0)
            return 1;
        int len = A.length;
        for (int i=0; i<len;) {
            if (A[i] <= len && A[i] >= 1) {
                if (A[i] == i+1) {
                    i++;
                    continue;
                }
                if (A[A[i]-1] == A[i]) {
                    i++;
                    continue;
                }
                int tmp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
            else {
                i++;
            }
        }
        int j;
        for (j=0; j<len; j++) {
            if (A[j] != j+1)
                return j+1;
        }
        return j+1;
    }
}
