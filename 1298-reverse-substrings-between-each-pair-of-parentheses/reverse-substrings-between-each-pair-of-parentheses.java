class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        st.push(new StringBuilder());
        for(char c:s.toCharArray()){
            if(c == '('){
                st.push( new StringBuilder());

            }
            else if(c == ')'){
                StringBuilder sb = st.pop();
                st.peek().append(sb.reverse());
            }
            else{
                st.peek().append(c);
            }
        }
        return st.pop().toString();
        }
}