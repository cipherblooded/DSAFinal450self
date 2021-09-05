package Stack_Final450;

import java.util.Arrays;
import java.util.Stack;

public class NSL {
    public static void main(String[] args) {

//        int [] arr = {11,13,21,3};
        int [] arr = {1,3,2,4};
        int [] nsl = nearestSmallerToLeft(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nsl));

    }

    private static int [] nearestSmallerToLeft(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        int [] nsl = new int[arr.length];
        int j=-1;

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty()){
                nsl[++j] = -1;
            }else{
                if(stack.peek()<arr[i]) {
                    nsl[++j] = stack.peek();
                }else {

                    while (!stack.isEmpty()&&arr[i]<=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        nsl[++j]=-1;
                    }else {
                        nsl[++j] = stack.peek();
                    }
                }
            }
            stack.push(arr[i]);
        }
        return nsl;
    }

}


