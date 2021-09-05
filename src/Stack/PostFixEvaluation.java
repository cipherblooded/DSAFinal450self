package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class PostFixEvaluation {
    public static void main(String[] args) {

        ArrayList <String> postfixExpression = new ArrayList<>();
        postfixExpression.add("4");
        postfixExpression.add("6");
        postfixExpression.add("+");
        postfixExpression.add("2");
        postfixExpression.add("/");
        postfixExpression.add("5");
        postfixExpression.add("*");
        postfixExpression.add("7");
        postfixExpression.add("+");

        Stack <Integer> stack = new Stack<>();

        for (int i = 0; i < postfixExpression.size(); i++) {
//            System.out.println(postfixExpression.get(i));
            if(postfixExpression.get(i).equals("+")||
                    postfixExpression.get(i).equals("-")||
                    postfixExpression.get(i).equals("/")||
                    postfixExpression.get(i).equals("*")||
                    postfixExpression.get(i).equals("^")){

                int var1 = stack.pop();
                int var2 = stack.pop();
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
        System.out.println(stack.pop());
    }
}
