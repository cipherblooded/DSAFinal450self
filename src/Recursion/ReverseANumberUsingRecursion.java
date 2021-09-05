package Recursion;

public class ReverseANumberUsingRecursion {

    public static void main(String[] args) {

        int n = 12342;

        int number = reverseANumber(n, 0);
        System.out.println(number);

    }

    private static int reverseANumber(int n, int number) {

        if(n==0){
            return number;
        }
        number = (number*10)+n%10;
        return reverseANumber(n/10,number);

    }
}
