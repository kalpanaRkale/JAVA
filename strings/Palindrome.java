public class Palindrome {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str)); // true
        System.out.println(isPalindrome("java")); // false
        System.out.println(isPalindrome("noon")); // true
    }
}
//Time Complexity - O(n)
//Space Complexity - O(1)
