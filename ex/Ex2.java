package ex;

import java.util.Scanner;
import tad.*;

public class Ex2 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringBuilder copy = new StringBuilder(str);


        while (copy.length() != 0) {
            stack.push(copy.charAt(0));
            copy.deleteCharAt(0);
        }
        copy = new StringBuilder();

        try {
            while (!stack.isEmpty())
                copy.append(stack.pop());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        
        if (copy.toString().toLowerCase().equals(str.toLowerCase())) {
            System.out.println("Word is palimdrome");
        } else {
            System.out.println("Word isn't palimdrome");
        }
        
        System.out.println(copy);
        scanner.close();
    }
}
