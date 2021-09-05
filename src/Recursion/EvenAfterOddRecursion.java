package Recursion;

public class EvenAfterOddRecursion {
    public static void main(String[] args) {

        int n = 10;
        printEvenAfterOdd(n);
    }

    private static void printEvenAfterOdd(int n) {
        if(n==0){
            return;
        }
        if(n%2==1){
            System.out.print(n+" ");
        }
        printEvenAfterOdd(n-1);
        if(n%2==0){
            System.out.print(n+" ");
        }
    }
}
