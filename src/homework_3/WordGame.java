package homework_3;

import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		System.out.print("Please enter a word: ");
		
		Scanner reader = new Scanner(System.in);
		int counter = 0;
		String inputWord = reader.next();
		reader.close();
		
		char[] revWord = new char[inputWord.length()];
		
		for(int i=inputWord.length()-1; i >= 0; i--) {
			revWord[counter] = inputWord.charAt(i);
			counter++;
		}
		
		String reversedWord = new String(revWord);
		System.out.println("The reverse of the word " + inputWord + " is "
				+ reversedWord);
		if(inputWord.equals(reversedWord)) {
			System.out.println("The word is a palindrome!!");
		}
		else {
			System.out.println("The word is not a palindrome!!");
		}
	}

}
