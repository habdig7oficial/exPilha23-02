package ex;


import tad.*;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> par = new Stack<Integer>();
        try {
            par.push(22);
            par.push(24);
            System.err.println(par.peak());
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
