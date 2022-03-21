package stack;

import java.util.Stack;

public class Parenthesis {

    static Boolean isBalanced(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            Character current_char = str.charAt(i);
            if (current_char == '(' || current_char == '{' || current_char == '[') {
                stack.push(current_char);
            } else {
                if (stack.isEmpty())
                    return false;

                Character top = stack.peek();
                if (matchBracket(top, str.charAt(i)) == false)
                    return false;

                stack.pop();
            }
        }

        return stack.isEmpty() == true;
    }

    static Boolean matchBracket(char b1, char b2) {
        return ((b1 == '(' && b2 == ')') || (b1 == '{' && b2 == '}') || (b1 == '[' && b2 == ']'));
    }

    public static void main(String[] args) {

        String str1 = "({[]})";
        // yes

        String str2 = "((())";
        // no

        String str3 = "([)]";
        // no

        String str4 = "{}([()])";
        // yes

        String str5 = "(()))";
        // no

        System.out.println(isBalanced(str4));
    }
}
