public class Solution {
    public String strStr(String haystack, String needle) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (haystack == null || needle == null || needle.length() == 0)
            return haystack;
        int len1 = haystack.length();
        int len2 = needle.length();

        if (len1 < len2)
            return null;

        for (int i=0; i<=len1-len2; i++) {
            int tmp = i;
            for (int j=0; j<len2; j++) {
                if (haystack.charAt(i) != needle.charAt(j))
                    break;
                i++;
            }
            if (i-tmp == len2) {
                return haystack.substring(tmp);
            }
            else {
                i = tmp;
            }
        }
        return null;
    }
}
