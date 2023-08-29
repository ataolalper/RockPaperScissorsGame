import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int userScore, aiScore, userChoice, aiChoice;

        System.out.println("Welcome to the rock paper scissors game.");
        System.out.println("Whoever gets 3 points wins.");

        userScore = 0;
        aiScore = 0;

        while (true) {
            System.out.println("\n1 - Rock\n2 - Paper\n3 - Scissors");
            System.out.print("\nSelect to make moves: ");
            userChoice = input.nextInt();
            aiChoice = random.nextInt(1, 4);

            if (userChoice == 1) {
                System.out.println("\nUser choice is Rock.");
                if (aiChoice == 1) {
                    System.out.println("AI choice is Rock.");
                    System.out.println("\nRound draw.");
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else if (aiChoice == 2) {
                    System.out.println("AI choice is Paper.");
                    System.out.println("\nAI won this round.");
                    aiScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else {
                    System.out.println("AI choice is Scissors.");
                    System.out.println("\nUser won this round.");
                    userScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                }
            }

            else if (userChoice == 2) {
                System.out.println("\nUser choice is Paper.");
                if (aiChoice == 1) {
                    System.out.println("AI choice is Rock.");
                    System.out.println("\nUser won this round.");
                    userScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else if (aiChoice == 2) {
                    System.out.println("AI choice is Paper.");
                    System.out.println("\nRound draw.");
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else {
                    System.out.println("AI choice is Scissors.");
                    System.out.println("\nAI won this round.");
                    aiScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                }
            }

            else if (userChoice == 3) {
                System.out.println("\nUser choice is Scissors.");
                if (aiChoice == 1) {
                    System.out.println("AI choice is Rock.");
                    System.out.println("\nAI won this round.");
                    aiScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else if (aiChoice == 2) {
                    System.out.println("AI choice is Paper.");
                    System.out.println("\nUser won this round.");
                    userScore++;
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                } else {
                    System.out.println("AI choice is Scissors.");
                    System.out.println("\nRound draw.");
                    System.out.println("\nUser score: " + userScore);
                    System.out.println("AI score: " + aiScore);
                }
            } else {
                System.out.println("\nYou made the wrong choice!");
                continue;
            }

            if (userScore == 3) {
                System.out.println("\n----------\nUser win this game.\n----------");
                break;
            } else if (aiScore == 3) {
                System.out.println("\n----------\nAI win this game.\n----------");
                break;
            }
        }
    }
}