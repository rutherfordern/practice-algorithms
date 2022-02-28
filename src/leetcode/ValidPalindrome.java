package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = ".a";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));

    }

    public static boolean isPalindrome(String s) {

        // l - left, r - right
        // Идем с двух сторон - с начала (l) и с конца (r)
        for (int l = 0, r = s.length() - 1; l < r; l++, r--) {

            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

        }
        return true;

    }

}
