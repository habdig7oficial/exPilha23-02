package ex;

import tad.*;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new Queue<Integer>();

        for (int i = 0; i < 5; i++) {
            System.out.printf(">> ");
            queue.push(scanner.nextInt());
        }
        System.out.println(queue.toString());
        try {
            queue.pop();
            queue.pop();
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(queue.toString());

    }
}
