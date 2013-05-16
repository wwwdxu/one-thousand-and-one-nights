public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int len = A.length;
        if (len == 0) return 0;
        int left = 0;
        int right = len-1;
        while (left < right) {
            int mid = left + (right-left)/2;
            if (A[mid] == target) {
                return mid;
            }
            else if (A[mid] < target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        if (target > A[left])
            return left+1;
        else
            return left;
    }
}
