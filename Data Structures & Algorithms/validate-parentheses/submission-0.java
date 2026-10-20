class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 

            else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }
}

// GIVEN Input: s = "()"
// if first c is ( we run push(')') so the stack now holds: [ ')' ].
// c now stores the second char in our string in this case )
// we then check the second char and if it hits ) we go to the else as its not ( {} [
// at the else we the pop the element out of the stack so in our case ). 
// if when popping the stack the top element does not equal c, we return false. 
// as no false is triggered the loop returns true.