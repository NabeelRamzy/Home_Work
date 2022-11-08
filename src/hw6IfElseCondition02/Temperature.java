package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		System.out.println("Todays Weather");
		Scanner scanner = new Scanner(System.in);
		int todaysTemperatur = scanner.nextInt();

		if (todaysTemperatur < 32) {
			System.out.println("Freezing");
		} else if (todaysTemperatur > 55) {
			System.out.println("Pleasant");
		} else if (todaysTemperatur < 73) {
			System.out.println("Getting Warmer");
		} else if (todaysTemperatur > 101) {
			System.out.println("Hot");
		} else {
			System.out.println("Please put Ice on my Head");
		}
	}

}
