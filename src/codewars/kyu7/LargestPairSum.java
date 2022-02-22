package codewars.kyu7;

import java.util.Arrays;

public class LargestPairSum {
    public static void main(String[] args) {

        int[] numbers = {4, 65, 342, 123, -5, 24, 1200};

        System.out.println(largestPairSum(numbers));
    }

    public static int largestPairSum(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}
