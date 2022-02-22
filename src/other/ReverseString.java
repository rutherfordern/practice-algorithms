package other;

public class ReverseString {
    public static void main(String[] args) {

        String example1 = "Hello, my friend! How are you?";
        String example2 = "?uoy era woH !dneirf ym ,olleH";
        String example3 = "Привет! Что делаешь?";

        // Метод 1
        reverseString(example1);
        reverseString(example2);

        // Метод 2
        stringReverse(example3);


    }

    public static void reverseString(String str) {
        char[] array = str.toCharArray();
        String result = "";

        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }

        System.out.println(result);
    }

    public static void stringReverse(String str) {
        String reversedString = new StringBuilder(str).reverse().toString();
        System.out.println(reversedString);
    }
}
