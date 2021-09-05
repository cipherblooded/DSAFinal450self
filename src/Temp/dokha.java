package Temp;

import java.util.ArrayList;

public class dokha {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        ArrayList<Integer>  list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        addTolist(lists,list);
    }

    private static void addTolist(ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> list) {
        lists.add(list);
        System.out.println(lists);
    }
}
