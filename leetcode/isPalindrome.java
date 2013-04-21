public class Solution {
    public boolean isPalindrome(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (x < 0) return false;
        int n = 0;
        int tmp = x;
        while (tmp > 0) {
            tmp /= 10;
            n++;
        }
        return isPalindrome(x, n);
    }

    public boolean isPalindrome(int x, int n) {
        if (x<10) return true;
        int num1 = x%10;
        int num2 = x/(int)Math.pow(10, (n-1)*1.0);
        if (num1 != num2) return false;
        x = x%(int)Math.pow(10, (n-1)*1.0)/10;
        return isPalindrome(x, n-2);
    }
}
