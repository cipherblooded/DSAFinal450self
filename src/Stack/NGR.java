package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NGR {

    public static void main(String[] args) {

//        int [] arr = {11,13,21,3};
        int [] arr = {1,3,2,4};
        int [] ngr = nearestGreaterToRight(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ngr));

    }

    private static int [] nearestGreaterToRight(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();

        int []ngr = new int[arr.length];
        int j = arr.length;

        for (int i = arr.length-1 ; i >=0 ; i--) {

            if (stack.isEmpty()){
                ngr[--j] = -1;
            }else{
                if(stack.peek()>arr[i]) {
                    ngr[--j] = stack.peek();
                }else {

                    while (!stack.isEmpty()&&arr[i]>=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        ngr[--j]=-1;
                    }else {
                        ngr[--j] = stack.peek();
                    }
                }
            }
            stack.push(arr[i]);
        }
        return ngr;
    }

}
