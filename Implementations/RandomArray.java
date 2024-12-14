package Implementations;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = {"rock", "paper", "scissor"};
        Random random = new Random();

        int userWins = 0;
        int aiWins = 0;
        int difficulty = 1; // 1: Easy, 2: Medium, 3: Hard
        int livesLeft = 2; // User has 5 lives

        System.out.println("Welcome to Rock-paper-scissors with difficulty adjustment!");
        System.out.println("Type rock, paper, or scissor to play. Type 'exit' to quit.");
        System.out.println("You have " + livesLeft + " lives Left");

        while (livesLeft >0) {
            System.out.print("Enter your Answer: ");
            String userInput = in.next();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            if (!userInput.equals("rock") && !userInput.equals("paper") && !userInput.equals("scissor")) {
                System.out.println("Invalid Input! Please choose rock, paper, or scissor.");
                continue;
            }

            // Adjust computer difficulty
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

            if (userInput.equals("rock")) {
                if (randomAnswer.equals("paper")) {
                    System.out.println("computer Wins, computer chooses " + randomAnswer);
                    aiWins++;
                    userWins = 0;
                    livesLeft--;
                    System.out.println("You now have" + livesLeft + " lives");
                } else if (randomAnswer.equals("scissor")) {
                    System.out.println("User Wins, computer chooses " + randomAnswer);
                    userWins++;
                    aiWins = 0;
                    livesLeft++;
                    System.out.println("You now have" + livesLeft + " lives");
                } else {
                    System.out.println("It's a Tie, computer also chooses " + randomAnswer);
                }
            } else if (userInput.equals("paper")) {
                if (randomAnswer.equals("scissor")) {
                    System.out.println("computer Wins, computer chooses " + randomAnswer);
                    aiWins++;
                    userWins = 0;
                    livesLeft--;
                    System.out.println("You now have" + livesLeft + " lives");
                } else if (randomAnswer.equals("rock")) {
                    System.out.println("User Wins, computer chooses " + randomAnswer);
                    userWins++;
                    aiWins = 0;
                    livesLeft++;
                    System.out.println("You now have" + livesLeft + " lives");
                } else {
                    System.out.println("It's a Tie, computer also chooses " + randomAnswer);
                }
            } else if (userInput.equals("scissor")) {
                if (randomAnswer.equals("rock")) {
                    System.out.println("computer Wins, computer chooses " + randomAnswer);
                    aiWins++;
                    userWins = 0;
                    livesLeft--;
                    System.out.println("You now have" + livesLeft + " lives");
                } else if (randomAnswer.equals("paper")) {
                    System.out.println("User Wins, computer chooses " + randomAnswer);
                    userWins++;
                    aiWins = 0;
                    livesLeft++;
                    System.out.println("You now have" + livesLeft + " lives");
                } else {
                    System.out.println("It's a Tie, computer also chooses " + randomAnswer);
                }
            }

            // Adjust difficulty based on user's performance
            if (userWins >= 5) {
                difficulty = Math.min(difficulty + 1, 3); // Increase difficulty, max is 3
                userWins = 0; // Reset streak
                System.out.println("Difficulty increased to " + difficulty + "!");
            }
            if (aiWins >= 3) {
                difficulty = Math.max(difficulty - 1, 1); // Decrease difficulty, min is 1
                aiWins = 0; // Reset streak
                System.out.println("Difficulty decreased to " + difficulty + "!");
            }

            System.out.println("Lives Left: " + livesLeft);
            if (livesLeft == 0) {
                System.out.println("Game Over! You have no lives left.");
            }
        }

        in.close();
        System.out.println("Lives Required 2 " + "Lives Left " + livesLeft );
    }

    // Helper method to determine counter move index
    private static int counterMoveIndex(String userInput, String[] arr) {
        switch (userInput) {
            case "rock":
                return 1; // paper beats rock
            case "paper":
                return 2; // scissor beats paper
            case "scissor":
                return 0; // rock beats scissor
            default:
                return new Random().nextInt(arr.length); // Fallback to random
        }
    }
}
