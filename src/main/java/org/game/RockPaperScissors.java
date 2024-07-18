package org.game;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    private static final String[] MOVES = {"R", "P", "S"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String computerMove = getComputerMove();


            String playerMove = getPlayerMove(sc);



            System.out.println("Computer played: " + computerMove);

            String result = determineWinner(playerMove, computerMove);
            if(result.equals("tie")){
                System.out.println("The game was a tie!");
            } else if (result.equals("win")){
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Do you want to play again? (yes/no): ");
            String playAgain = sc.nextLine().toLowerCase();
            if (playAgain.equals("no")) {
                System.out.println("Thanks for playing! Have a nice day.");
                break;
            }

        }
    }

    public static String getComputerMove(){
        return MOVES[new Random().nextInt(MOVES.length)];
    }

    public static String getPlayerMove(Scanner sc) {
        System.out.println("Please enter your move(R, P, S) => ");
        String playerMove;
        while (true) {
            System.out.println("Please enter your move (R, P, S): ");
            playerMove = sc.nextLine().toUpperCase();

            if (isValidMove(playerMove)) {
                break;
            }
            System.out.println(playerMove + " is not a valid move!");
        }
        return playerMove;
    }

    public static boolean isValidMove(String move){
        return (move.equals("R") || move.equals("P") || move.equals("S"));

    }

    public static String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "tie";
        } else if ((playerMove.equals("R") && computerMove.equals("S")) ||
                (playerMove.equals("P") && computerMove.equals("R")) ||
                (playerMove.equals("S") && computerMove.equals("P"))) {
            return "win";
        } else {
            return "lose";
        }
    }
}