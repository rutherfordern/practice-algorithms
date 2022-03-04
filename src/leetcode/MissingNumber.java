package leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int[] testNums1 = {9, 6, 4, 2, 3, 5, 7, 0, 1, 8, 10, 12};
        int[] testNums2 = {3, 0, 1};

        System.out.println(missingNumberOne(testNums1));
        System.out.println(missingNumberOne(testNums2));

        System.out.println(missingNumberTwo(testNums1));
        System.out.println(missingNumberTwo(testNums2));

    }

    public static int missingNumberOne (int[] nums) {

        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;

        for (int i : nums) {
            sum2 += i;
        }
        return sum - sum2;
    }

    public static int missingNumberTwo (int[] nums) {

        Arrays.sort(nums);

        int expected = 0;

        for (int i = 0; i < nums.length; i++) {
            if (expected != nums[i]) {
                break;
            }
            expected++;
        }
        return expected;
    }
}
