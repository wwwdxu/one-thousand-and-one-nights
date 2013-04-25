public class Solution {
    public boolean isValid(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
	Stac<Character>  st = new Stack<Character>();
	char[] chs = s.toCharArray();
	st.push('#');
	int i = 0;
	for (; i<chs.length; i++) {
	    if (chs[i] == '[' || chs[i] == '(' || chs[i] == '{')
		st.push(chs[i]);
	    else {
		if (st.peek() == '[' && chs[i] == ']')
		    st.pop();
		else if (st.peek() == '(' && chs[i] == ')')
		    st.pop();
		else if (st.peek() == '{' && chs[i] == '}')
		    st.pop();
		else
		    break;
	    }
	}
	if (i < chs.length)
	    return false;
	if (st.peek() != '#')
	    return false;
	return true;
    }
}