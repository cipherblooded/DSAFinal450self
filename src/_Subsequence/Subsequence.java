package _Subsequence;

public class Subsequence {

    public static void main(String[] args) {

        int []arr = {1,2,3};
        boolean []isUsed = new boolean[arr.length];
        arraySubsequence(arr,0,"");

        System.out.println("--------------------");
        String s = "123";
        stringSubsequence(s,"");

    }

    private static void stringSubsequence(String unprocessed, String processed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        stringSubsequence(unprocessed,processed+ch);
        stringSubsequence(unprocessed,processed);
    }

    private static void arraySubsequence(int[] arr,int index, String ans) {

        if(index==arr.length){
            System.out.println(ans);
            return;
        }
        arraySubsequence(arr,index+1,ans+arr[index]+",");
        arraySubsequence(arr,index+1,ans);

    }
    
}
