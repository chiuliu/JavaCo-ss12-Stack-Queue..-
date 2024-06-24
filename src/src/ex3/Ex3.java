package ex3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex3 {
    public static boolean isPalindrome(String input) {
        // Loại bỏ khoảng trắng và chuyển về chữ thường
        input = input.replaceAll("\\s", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
            queue.offer(c);
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "Able was I ere I saw Elba";
        String input2 = "Hello, world!";

        System.out.println("Chuỗi \"" + input1 + "\" là palindrome: " + isPalindrome(input1));
        System.out.println("Chuỗi \"" + input2 + "\" là palindrome: " + isPalindrome(input2));
    }
}