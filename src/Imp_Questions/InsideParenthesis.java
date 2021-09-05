package Imp_Questions;

import java.util.Scanner;
import java.util.Stack;

public class InsideParenthesis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        inside(s,0, new Stack<Character>());
    }

    private static void inside(String s, int index, Stack stack) {
        if(index==s.length()){
            System.out.println(stack);
            if(stack.isEmpty()){
                System.out.println(true);
            }else {
                System.out.println(false);
            }
            return;
        }
        if(s.charAt(index)=='['||s.charAt(index)=='{'||s.charAt(index)=='('){
            stack.push(s.charAt(index));
        }
        if(s.charAt(index)==']'||s.charAt(index)=='}'||s.charAt(index)==')'){

            if(s.charAt(index)==']'&&(char)stack.peek()=='['){
                stack.pop();
            }
            if(s.charAt(index)=='}'&&(char)stack.peek()=='{'){
                stack.pop();
            }
            if(s.charAt(index)==')'&&(char)stack.peek()=='('){
                stack.pop();
            }
        }
        inside(s, index+1, stack);
    }
}
