public class Solution {
    public boolean isPalindrome(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s.length() == 0)
            return true;

        int left = 0;
        int right = s.length()-1;
        s = s.toLowerCase();

        while (left < right) {
            while ((s.charAt(left) < '0' || (s.charAt(left) > '9' && s.charAt(left) < 'a') || s.charAt(left) > 'z') && left < right)
                left++;
            while ((s.charAt(right) < '0' || (s.charAt(right) > '9' && s.charAt(right) < 'a') || s.charAt(right) > 'z') && left < right)
                right--;
            if (left < right) {
                if (s.charAt(left) != s.charAt(right))
                    return false;
                else {
                    left++;
                    right--;
                }
            }
        }
        return true;
    }
}
