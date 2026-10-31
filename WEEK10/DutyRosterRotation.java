package WEEK10;

import java.util.Arrays;

public class DutyRosterRotation {

    public static String[] rotateRoster(String[] names, int k) {
        if (names == null || names.length == 0) {
            return new String[0];
        }

        int n = names.length;
        k = k % n;

        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            result[newIndex] = names[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names1 = { "A", "B", "C", "D", "E" };
        int k1 = 2;
        System.out.println(Arrays.toString(rotateRoster(names1, k1)));
        String[] names2 = { "A", "B", "C", "D", "E" };
        int k2 = 7;
        System.out.println(Arrays.toString(rotateRoster(names2, k2)));
    }
}