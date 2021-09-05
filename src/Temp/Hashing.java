package Temp;
import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int element = scanner.nextInt();
            System.out.println(firstOccurance(arr,element)+" "+lastOccurance(arr,element));
        }

    }

    private static int lastOccurance(int[] arr, int element) {
        for (int i = arr.length-1; i >= 0  ; i--) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }

    private static int firstOccurance(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
