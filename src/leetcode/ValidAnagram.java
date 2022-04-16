package leetcode;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        String newWord1 = new String (array1);
        String newWord2 = new String (array2);

        return newWord1.equals(newWord2);

    }
}
