package Stack;

import java.util.Stack;

public class SortingStack {
    public static void main(String[] args) {

        Stack <Integer> stack = new Stack<>();
        for (int i = 5; i > 0; i--) {
            stack.push(i);
        }
        System.out.println(stack);
        stack = sortStack(stack,stack.size(),0);
        System.out.println(stack);
    }

    private static Stack<Integer> sortStack(Stack<Integer> stack, int size, int i) {
        if(i==size){
            return stack;
        }
        int temp = stack.pop();
        stack = sortStack(stack,size,i+1);
        stack = insertAtCorrectPosition(stack, temp);
        return stack;
    }

    private static Stack<Integer> insertAtCorrectPosition(Stack<Integer> stack, int temp) {
        if(stack.isEmpty()){
            stack.push(temp);
            return stack;
        }
        if(stack.peek()<temp){
            stack.push(temp);
            return stack;
        }
        int val = stack.pop();
        stack = insertAtCorrectPosition(stack,temp);
        stack.push(val);
        return stack;
    }

}
