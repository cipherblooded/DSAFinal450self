package Temp;

import java.util.Random;

public class ran {
    public static void main(String[] args) {
        Random random = new Random();

        String uid = Long.toString(random.nextLong());
        System.out.println(uid);

    }
}
