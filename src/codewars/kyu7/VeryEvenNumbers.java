package codewars.kyu7;

public class VeryEvenNumbers {
    public static void main(String[] args) {

        int total = 123; //This is the number we want to split
        Integer totalInt = new Integer(total);
        String strSum = totalInt.toString();
        String nums[] = strSum.split("");

        if (nums.length == 1) {
            for(String str : nums){
                if (Integer.parseInt(str) % 2 == 0){
                    System.out.println("false");
                }
            }
        }

        for( int i = 0; i < nums.length; i++ ) {
            if (nums.length == 1) {
                if (Integer.parseInt(nums[i]) % 2 == 0){
                    System.out.println("false");
                }

            }
        }

    }

    /*
    public static boolean isVeryEvenNumber(int number) {
        Integer totalInt = number;
        String strSum = totalInt.toString();
        String nums[] = strSum.split("");

        for( int i = 0; i < nums.length; i++ ) {
            System.out.println(nums[i]);
            // Or if you want int from it, then
            System.out.println(Integer.parseInt(nums[i]));
        }
    }

     */

}
