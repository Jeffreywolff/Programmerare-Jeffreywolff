package NumberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Talspelet {

    static Scanner scan = new Scanner(System.in); // To read the players input
    static Random random = new Random(); // To randomize a number
    static int correctAnswer = 0; // base for correct answer
    static int playerAnswer; // What the player types
    static int player1GuessCounter = 0; // Counts player 1 guesses
    static int player2GuessCounter = 0; // Counts player 2 guesses
    static int numbersOfPlayers; // Keeps the value of how many players that will play
    static boolean isMultiPlayerTrue = false; // A boolean that tells if the player wants to play multiplayer
    static int levelOfDifficulty = 0; // Keeps a integer of the level of difficulty
    static int hardModeMaxGuesses = 5; // Max guesses for hard mode, Easily changeable
    static int getInteger; // A placeholder for player inputs
    static int playerNumber; // A counter that adds 1 when a round is finished.



    public static void main(String[] args) {
        startTalSpelet(); // Startar en annan metod för att inte köra allt i mainmetoden
        // och så att jag kan köra splet när jag vill.
    }

    /**
     * This method runs the game and can be called whenever wanted.
     */
    public static void startTalSpelet() {

        System.out.println("Welcome to Talspelet! \n");
        gameRules();
        System.out.println("How many players do you want to play as? \n" +
                "1) Singleplayer \n" +
                "2) Multiplayer \n");

        while(true) {
            System.out.println("Enter a number, 1 or 2: ");
            numbersOfPlayers = getIntegerInput();
            if (numbersOfPlayers == 1 || numbersOfPlayers == 2){
                break;
            }
        }

        if (numbersOfPlayers == 2){
            isMultiPlayerTrue = true;
            System.out.println("Multiplayer is chosen!");
        }

        System.out.println("Singleplayer is chosen!");

        System.out.println("Now choose a level of difficulty: \n" +
                "1) Easy \n" +
                "2) Normal \n" +
                "3) Hard \n"
        );

        while (true) {
            System.out.println("Enter a number, either 1, 2 or 3: ");

                levelOfDifficulty = getIntegerInput();
                if (levelOfDifficulty == 1 || levelOfDifficulty == 2 || levelOfDifficulty == 3) {
                    break;
                }
        }

        randomizedNumberGenerator();
        checkDifficulty();

    }

    /**
     * A method that checks what difficulty the player has chosen and calls the responding method.
     */
    private static void checkDifficulty(){
        if (levelOfDifficulty == 1){
            easyGameMode();
        }
        else if (levelOfDifficulty == 2){
            normalGameMode();
        }
        else if (levelOfDifficulty == 3){
            hardGameMode();
        }
    }

    /**
     * A method that checks if the player choose multiplayer or singleplayer and calls the responding method.
     */
    private static void checkMultiPlayer(){
        if (isMultiPlayerTrue){
            multiPlayerGameMode();
        }
        else{
            singlePlayerGameMode();
        }
    }

    /**
     * Prints all game rules for the player to understand the game.
     */
    private static void gameRules(){
        System.out.println("This is a game where you try to guess a number, a secret number. \n" +
                "But you can only type in whole numbers from a certain range! \n" +
                "You will be given the opportunity to either play the game with someone else or alone. \n" +
                "And you will be given 3 options to play, either 1, 2 or 3. \n" +
                "Option 1, Difficulty: Easy, and the range of numbers is from 0-10 with unlimited guessing. \n" +
                "Option 2, Difficulty: Normal, where the range is from 0-100, also with unlimited guessing.\n" +
                "And for last, Option 3, Difficulty: HARD, where the range of numbers is from 0-500 \n" +
                "and you only got 5 guesses to get the right answer! \n" +
                "Enjoy and try to guess the right number! \n \n \n ");
    }

    /**
     * This method  checks how many guesses the player has done.
     * And if it exceeds a certain number it will stop the method and continue elsewhere.
     */
    private static void hardSingleplayerGuessAlgorithm(){
        while (playerAnswer != correctAnswer){
            System.out.println("Enter a number: ");
            playerAnswer = getIntegerInput();
            player1GuessCounter++;
            if (player1GuessCounter == hardModeMaxGuesses){
                System.out.println("You have exceeded you guess limit! You lose!");
                break;
            }
            playerClue(playerAnswer);
        }
        if (playerAnswer == correctAnswer){
            System.out.println("You have guessed the right number!");
            System.out.println("It took you " + player1GuessCounter + " guesses! \n");
            System.out.println("The correct number was " + correctAnswer + "!");
        }
    }

    /**
     * This method counts guesses and loop until you get the answer right.
     */
    private static void easyOrNormalSinglePlayerGuessAlgorithm(){
        while (playerAnswer != correctAnswer){
            System.out.println("Enter a number: ");
            playerAnswer = getIntegerInput();
            player1GuessCounter++;
            playerClue(playerAnswer);
        }
        System.out.println("You have guessed the right number!");
        System.out.println("It took you " + player1GuessCounter + " guesses! \n");
    }

    /**
     * This method counts guesses for each player and makes sure the right player plays the turn. Unlimited guesses.
     */
    private static void easyOrNormalMultiPlayerGuessAlgorithm(){
        playerNumber = 0;
        while(playerAnswer != correctAnswer){
            playerNumber++;
            if (playerNumber > 2){
                playerNumber = 1;
            }
            System.out.println("Enter a number player " + playerNumber + ": ");
            playerAnswer = getIntegerInput();
            if (playerNumber % 2 == 0){
                player2GuessCounter++;
            }
            else{
                player1GuessCounter++;
            }
            playerClue(playerAnswer);
        }
        System.out.println("Player " + playerNumber + " won!");
        if (playerAnswer == correctAnswer){
            if (playerNumber % 2 == 0){
                System.out.println("You guessed a total of " + player2GuessCounter + " times!");
            }
            else if (playerNumber % 2 != 0){
                System.out.println("You guessed a total of " + player1GuessCounter + " times!");
            }
        }
    }

    /**
     * This method counts guesses, but if it exceeds the max amount of guesses, the next player that hasn't exceeded
     * it's guessing gets to play. If both exceeds the max amount of guesses, the method will break and the program will
     * continue elsewhere
     */
    private static void hardMultiplayerGuessAlgorithm(){
        playerNumber = 0;
        while(playerAnswer != correctAnswer){
            playerNumber++;
            if (playerNumber > 2){
                playerNumber = 1;
            }
            if (player1GuessCounter == hardModeMaxGuesses){
                System.out.println("Player 1 is out of guesses!");
            }
            if(player2GuessCounter == hardModeMaxGuesses){
                System.out.println("Player 2 is out of guesses!");
                break;
            }
            System.out.println("Enter a number player " + playerNumber + ": ");
            playerAnswer = getIntegerInput();
            if (playerNumber % 2 == 0){
                player2GuessCounter++;
            }
            else{
                player1GuessCounter++;
            }
            playerClue(playerAnswer);
        }
        if (playerAnswer == correctAnswer){
            System.out.println("Player " + playerNumber + " won!");
            if (playerNumber % 2 == 0){
                System.out.println("You guessed a total of " + player2GuessCounter + " times!");
            }
            else if (playerNumber % 2 != 0){
                System.out.println("You guessed a total of " + player1GuessCounter + " times!");
            }
            else{
                System.out.println("None of you won!");
            }
        }
    }

    private static void singlePlayerGameMode(){
        if (levelOfDifficulty != 3){
            easyOrNormalSinglePlayerGuessAlgorithm();
        }
        else{
            hardSingleplayerGuessAlgorithm();
        }
        runGameAgain();
    }

    private static void multiPlayerGameMode(){
        if (levelOfDifficulty != 3){
            easyOrNormalMultiPlayerGuessAlgorithm();
        }
        else{
            hardMultiplayerGuessAlgorithm();
        }
        runGameAgain();
    }

    private static void randomizedNumberGenerator(){
        if (levelOfDifficulty == 1){
            correctAnswer = random.nextInt(11);
        }
        else if (levelOfDifficulty == 2){
            correctAnswer = random.nextInt(101);
        }
        else if (levelOfDifficulty == 3){
            correctAnswer = random.nextInt(501);
        }
    }

    private static void easyGameMode(){
        System.out.println("Easy gamemode has been chosen!");
        checkMultiPlayer();
    }

    private static void normalGameMode(){
        System.out.println("Normal gamemode has been chosen!");
        checkMultiPlayer();
    }

    private static void hardGameMode(){
        System.out.println("Hard gamemode has been chosen!");
        checkMultiPlayer();
    }

    private static void playerClue(int playerAnswer){
        if (playerAnswer > correctAnswer){
            System.out.println("To high, try a smaller number! ");
        }
        else if (playerAnswer < correctAnswer){
            System.out.println("To low, try a greater number! ");
        }
    }

    private static int getIntegerInput(){
        while(true) {
            try {
                getInteger = scan.nextInt();
                break;
            }
            catch (Exception InputMismatchException) {
                System.out.println("That's an invalid input, please try again!");
                scan.next();
            }
        }
        return getInteger;
    }

    private static void runGameAgain(){
        System.out.println("Do you want to play again? \n 1) Yes \n 2) No ");
        System.out.println("Enter a number: ");
        int doPlayerPlayAgain = getIntegerInput();
        switch (doPlayerPlayAgain){
            case 1:
                System.out.println("Sure thing!");
                startTalSpelet(); case 2: System.out.println("See you!");
                break;
        }
    }


}
