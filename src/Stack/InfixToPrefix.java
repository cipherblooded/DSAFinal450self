package Stack;
import java.util.HashMap;
import java.util.Stack;

public class InfixToPrefix {

    public static void main(String[] args) {

        String infixExpression = "a+b*(ch^d-e)^(f+g*h)-i";
//        String infixExpression = "((a+b)-c*(d/e))";

        String reverseInfixExpression = reverse(infixExpression);
        StringBuilder postfixExpression = infixToPostfix(reverseInfixExpression);

        StringBuilder prefixExpression = new StringBuilder("");

        for (int i = postfixExpression.length()-1; i >= 0 ; i--) {
            prefixExpression.append(postfixExpression.charAt(i));
        }
        System.out.println(prefixExpression);

    }

    private static String reverse(String infixExpression) {

        String reverseInfixExpression = "";

        for (int i = infixExpression.length()-1; i >=0 ; i--) {

            char ch = infixExpression.charAt(i);
            if(ch=='('){
                reverseInfixExpression = reverseInfixExpression+')';
            }else if(ch==')'){
                reverseInfixExpression = reverseInfixExpression+'(';
            }else {
                reverseInfixExpression = reverseInfixExpression+ch;
            }
        }
        return reverseInfixExpression;
    }

    private static StringBuilder infixToPostfix(String reverseInfixExpression) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('^',3);
        hashMap.put('/',2);
        hashMap.put('*',2);
        hashMap.put('+',1);
        hashMap.put('-',1);

        // initializing empty String for result
        StringBuilder postfixExpression = new StringBuilder("");

        // initializing empty stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<reverseInfixExpression.length(); ++i)
        {
            char ch = reverseInfixExpression.charAt(i);

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
