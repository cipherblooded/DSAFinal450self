package _Partation;

public class Partition {

    public static void main(String[] args) {

        partition("abcde", "");

    }

    public static void partition(String unprocessed, String processed) {

        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            String chopped = unprocessed.substring(0, i+1);
            String rem = unprocessed.substring(i+1);
            partition(rem, processed + chopped + "|");
        }

    }

}
