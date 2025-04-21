/*Valid Parentheses
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                System.out.println("s[i]="+s.charAt(i)+" i="+i);
                st.push(s.charAt(i));
            }
            else{
                System.out.println("s[i]="+s.charAt(i)+" i="+i+" st.peek()="+st.peek());
                if(st.peek()=='[' && s.charAt(i)==']'||
                st.peek()=='(' && s.charAt(i)==')'||st.peek()=='{' && s.charAt(i)=='}')
                {
                    st.pop();
                }
                else{
                    
                    st.push(s.charAt(i));
                }
            }
        }
         //System.out.println(" st.peek()="+st.peek());
        return st.isEmpty();
    }
}
