package problems;

import java.util.Stack;

public class ValidParentheses {
    public boolean WithStack(String s){
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                stack.push(s.charAt(i));
            else{
                boolean isValidClose = !stack.isEmpty() && (stack.peek() == '(' && s.charAt(i) == ')' || stack.peek() == '{' && s.charAt(i) == '}' || stack.peek() == '[' && s.charAt(i) == ']');
                if (!isValidClose){
                    return false;
                }
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
