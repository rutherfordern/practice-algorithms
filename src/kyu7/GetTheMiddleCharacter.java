package kyu7;

public class GetTheMiddleCharacter {
    public static void main(String[] args) {

        String simple = "Java";

        System.out.println(getMiddle(simple));

    }

    public static String getMiddle(String word) {

        int middleChar = word.length() / 2;

        if (word.length() % 2 == 0) {
            return word.substring(middleChar - 1, middleChar + 1);
        } else {
            return Character.toString(word.charAt(middleChar));
        }
    }
}
