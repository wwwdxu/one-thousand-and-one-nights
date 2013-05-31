public class Solution {
    public int search(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (A == null)
            return -1;
        int len = A.length;
        if (len == 0)
            return -1;
        int start = 0;
        int end = len-1;
        while (start <= end) {
            int mid = start+(end-start)/2;
            if (A[mid] == target)
                return mid;
            if (A[start] > A[end]) {
                if (A[mid] <= A[end]) {
                    if (target < A[mid]) 
                        end = mid -1;
                    else if (target <=A[end])
                        start = mid+1;
                    else
                        end = mid-1;
                }
                else{
                    if (target > A[mid])
                        start = mid+1;
                    else {
                        if (target >= A[start])
                            end = mid-1;
                        else
                            start = mid+1;
                    }
                }
            }
            else {
                if (target > A[mid])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }
        return -1;
    }
}
