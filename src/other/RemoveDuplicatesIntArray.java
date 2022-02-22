package other;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesIntArray {
    public static void main(String[] args) {

        Solution r = new Solution();

        int[] arrayNum = {1, 4, 3, 3, 6, 7, 6, 4, 154, 8, 15, 154};

        r.singleNumber(arrayNum);


    }


}

class Solution {
    private int[] sortArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tos = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tos;
                }
            }
        }
        return arr;
    }
    private int countNotNullElements(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                count++;
            }
        }
        return count;
    }
    public void singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    nums[j] = 0;
                }
            }
        }
        sortArrays(nums);
        int size = countNotNullElements(nums);
        int Array[] = new int[size];
        for (int i = 0; i < size; i++) {
            Array[i] = nums[i];
            System.out.println(Array[i]);
        }
    }
}
