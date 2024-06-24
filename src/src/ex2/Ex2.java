package ex2;

import java.util.Stack;

public class Ex2 {
    public static boolean isBalanced (String input) {

        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                charStack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }

        }
        return charStack.isEmpty();
    }
    public static void main(String[] args) {
        String input1 = "([{}])";
        String input2 = "([{)}]";

        System.out.println("Chuỗi " + input1 + " là " + (isBalanced(input1) ? "đúng" : "sai"));
        System.out.println("Chuỗi " + input2 + " là " + (isBalanced(input2) ? "đúng" : "sai"));
    }
}