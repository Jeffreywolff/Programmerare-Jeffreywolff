package NumberGame;

import java.util.Scanner;

public class Talspelet {
    Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        startTalSpelet();
    }

    private static void startTalSpelet(){
        System.out.println("Welcome to Talspelet! \n");
        gameRules();
        System.out.println("How many players do you want to play as?");
    }

    private static void gameRules(){
        System.out.printf("This is a game where you try to guess a number, a secret number. \n" +
                "But you can only type in whole numbers from a certain range! \n" +
                "You will be given the opportunity to either play the game with someone else or alone. \n" +
                "And you will be given 3 options to play, either 1, 2 or 3. \n" +
                "Option 1, Difficulty: Easy, and the range of numbers is from 1-10 with unlimited guessing. \n" +
                "Option 2, Difficulty: Medium, where the range is from 1-100, also with unlimited guessing.\n" +
                "And for last, Option 3, Difficulty: HARD, where the range of numbers is from 1-500 \n" +
                "and you only got 5 guesses to get the right answer! \n" +
                "Enjoy and try to guess right! \n ");
    }
}
