package Dynamic_Programming.TwoDimDP.EditDistance;

import java.util.Scanner;

// max height of tree would be w1+w2 complexity 0(3^(w1+w2))

public class EditDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String from = scanner.next();
        String to = scanner.next();

        int minStep = editDistance(from, to, from.length()-1,to.length()-1);
        System.out.println(minStep);

    }

    private static int editDistance(String from, String to, int fromIndex, int toIndex) {

        if(fromIndex==-1){
            return toIndex+1;
        }if(toIndex==-1){
            return fromIndex+1;
        }
        if(from.charAt(fromIndex)==to.charAt(toIndex)){
            return editDistance(from, to, fromIndex-1, toIndex-1);
        }else {
            int a = editDistance(from, to, fromIndex - 1, toIndex);
            int b = editDistance(from, to, fromIndex, toIndex - 1);
            int c = editDistance(from, to, fromIndex - 1, toIndex - 1);
            return Math.min(a, Math.min(b, c)) + 1;
        }
    }
}
