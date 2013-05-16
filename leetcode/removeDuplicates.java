public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A.length <= 1) {
            return A.length;
        }

        int p1 = 0;
        int p2 = 1;

        while (p2 < A.length) {
            if (A[p2] == A[p1]) {
                p2++;
            }
            else {
                p1++;
                int tmp = A[p2];
                A[p2] = A[p1];
                A[p1] = tmp;
                p2++;
            }
        }
        return p1+1;
    }
}
