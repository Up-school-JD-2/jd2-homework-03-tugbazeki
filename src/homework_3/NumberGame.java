package homework_3;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		
		int numPlayer, guess, counter, number;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Welcome to the number guessing game!!!");
		System.out.println("Players will play in sequence. After a player guesses the correct number\n"
				+ "the game for the other player will start.\n");
		System.out.print("Please enter the number of players: ");
		numPlayer = reader.nextInt();
		
		int[][] playerScores = new int[numPlayer][2];
		
		for(int index = 0; index < numPlayer; index++) {
			number = (int)Math.floor(Math.random()*100) + 1;
			counter = 0;
			
			System.out.println("\n\nThe game for Player " + index + " starts!");
			
			while(true) {
				
				System.out.print("Enter a number between 1 and 100: ");
				guess = reader.nextInt();
				counter++;
				
				if(guess < number) {
					System.out.println("\nToo low!! Try again!! \n");
				}
				else if (guess > number) {
					System.out.println("\nToo high!! Try again!! \n");
				}
				else {
					System.out.println("\nGreat!! Correct guess is " + number);
					System.out.println("You guessed it right in your " + counter + "th guess.");
					break;
				}
			}
			playerScores[index][0] = index;
			playerScores[index][1] = counter;
		}
		
		reader.close();
		
		for(int i = 0; i < numPlayer; i++) {
			for(int j = 0; j < numPlayer; j++) {
				int temp_num, temp_count;
				if(playerScores[i][1] < playerScores[j][1]) {
					temp_num = playerScores[i][0];
					temp_count = playerScores[i][1];
					playerScores[i][0] = playerScores[j][0];
					playerScores[i][1] = playerScores[j][1];
					playerScores[j][0] = temp_num;
					playerScores[j][1] = temp_count;
				}
			}
		}
		
		System.out.println("Leadership Table: \n");
		
		for(int i = 0; i < numPlayer; i++) {
			System.out.println(i + ". The player " + playerScores[i][0] + " with " + playerScores[i][1]
					+ " guesses.");
		}
	}
}
