public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ret = new ArrayList<String>();
        if (n < 1)
            return ret;

        generate(ret, n, 0, "");
        return ret;
    }

    public void generate(ArrayList<String> ret, int left, int right, String str) {
        if (left == 0 && right == 0) {
            ret.add(str);
        }
        if (left > 0) {
            generate(ret, left-1, right+1, str+"(");
        }
        if (right > 0) {
            generate(ret, left, right-1, str+")");
        }
    }
}
