package ex1;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Stack<String> textStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng từ cần nhập: ");
        int numWords = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numWords; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            textStack.push(word);
        }


        System.out.println("Các từ trong stack:");
        while (!textStack.isEmpty()) {
            System.out.println(textStack.pop());
            System.out.println(textStack.size() + " size");
        }

    }
}