package _Partation;

import java.util.ArrayList;
import java.util.Scanner;

public class CodeOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList = codeOfStrings(s, "", arrayList);
        System.out.println(arrayList);
    }

    public static ArrayList<String> codeOfStrings(String unprocessed, String ans, ArrayList<String> arrayList) {

        if (unprocessed.isEmpty()) {
            arrayList.add(ans);
            return arrayList;
        }
        
        for (int i = 1; i <= unprocessed.length(); i++) {
            String chopped = unprocessed.substring(0, i);
            int value = Integer.parseInt(chopped);
            String rem = unprocessed.substring(i);

            if(value>=1&&value<=26) {
                arrayList = codeOfStrings(rem, ans+(char)(value+96), arrayList);
            }else {
                break;
            }
        }
        return arrayList;
    }
}

