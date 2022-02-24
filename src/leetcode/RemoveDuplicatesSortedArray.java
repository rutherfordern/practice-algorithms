package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = {1, 1, 2};

        System.out.println(removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicatesTwo(nums3));
        System.out.println(Arrays.toString(nums3));

    }

    public static int removeDuplicates(int[] nums) {

        int count = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[count] = nums[i + 1];
                count++;
            }
        }
        return count;
    }

    public static int removeDuplicatesTwo(int[] nums) {

        int currentpos = 0;
        int currentNum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] != currentNum){
                nums[currentpos++] = nums[i];
                currentNum = nums[i];
            }

        }
        return currentpos;
    }
}
