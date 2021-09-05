package Stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {

    public static void main(String[] args) {
//        String infixExpression = "a+b*(ch^d-e)^(f+g*h)-i";
        String infixExpression = "((a+b)-c*(d/e))";
        StringBuilder postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
    }

    private static StringBuilder infixToPostfix(String infixExpression) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('^',3);
        hashMap.put('/',2);
        hashMap.put('*',2);
        hashMap.put('+',1);
        hashMap.put('-',1);

        StringBuilder postfixExpression = new StringBuilder("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<infixExpression.length(); ++i)
        {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfixExpression.append(ch);
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty()&& stack.peek()!='(' && hashMap.get(ch) <= hashMap.get(stack.peek())){
                    postfixExpression.append(stack.pop());
                }
                stack.push(ch);
            }

        }

        while (!stack.isEmpty()){
            postfixExpression.append(stack.pop());
        }

        return postfixExpression;
    }

}
