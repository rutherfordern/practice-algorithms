package sortings;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] nums = {10, 3, 53, 2, 5, 7, 3, 6, 12, 3, 32, 65};

        getBubbleSort(nums);

        System.out.println(Arrays.toString(nums));


    }

    public static int[] getBubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { // внешний цикл от 11 до 1
            for (int j = 0; j < i; j++) { // внутренний цикл, от 0 до 10
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }

            }

        }
        return array;
    }
}
