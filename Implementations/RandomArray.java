package Implementations;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = {"stone", "paper", "scissor"};
        Random random = new Random();

        int userWins = 0;
        int computerWins = 0;
        int difficulty = 1; // 1: Easy, 2: Medium, 3: Hard

        System.out.println("Welcome to Rock-paper-scissors with difficulty adjustment!");
        System.out.println("Type stone, paper, or scissor to play. Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter your Answer: ");
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            if (!userInput.equals("stone") && !userInput.equals("paper") && !userInput.equals("scissor")) {
                System.out.println("Invalid Input! Please choose stone, paper, or scissor.");
                continue;
            }

            int randomIndex;
            if (difficulty == 1) {
                // Easy: Random choice
                randomIndex = random.nextInt(arr.length);
            } else if (difficulty == 2) {
                // Medium: Slight bias towards winning
                randomIndex = random.nextInt(2) == 0 ? counterMoveIndex(userInput, arr) : random.nextInt(arr.length);
            } else {
                // Hard: Always counter the user's move
                randomIndex = counterMoveIndex(userInput, arr);
            }

            String randomAnswer = arr[randomIndex];
            //Logic of the Game
            if (userInput.equals("stone")) {
                if (randomAnswer.equals("paper")) {
                    System.out.println("Computer Wins, Computer chooses " + randomAnswer);
                    computerWins++;
                    userWins = 0;
                } else if (randomAnswer.equals("scissor")) {
                    System.out.println("User Wins, Computer chooses " + randomAnswer);
                    userWins++;
                    computerWins = 0;
                } else {
                    System.out.println("It's a Tie, Computer also chooses " + randomAnswer);
                }
            } else if (userInput.equals("paper")) {
                if (randomAnswer.equals("scissor")) {
                    System.out.println("Computer Wins, Computer chooses " + randomAnswer);
                    computerWins++;
                    userWins = 0;
                } else if (randomAnswer.equals("stone")) {
                    System.out.println("User Wins, Computer chooses " + randomAnswer);
                    userWins++;
                    computerWins = 0;
                } else {
                    System.out.println("It's a Tie, Computer also chooses " + randomAnswer);
                }
            } else if (userInput.equals("scissor")) {
                if (randomAnswer.equals("stone")) {
                    System.out.println("Computer Wins, Computer chooses " + randomAnswer);
                    computerWins++;
                    userWins = 0;
                } else if (randomAnswer.equals("paper")) {
                    System.out.println("User Wins, Computer chooses " + randomAnswer);
                    userWins++;
                    computerWins = 0;
                } else {
                    System.out.println("It's a Tie, Computer also chooses " + randomAnswer);
                }
            }

            // Adjust difficulty based on user's performance
            if (userWins >= 3) {
                difficulty = Math.min(difficulty + 1, 3); // Increase difficulty, max is 3
                userWins = 0; // Reset streak
                System.out.println("Difficulty increased to " + difficulty + "!");
            }
            if (computerWins >= 5) {
                difficulty = Math.max(difficulty - 1, 1); // Decrease difficulty, min is 1
                computerWins = 0; // Reset streak
                System.out.println("Difficulty decreased to " + difficulty + "!");
            }
        }

        in.close();
    }

    // Helper method to determine counter move index
    private static int counterMoveIndex(String userInput, String[] arr) {
        switch (userInput) {
            case "stone":
                return 1; // paper beats stone
            case "paper":
                return 2; // scissor beats paper
            case "scissor":
                return 0; // stone beats scissor
            default:
                return new Random().nextInt(arr.length); // Fallback to random
        }
    }
}
