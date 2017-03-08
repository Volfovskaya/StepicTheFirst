import static java.awt.SystemColor.text;

/**
 * Created by volfovskaya on 03.01.17.
 */
public class Palindrome {
    public static boolean isPalindrome(String text) {
        //String lowerText = text.toLowerCase();
        //String textWithoutSymbol = lowerText.replaceAll("[^a-zA-Z0-9]", "");
        //StringBuilder textWithoutSymbolNew = new StringBuilder(textWithoutSymbol);
        //StringBuilder textPalindrome = new StringBuilder(textWithoutSymbolNew);
        //textPalindrome.reverse();
        //String textPalindromeStr = textPalindrome.toString();
        //String textWithoutSymbolStr = textWithoutSymbolNew.toString();
        //return textPalindromeStr.equals(textWithoutSymbolStr);


        text = text.replaceAll("[^a-zA-Z0-9]", "");
        return text.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam"));
    }
}
