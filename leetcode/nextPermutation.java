public class Solution {
    public void nextPermutation(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (num == null || num.length < 2)
            return;
        int len = num.length;
        int i;
        for (i=len-2; i>0; i--) {
            if (num[i] < num[i+1])
                break;
        }
        int j;
        for (j = i+1; j<len-1; j++) {
            if (num[j] > num[i] && num[j+1] <= num[i]) {
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
                break;
            }
        }
        if (j == len-1) {
            int tmp = num[i];
            num[i] = num[j];
            num[j] = tmp;
        }
        int k;
        for (j = i+1; j<len-1; j++)
            for (k = j+1; k<len; k++) {
                if (num[j] > num[k]) {
                    int tmp = num[j];
                    num[j] = num[k];
                    num[k] = tmp;
                }
            }
    }
}
