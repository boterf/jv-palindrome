package core.basesyntax;

public class Palindrome {
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^\\w]", "").toLowerCase();
        StringBuilder result = new StringBuilder(text);
        result = result.reverse();
        return result.toString().equals(text);
    }
}
