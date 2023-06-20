package Papka;

import java.util.*;

public class WordsClass {
    public static void game(String[] words) {
        Random randomIndex = new Random();
        int i = randomIndex.nextInt(words.length);
        String rightAnswer = words[i];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!" + '\n'
                + "Today we will play a game where you have to guess the word." + '\n'
                + "And this is our words:" + '\n'
                + Arrays.toString(words) + '\n'
                + "Lets try: ");
        String possibleAnswer = scanner.nextLine().toLowerCase(Locale.ROOT);

        while(!Objects.equals(possibleAnswer, rightAnswer)) {
            System.out.println("Incorrect!" + '\n' + "Let me give you a hint: " + rightAnswer.toCharArray()[0]
                    + rightAnswer.toCharArray()[1] + "###############" + '\n' + " Try again: ");
            possibleAnswer = scanner.nextLine().toLowerCase(Locale.ROOT).strip();
        }

        System.out.println("Correct! It was | " + possibleAnswer + " |");
    }
}
