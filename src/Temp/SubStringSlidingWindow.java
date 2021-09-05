package Temp;

import java.util.ArrayList;

public class SubStringSlidingWindow {
    public static void main(String[] args) {
        String s = "banana";
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            stringBuilder.setLength(0);
            for (int j = i; j < s.length(); j++) {
                stringBuilder.append(s.charAt(j));
                arrayList.add(stringBuilder.toString());
            }
        }
        System.out.println(arrayList);
    }
}
