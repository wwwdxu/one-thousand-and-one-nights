public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        for (int index = m-1; index>=0; index--) {
            A[index+n] = A[index];
        }
        int i = n;
        int j = 0;
        int index = 0;
        while (i<m+n && j<n) {
            if (A[i] <= B[j]) {
                A[index] = A[i];
                i++;
            }
            else {
                A[index] = B[j];
                j++;
            }
            index++;
        }
        while (i<m+n) {
            A[index] = A[i];
            index++;
            i++;
        }
        while (j<n) {
            A[index] = B[j];
            index++;
            j++;
        }
    }
}
