public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (matrix == null) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 && n == 0) return false;
        int i = 0;
        int j = n-1;
        while (i<m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else if (matrix[i][j] > target)
                j--;
        }
        return false;
    }
}
