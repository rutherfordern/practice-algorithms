package codewars.kyu7;

import java.util.Arrays;

public class ReverseWords {
    public static void main(String[] args) {

        String word = "This is example!";

        System.out.println(reverseWords(word));

    }

    public static String reverseWords(String original) {

        // Разбиваем строку на отдельные слова и сохраняем в массив
        String[] arrayWord = original.split(" ");

        if (arrayWord.length == 0) {
            return original;
        }

        int i = 0;
        for (String str : arrayWord){
            arrayWord[i] = new StringBuilder(str).reverse().toString();
            i++;
        }

        String newWord = String.join(" ", arrayWord);

        return newWord;
    }
}
