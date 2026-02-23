package ex;


import java.util.Scanner;

import tad.*;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> even = new Stack<Integer>();
        Stack<Integer> odd = new Stack<Integer>();
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf(">> ");
            int number = scanner.nextInt();

            if(number % 2 == 0)
                even.push(number);
            else    
                odd.push(number);
        }

        try {
            System.out.println("Even numbers: ");
            while (!even.isEmpty()) 
                System.out.printf("%d ", even.pop());

            System.out.println("\nOdd numbers: ");
            while (!odd.isEmpty()) 
                System.out.printf("%d ", odd.pop());
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        
        scanner.close();
    }
}
