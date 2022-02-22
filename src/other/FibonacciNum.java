package other;

import java.util.Arrays;

public class FibonacciNum {
    public static void main(String[] args) {

        // Находим числа Фибоначчи с помощью цикла for
        System.out.println(calculateNFibWithFor(25));

        // Находим числа Фибоначчи с помощью массива
        System.out.println(Arrays.toString(calculateFibWithArray(10)));

        // Находим числа Фибоначчи с помощью рекурсии
        System.out.println(calculateNFibWithRecursive(25));


    }

    public static long calculateNFibWithFor(int n) {

        long first = 0;
        long second = 1;
        long result = n;

        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public static long calculateNFibWithRecursive(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculateNFibWithRecursive(n - 1) + calculateNFibWithRecursive(n - 2);
        }
    }

    public static long[] calculateFibWithArray(int n) {

        long[] array = new long[n];

        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }

}
