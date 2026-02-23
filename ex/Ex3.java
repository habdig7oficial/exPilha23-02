package ex;

import java.util.Scanner;
import tad.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tokens = "";

        do {
            tokens += scanner.next() + "\n";
        } while (tokens.charAt(tokens.length() - 2) != '.');

        System.out.println("\n>tokens: ");

        System.out.println(tokens);

        
        String[] arr = tokens.split("\\s+");
        arr[arr.length - 1] = arr[arr.length - 1].substring(0, arr[arr.length - 1].length() - 1);
        Stack<String> stack = new Stack<String>();

        for (String subStr : arr) 
            stack.push(subStr);
        
        System.out.println("\nSub String: ");

        try {
            System.out.printf("Output:");
            while (!stack.isEmpty())
                System.out.printf(" %s", stack.pop());
            System.out.printf(".");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }
}
