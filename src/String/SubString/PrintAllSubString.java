package String.SubString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class PrintAllSubString {

    public static void main(String[] args) {

        ArrayList<String> allSubString = new ArrayList<>();
        ArrayList<String> uniqueSubString = new ArrayList<>();
        HashSet<String> hashSet = new HashSet<>();

        String s = "banana";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {

                String subString = s.substring(i,j);
                allSubString.add(subString);

                if(!hashSet.contains(subString)){
                    hashSet.add(subString);
                    uniqueSubString.add(subString);
                }

            }
        }
        System.out.println(allSubString);
        System.out.println(uniqueSubString);

        // SortedSubString
        Collections.sort(allSubString);
        System.out.println(allSubString);

        ArrayList<String> allSubString2 = new ArrayList<>(hashSet);
        System.out.println(allSubString2);
    }
}
