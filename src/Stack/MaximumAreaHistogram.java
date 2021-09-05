package Stack_Final450;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MaximumAreaHistogram {

    public static void main(String[] args) {
        
        int [] arr = {6, 2, 5, 4, 5, 1, 6};
        System.out.println(Arrays.toString(arr));

        int maxArea = mah(arr);
        System.out.println("Maximum Area Histogram is: "+maxArea);

    }

    private static int mah(int[] arr) {
        // NSR
        int [] nsrIndex = nearestSmallerToRight(arr);
//        System.out.println("NSR Index :"+Arrays.toString(nsrIndex));

        // NSL
        int [] nslIndex = nearestSmallerToLeft(arr);
//        System.out.println("NSL Index :"+Arrays.toString(nslIndex));

        // Width
        int [] width = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            width[i] = nsrIndex[i] - nslIndex[i] - 1;
        }
//        System.out.println("Width "+Arrays.toString(width));

        // Area
        int [] area = new int[arr.length];
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            area[i] = arr[i] * width[i];
            if(maxArea<area[i]){
                maxArea = area[i];
            }
        }
        return maxArea;

    }

    private static int [] nearestSmallerToRight(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<>();

        int [] nsrIndex = new int[arr.length];
        int j = arr.length;

        for (int i = arr.length-1 ; i >=0 ; i--) {

            if (stack.isEmpty()){
                nsrIndex[--j] = arr.length;
            }else{
                if(stack.peek()<arr[i]) {
                    nsrIndex[--j] = map.get(stack.peek());
                }else {

                    while (!stack.isEmpty()&&arr[i]<=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        nsrIndex[--j]= arr.length;
                    }else {
                        nsrIndex[--j] = map.get(stack.peek());
                    }
                }
            }
            map.put(arr[i],i);
            stack.push(arr[i]);
        }
        return nsrIndex;
    }

    private static int [] nearestSmallerToLeft(int[] arr) {

        Stack<Integer> stack = new Stack<Integer>();
        Map<Integer,Integer> map = new HashMap<>();

        int [] nslIndex = new int[arr.length];
        int j=-1;

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty()){
                nslIndex[++j] = -1;
            }else{
                if(stack.peek()<arr[i]) {
                    nslIndex[++j] = map.get(stack.peek());
                }else {

                    while (!stack.isEmpty()&&arr[i]<=stack.peek()){
                        stack.pop();
                    }
                    if (stack.isEmpty()){
                        nslIndex[++j]=-1;
                    }else {
                        nslIndex[++j] = map.get(stack.peek());
                    }
                }
            }
            map.put(arr[i], i);
            stack.push(arr[i]);
        }
        return nslIndex;
    }

}
