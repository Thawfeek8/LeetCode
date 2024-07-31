/**
For those confused about the wording of the description, it's basically saying that no 'b' can come before any 'a' in a balanced string

The use of "pair" in the description is overly complicated, all it means is that there can exist no such 'b' at s[i] where s[j] is 'a' and i < j
 */
class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        st.push(' ');
        for(char c:s.toCharArray()){
            if(c == 'b' && st.peek() ==' '){
                st.push(c);
            }
            else if(c=='b' && st.peek()=='b'){
                st.push(c);
            }
            else if(c=='b' && st.peek()=='a'){
                st.push(c);
            }
            else if(c=='a' && st.peek()=='b'){
                st.pop();
                ans += 1;
            }
            else{
                st.push(c);
            }
        }
        if(s.length() == 1){
            ans = 0;

        }
        return ans;
    }
}