class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char cc = s.charAt(i);
            if(cc == '(' || cc == '{' || cc == '[')
            {
                st.push(cc);
            }
            if(st.empty())
            return false;
            else if(cc == ')')
            {
                if(!st.isEmpty() && st.peek() != '(')
                {
                     return false;
                }
                st.pop();
            }
            else if(cc == '}')
            {
                if(!st.isEmpty() && st.peek() != '{')
                {
                     return false;
                }
                st.pop();
            }
            else if(cc == ']')
            {
                if(!st.isEmpty() && st.peek() != '[')
                {
                     return false;
                }
                st.pop();
            }
        }
        if(st.empty())
        return true;
        else
        return false;
}
}