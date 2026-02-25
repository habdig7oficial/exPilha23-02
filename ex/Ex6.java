package ex;

import tad.*;

public class Ex6 {
    public static void main(String[] args) {
        Queue<String> qstr = new Queue<String>();
        
        qstr.push("Hallo");
        qstr.push("Welt");

        try {
            System.out.printf("First element: %s, Size: %d\n", qstr.peak(), qstr.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Queue<Integer> qint = new Queue<Integer>(); 
        qint.push(2);
        try {
            System.out.printf("First element: %d, Size: %d\n", qint.peak(), qint.length());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Queue<Double> qdouble = new Queue<Double>();

        qdouble.push(1.2345);
        try {
            System.out.printf("First element: %f, Size: %d\n", qdouble.peak(), qdouble.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
