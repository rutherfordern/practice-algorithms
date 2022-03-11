package codewars.kyu6;

public class YourOrderPlease {
    public static void main(String[] args) {

        String s1 = "is2 Thi1s T4est 3a";
        System.out.println(order(s1));

    }

    public static String order(String words) {

        String[] arr = words.split(" ");
        StringBuilder result = new StringBuilder("");

        for (int i = 0; i < 10; i++) {
            for (String s : arr) {
                if (s.contains(String.valueOf(i))) {
                    result.append(s + " ");
                }
            }
        }
        return result.toString().trim();
    }
}
