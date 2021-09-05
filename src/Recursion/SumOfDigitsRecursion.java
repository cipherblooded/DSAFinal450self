package Recursion;

public class SumOfDigitsRecursion {

    public static void main(String[] args) {
        int n = 12345;

        int sum = sumOfDigits(n, 0);
        System.out.println(sum);
    }

    private static int sumOfDigits(int n,int sum) {
        if(n==0){
            return sum;
        }
        sum = sum+(n%10);
        return sumOfDigits(n/10,sum);
    }
}
