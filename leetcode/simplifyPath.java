public class Solution {
    public String simplifyPath(String path) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (path == null || path.isEmpty()) {
            return path;
        }
        Stack<String> st = new Stack<String>();
        st.push("/");
        String[] subs = path.split("/");
        for (String s : subs) {
            if (s.isEmpty())
                continue;
            else if (s.equals("."))
                continue;
            else if (s.equals("..")){
                if (st.peek().equals("/"))
                    continue;
                st.pop();
            }
            else
                st.push(s);
        }
        String ret = "";
        if (st.peek().equals("/"))
            return "/";
        while (!st.peek().equals("/")) {
            ret = "/"+st.pop()+ret;
        }
        return ret;
    }
}
