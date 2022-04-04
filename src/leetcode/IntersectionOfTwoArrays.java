package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result1 = new ArrayList<>();

        for (int i = 0, j = 0; i < nums1.length && j < nums2.length;) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] == nums2[j]) {
                result1.add(nums1[i]);
                i++;
                j++;
            } else {
                j++;
            }
        }

        int[] result2 = new int[result1.size()];
        for(int i = 0; i < result1.size(); i++){
            result2[i] = result1.get(i);
        }
        return result2;

    }
}
