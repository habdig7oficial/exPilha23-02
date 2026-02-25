package ex;

import tad.*;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> clients = new Queue<String>();

        String name = "";
        do {
            name = scanner.nextLine();
            clients.push(name);
        } while (!name.toLowerCase().equals("fim"));


        try {
            while (!clients.isEmpty()) 
                System.out.printf("Atendendo CLiente: %s", clients.pop());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
