package ex;

import tad.Stack;

public class Ex4 {

    public static void test(String test) {
        System.out.printf("Test result: %s\n", match(test));
        System.out.println(test);
    }

    public static boolean match(String str){
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') 
                stack.push('(');
            else if (str.charAt(i) == ')') {
                try {
                    stack.pop();
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
    /* This common lisp code actually works and I would prefer to write in Lisp than Java :) */
    String code = "(loop for i from 0 to 10 do (print (format nil \"~a is ~a\" i (if (= (mod i 2) 0) \"even\" \"odd\"))))";
    
    test(code);

    String t1 = "( ) ) ) ) ( ) ) ( (";
    test(t1);

    String t2 = "( ( ) ( ( ) ) )";
    test(t2);
   } 

}
