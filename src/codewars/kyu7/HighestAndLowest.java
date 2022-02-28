package codewars.kyu7;

public class HighestAndLowest {
    public static void main(String[] args) {

        String s1 = "1 2 3 4 5";
        System.out.println(highAndLow(s1));

    }

    public static String highAndLow(String numbers) {

        String[] strArr = numbers.split(" ");

        int[] numArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        int min, max;
        min = max = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }

            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        String newMin = Integer.toString(min);
        String newMax = Integer.toString(max);

        return newMax + " " + newMin;

    }
}
