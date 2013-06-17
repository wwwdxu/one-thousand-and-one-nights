public class Solution {
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (s == null)
            return 0;
        char[] chs = s.toCharArray();
        int len = chs.length;
        boolean[] map = new boolean[len];
        for (int i=0; i<len; i++) {
            map[i] = false;
        }
        Stack<Integer> st = new Stack<Integer>();
        for (int i=0; i<len; i++) {
            if (chs[i] == '(') {
                st.push(i);
            }
            else {
                if(st.empty())
                    continue;
                int index = st.pop();
                map[index] = true;
                map[i] = true;
            }
        }
        int max = 0;
        int cnt = 0;
        for (int i=0; i<len; i++) {
            if (map[i] == true) {
                cnt++;
            }
            else {
                if (cnt > max)
                    max = cnt;
                cnt = 0;
            }
        }
        if (cnt > max)
            max = cnt;
        return max;
    }
}
