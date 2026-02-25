package ex;

import tad.*;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> clients = new Queue<String>();

        String name = "";
        while (true){
            System.out.printf(">> ");
            name = scanner.nextLine();
            if (name.toLowerCase().equals("end"))
                break;
            else 
                clients.push(name);
        } 

        try {
            while (!clients.isEmpty()) 
                System.out.printf("Atendendo CLiente: %s\n", clients.pop());
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
