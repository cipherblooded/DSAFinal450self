package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class InbuiltSortingForArrayList {
    public static void main(String[] args) {

        ArrayList <Integer> arrayListInteger = new ArrayList<>();
        arrayListInteger.add(5);
        arrayListInteger.add(3);
        arrayListInteger.add(1);
        arrayListInteger.add(4);
        arrayListInteger.add(2);
        Collections.sort(arrayListInteger);
        System.out.println(arrayListInteger);

        ArrayList<String> arrayListString = new ArrayList<>();
        arrayListString.add("apple");
        arrayListString.add("app");
        arrayListString.add("cat");
        arrayListString.add("bat");
        arrayListString.add("batman");
        Collections.sort(arrayListString);
        System.out.println(arrayListString);

    }
}
