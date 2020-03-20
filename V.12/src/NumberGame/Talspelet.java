package NumberGame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Talspelet {

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();
    static int correctAnswer = 0;
    static int player1Answer;
    static int player1GuessCounter = 0;
    static int player2GuessCounter = 0;
    static int numbersOfPlayers = 0;
    static boolean isMultiPlayerTrue = false;
    static int levelOfDifficulty = 0;
    static int hardModeMaxGuesses = 5;
    static int getInteger;



    public static void main(String[] args) {
        //getIntegerInput();
        startTalSpelet();
    }

    public static void startTalSpelet() {





        System.out.println("Welcome to Talspelet! \n");
        gameRules();
        System.out.printf("How many players do you want to play as? \n" +
                "1) Singleplayer \n" +
                "2) Multiplayer \n");

        while (true) {
            System.out.println("Enter a number, either 1 or 2: ");
            try {
                numbersOfPlayers = scan.nextInt();
                if (numbersOfPlayers == 1 || numbersOfPlayers == 2) {
                    break;
                }
            }
            catch(Exception InputMismatchException){
                    System.out.println("Invalid input, try again!");
                    scan.next();
                }
        }

        if (numbersOfPlayers == 1){
            System.out.println("Singleplayer is chosen!");

        }
        else if (numbersOfPlayers == 2){
            isMultiPlayerTrue = true;
            System.out.println("Multiplayer is chosen!");
        }

        System.out.printf("Now choose a level of difficulty: \n" +
                "1) Easy \n" +
                "2) Normal \n" +
                "3) Hard \n"
        );
        while (true) {
            System.out.println("Enter a number, either 1, 2 or 3: ");
            try {
                levelOfDifficulty = scan.nextInt();
                if (levelOfDifficulty == 1 || levelOfDifficulty == 2 || levelOfDifficulty == 3) {
                    break;
                }
            }
            catch(Exception InputMismatchException){
                System.out.println("You´re probably out of your mind or you've just typed it wrong, try again!");
                scan.next();
            }
        }
        randomizedNumberGenerator();
        checkDifficulty();







    }


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

        private static void checkMultiPlayer(){
            if (isMultiPlayerTrue){
                multiPlayerGameMode();
            }
            else{
                singlePlayerGameMode();
            }
        }

        private static void gameRules(){
            System.out.printf("This is a game where you try to guess a number, a secret number. \n" +
                    "But you can only type in whole numbers from a certain range! \n" +
                    "You will be given the opportunity to either play the game with someone else or alone. \n" +
                    "And you will be given 3 options to play, either 1, 2 or 3. \n" +
                    "Option 1, Difficulty: Easy, and the range of numbers is from 1-10 with unlimited guessing. \n" +
                    "Option 2, Difficulty: Normal, where the range is from 1-100, also with unlimited guessing.\n" +
                    "And for last, Option 3, Difficulty: HARD, where the range of numbers is from 1-500 \n" +
                    "and you only got 5 guesses to get the right answer! \n" +
                    "Enjoy and try to guess the right number! \n \n \n ");
        }

        private static void hardSingleplayerGuessAlgorithm(){
            while (player1Answer != correctAnswer){
                System.out.println("Enter a number: ");
                player1Answer = getIntegerInput();
                player1GuessCounter++;

                if (player1GuessCounter == hardModeMaxGuesses){
                    System.out.println("You have exceeded you guess limit! You lose!");
                    break;
                }
                else if (player1Answer > correctAnswer){
                    System.out.println("To high, try a smaller number! ");
                }
                else if (player1Answer < correctAnswer){
                    System.out.println("To low, try a greater number! ");
                }
            }
            if (player1Answer == correctAnswer){
                System.out.println("You have guessed the right number!");
                System.out.println("It took you " + player1GuessCounter + " guesses! \n");
            }
        }

        private static void easyOrNormalSinglePlayerGuessAlgorithm(){
            while (player1Answer != correctAnswer){
                System.out.println("Enter a number: ");
                player1Answer = getIntegerInput();
                player1GuessCounter++;

                if (player1Answer > correctAnswer){
                    System.out.println("To high, try a smaller number! ");
                }
                else if (player1Answer < correctAnswer){
                    System.out.println("To low, try a greater number! ");
                }
            }
            System.out.println("You have guessed the right number!");
            System.out.println("It took you " + player1GuessCounter + " guesses! \n");
        }

        private static void easyOrNormalMultiPlayerGuessAlgorithm(){

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

            }
            else{

            }
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
            System.out.println(correctAnswer);
            System.out.println("Easy gamemode has been chosen!");
            checkMultiPlayer();
        }

        private static void normalGameMode(){
            System.out.println(correctAnswer);
            System.out.println("Normal gamemode has been chosen!");
            checkMultiPlayer();
        }

        private static void hardGameMode(){
            System.out.println(correctAnswer);
            System.out.println("Hard gamemode has been chosen!");
            checkMultiPlayer();
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
                    startTalSpelet();
                case 2:
                    System.out.println("See you!");
                    break;
            }
        }


}
