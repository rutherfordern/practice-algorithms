package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {

        fizzBuzz(15);

    }

    public static void fizzBuzz(int n) {

        List<String> word = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                word.add("FizzBuzz");
            } else if (i % 3 == 0){
                word.add("Fizz");
            } else if (i % 5 == 0){
                word.add("Buzz");
            } else {
                word.add(Integer.toString(i));
            }
        }

        System.out.println(word);

    }
 }
