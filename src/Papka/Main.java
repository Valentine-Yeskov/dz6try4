package Papka;
import static Papka.WordsClass.game;
import static Papka.StringClass.findSymbolOccurrence;
import static Papka.StringClass.findWordPosition;
import static Papka.StringClass.arePalindrome;
import static Papka.StringClass.stringReverse;
public class Main {

    public static void main(String[] args) {

        String string = "Lois rents a great house for her family through Airbnb," +
                " and the Family Guy goes on vacation to Nantucket.";
        char symbol = 'a';
        String source = "Apollo";
        String target ="pollo";
        String revers = "Hello";
        String palindrome = "zxcvbnmmnbvcxz";
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Number of symbol |" + symbol + "| in string |" + string + "| is: "
                + findSymbolOccurrence(string, symbol) + '\n');
        System.out.println("Source: " + source + '\n' + "Target: " + target + '\n' + "Result: "
                + findWordPosition(target, source) + '\n');
        System.out.println(revers + " is " + stringReverse(revers) + '\n');
        System.out.println(palindrome + " is " + arePalindrome(palindrome) + '\n');
        game(words);
    }





}