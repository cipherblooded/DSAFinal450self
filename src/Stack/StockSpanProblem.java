package Stack_Final450;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StockSpanProblem {

    public static void main(String[] args) {

        int [] stockPrice = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stockPrice));

        int [] nglIndex = nearestGreaterToLeft(stockPrice);
        System.out.println(Arrays.toString(nglIndex));

        int [] stockSpan = new int[stockPrice.length];
        for (int i = 0; i < nglIndex.length; i++) {
            stockSpan[i] = i - nglIndex[i];
        }
        System.out.println(Arrays.toString(stockSpan));

    }

    private static int [] nearestGreaterToLeft(int[] stockPrice) {

        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer, Integer> map = new HashMap<>();

        int []brr = new int[stockPrice.length];
        int j=-1;

        for (int i = 0; i < stockPrice.length; i++) {

            if (stack.isEmpty()){
                brr[++j]=-1;
            }else{

                if(stack.peek()>stockPrice[i]) {
                    brr[++j] = map.get(stack.peek());
                }else {
                    while (!stack.isEmpty()&&stockPrice[i]>=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        brr[++j]=-1;
                    }else {
                        brr[++j] = map.get(stack.peek());
                    }
                }

            }
            map.put(stockPrice[i],i);
            stack.push(stockPrice[i]);
        }
        return brr;
    }
}
