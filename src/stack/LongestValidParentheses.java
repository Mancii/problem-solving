package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1); // base for length calculation

        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();

                if (stack.isEmpty()) {
                    stack.push(i); // new base
                } else {
                    int currentLen = i - stack.peek();
                    maxLen = Math.max(maxLen, currentLen);
                }
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        LongestValidParentheses solver = new LongestValidParentheses();
        System.out.println(solver.longestValidParentheses("(()())"));
        System.out.println(solver.longestValidParentheses(")()())"));
        System.out.println(solver.longestValidParentheses("()(()"));
    }
}
