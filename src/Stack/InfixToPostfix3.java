package Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix3 {

    public static void main(String[] args) {
//        String infixExpression = "a+b*(ch^d-e)^(f+g*h)-i";
        String infixExpression = "(5+2)-10*(100/10)";
        ArrayList<String> postfixExpression = infixToPostfix(infixExpression);
        System.out.println(postfixExpression);
        Integer ans = postfixExpressionEvaluation(postfixExpression);
        System.out.println(ans);
    }

    private static ArrayList<String> infixToPostfix(String infixExpression) {

        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('^',3);
        hashMap.put('/',2);
        hashMap.put('*',2);
        hashMap.put('+',1);
        hashMap.put('-',1);

        ArrayList<String> postfixExpression = new ArrayList<>();
        String val = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<infixExpression.length(); ++i)
        {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                val = val + ch;
            }else{
                if(!val.isEmpty()) {
                    postfixExpression.add(val);
                    val = "";
                }
                if (ch == '(') {
                    stack.push(ch);
                }
                else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        postfixExpression.add(stack.pop()+"");
                    }
                    stack.pop();
                }
                else {
                    while (!stack.isEmpty()&& stack.peek()!='(' && hashMap.get(ch) <= hashMap.get(stack.peek())){
                        postfixExpression.add(stack.pop()+"");
                    }
                    stack.push(ch);
                }
            }

        }

        while (!stack.isEmpty()){
            postfixExpression.add(stack.pop()+"");
        }

        return postfixExpression;
    }

    private static Integer postfixExpressionEvaluation(ArrayList<String> postfixExpression) {
        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.size(); i++) {
//            System.out.println(postfixExpression.get(i));
            if(postfixExpression.get(i).equals("+")||
                    postfixExpression.get(i).equals("-")||
                    postfixExpression.get(i).equals("/")||
                    postfixExpression.get(i).equals("*")||
                    postfixExpression.get(i).equals("^")){

                int var2 = stack.pop();
                int var1 = stack.pop();
                if(postfixExpression.get(i).equals("+")){
                    stack.push(var1+var2);
                }else if(postfixExpression.get(i).equals("-")){
                    stack.push(var1-var2);
                }else if(postfixExpression.get(i).equals("/")){
                    stack.push(var1/var2);
                }else if(postfixExpression.get(i).equals("*")){
                    stack.push(var1*var2);
                }else {
                    stack.push((int)Math.pow(var1,var2));
                }
            }else {
                stack.push(Integer.parseInt(postfixExpression.get(i)));
            }
        }
        return stack.pop();
    }


}


