package Arrays;

import java.util.Scanner;

public class NextPermutation {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder("");
        int t=sc.nextInt();

        for(int j=0;j<t;j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            next(arr);
            for (int i = 0; i < arr.length; i++) {
                stringBuilder.append(arr[i]).append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder);
        
    }
    public static void next(int[] arr){
        
        int index = -1;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            rev(arr,0, arr.length-1);
        }else{
            int prev = index;
            for(int i=arr.length-1;i>=index;i--){
                if(arr[i]>arr[index-1]){
                    prev=i;
                    break;
                }
            }
            int temp=arr[index-1];
            arr[index-1]=arr[prev];
            arr[prev]=temp;
            rev(arr,index,arr.length-1);

        }
        
    }
    public static void rev(int[] arr,int i,int j){
        
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}
