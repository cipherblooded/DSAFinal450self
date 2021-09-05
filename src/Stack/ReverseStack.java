package Stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack);
        stack = reverseStack(stack,stack.size(),0);
        System.out.println(stack);
    }

    private static Stack<Integer> reverseStack(Stack<Integer> stack, int size, int i) {
        if(i==size){
            return stack;
        }
        int temp = stack.pop();
        stack = reverseStack(stack,size,i+1);
        stack = pushAtBottom(stack,temp);
        return stack;
    }

    private static Stack<Integer> pushAtBottom(Stack<Integer> stack, int temp) {
        if(stack.isEmpty()){
            stack.push(temp);
            return stack;
        }
        int val = stack.pop();
        stack = pushAtBottom(stack,temp);
        stack.push(val);
        return stack;

    }


}
