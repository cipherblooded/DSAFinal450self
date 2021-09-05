package _Permutation;
public class Permutation {

    public static void main(String[] args) {

        String processed, unprocessed;
        int []arr;
        int index = 0;

        System.out.println("---------------------");
        processed = "";
        unprocessed = "abc";
        stringPermutation(unprocessed, processed);


        System.out.println("---------------------");
        processed = "";
        unprocessed = "122";
        stringPermutationRepeated(unprocessed, processed);


        System.out.println("---------------------");
        arr = new int[]{1,2,3};
        index = 0;
        arrayPermutation(arr,index,new boolean[arr.length], processed);


        System.out.println("---------------------");
        arr = new int[]{1,2,2};
        index = 0;
        arrayPermutationRepeated(arr,index, new boolean[arr.length], processed);

        System.out.println("---------------------");

    }

    private static void stringPermutation(String unprocessed, String processed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i < unprocessed.length(); i++) {
            String rem1 = unprocessed.substring(0,i);
            char ch = unprocessed.charAt(i);
            String rem2 = unprocessed.substring(i+1);
            stringPermutation(rem1+rem2,processed+ch);
        }

    }
    public static void stringPermutationRepeated(String unprocessed, String processed) {

        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
		for(int i = 0;i<unprocessed.length();i++) {
			if(i>0 && unprocessed.charAt(i)==unprocessed.charAt(i-1)) {
				continue;
			}
            String rem1 = unprocessed.substring(0,i);
            char ch = unprocessed.charAt(i);
            String rem2 = unprocessed.substring(i+1);
            stringPermutationRepeated(rem1+rem2,processed+ch);
		}

	}

    private static void arrayPermutation(int[] arr, int index, boolean[] used, String processed) {

        if(index==arr.length){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!used[i]) {
                used[i] = true;
                arrayPermutation(arr, index + 1, used, processed + arr[i]);
                used[i] = false;
            }
        }

    }
    public static void arrayPermutationRepeated(int[]  arr, int index, boolean[] used, String ans) {

        if(arr.length==ans.length()) {
			System.out.println(ans);
            return;
        }

        for(int i=0;i<arr.length;i++) {
            if(i > 0&&arr[i]==arr[i-1]&&!used[i-1]) {
                continue;
            }
            if(!used[i]) {
                used[i]=true;
                arrayPermutationRepeated(arr, index+1, used, ans+arr[i]);
                used[i]=false;
            }
        }

    }

}
