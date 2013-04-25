public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
	if (A.length == 0)
	    return 0;
	int p = A.length-1;
	int q = 0;
	while (p >= 0 && A[p] == elem) {
	    p--;
	}
	
	while (q < p) {
	    if (A[q] == elem) {
		int tmp = A[p];
		A[p] = A[q];
		A[q] = tmp;
		p--;
		while (p >= 0 && A[p] == elem) {
		    p--;
		}
	    }
	    q++
	}
	return p+1;
    }
}