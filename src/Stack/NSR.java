package Stack_Final450;

import java.util.Arrays;
import java.util.Stack;

public class NSR {

    public static void main(String[] args) {

        int [] arr = {11,13,21,3};
//        int [] arr = {1,3,2,4};
        int [] nsr = nearestSmallerToRight(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nsr));

    }

    private static int [] nearestSmallerToRight(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        int [] nsr = new int[arr.length];
        int j=arr.length;

        for (int i = arr.length-1 ; i >=0 ; i--) {

            if (stack.isEmpty()){
                nsr[--j] = -1;
            }else{
                if(stack.peek()<arr[i]) {
                    nsr[--j] = stack.peek();
                }else {

                    while (!stack.isEmpty()&&arr[i]<=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        nsr[--j]=-1;
                    }else {
                        nsr[--j] = stack.peek();
                    }
                }
            }
            stack.push(arr[i]);
        }
        return nsr;
    }

}

