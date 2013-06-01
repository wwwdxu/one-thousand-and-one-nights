public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] ret = new int[2];
        ret[0] = -1;
        ret[1] = -1;
        if (A == null)
            return ret;
        int len = A.length;
        if (len == 0)
            return ret;
        int start = 0;
        int end = len-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (A[mid] == target) {
                int lower = findLower(A, mid, target);
                int higher = findHigher(A, mid, target);
                ret[0] = lower;
                ret[1] = higher;
                break;
            }
            else if (A[mid] < target) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return ret;
    }

    int findLower(int[] A, int mid, int target) {
        int start = 0;
        int end = mid-1;
        while (start <= end) {
            mid = start+(end-start)/2;
            if (A[mid] == target) {
                end = mid-1;
            }
            else if (A[mid] < target) {
                start = mid+1;
            }
        }
        if (A[mid] == target)
            return mid;
        else
            return mid+1;
    }

    int findHigher(int[] A, int mid, int target) {
        int start = mid+1;
        int end = A.length-1;
        while (start <= end) {
            mid = start+(end-start)/2;
            if (A[mid] == target) {
                start = mid+1;
            }
            else if (A[mid] > target) {
                end = mid-1;
            }
        }
        if (A[mid] == target)
            return mid;
        else
            return mid-1;
    }
}
