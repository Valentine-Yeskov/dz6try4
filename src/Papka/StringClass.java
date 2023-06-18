package Papka;
import java.util.Locale;
import java.util.Objects;

public class StringClass {
    public static String findSymbolOccurrence(String string, char symbol) {
        int j = 0;
        char[] arr = string.toLowerCase(Locale.ROOT).toCharArray();
        for (char c : arr) {
            if (c == symbol) {
                j++;
            }
        }
        return String.valueOf(j);
    }
    public static String findWordPosition(String target, String source) {
        if (source.contains(target)) {
            return String.valueOf(source.indexOf(target));
        } else {
            return "-1";
        }
    }
    public static String stringReverse(String revers) {
        StringBuilder builder = new StringBuilder(revers);
        return String.valueOf(builder.reverse());
    }
    public static String arePalindrome(String supposedPalindrome) {
        if (Objects.equals(supposedPalindrome, stringReverse(supposedPalindrome))) {
            return String.valueOf(true);
        } else {
            return String.valueOf(false);
        }
    }


}


