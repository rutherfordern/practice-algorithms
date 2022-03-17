package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};

        rotate1(nums, 3);

        System.out.println(Arrays.toString(nums));

    }

    public static void rotate1 (int[] nums, int k) {

        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public static void rotate2 (int[] nums, int k) {

        int[] newSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = (i + k) % nums.length;
            newSums[j] = nums[i];
        }

        for (int i = 0; i < nums.length; i ++) {
            nums[i] = newSums[i];
        }

    }
}
