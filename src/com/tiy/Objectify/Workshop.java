package com.tiy.Objectify;

import java.util.Scanner;

public class Workshop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput = null;
		int bearPart = 0;
		boolean userFailed = false;

		String userInputB = null;
		String userInputC = null;
		String userInputD = null;
		String userInputE = null;
		String userInputF = null;
		String userInputG = null;
		String userInputH = null;
		String userInputI = null;
		String userInputJ = null;
		String userInputK = null;

		Bear ourBear = new Bear();

		System.out.println("Welcome to Bears'U'Build Sweatshop!"
				+ "\nWhat kind of stuffed animal would you like our totally legal workforce to build for you today????");
		String userInputA = sc.nextLine();

		System.out.println("What would you like the inner skeleton cast from?");
		userInputB = sc.nextLine();

		ourBear.setSkeletonMaterial(userInputB);

		do {

			System.out.println("How many limbs would you like your thing to have?");
			userInputC = sc.nextLine();

			userFailed = numberIsValid(userInputC);

		} while (userFailed);
		bearPart = Integer.parseInt(userInputC);
		ourBear.setHowManyLimbs(bearPart);

		do {

			System.out.println("How many ounces of tungsten would you like used for the cute but, obviously vicious, claws?");
			userInputD = sc.nextLine();

			userFailed = numberIsValid(userInputD);

		} while (userFailed);
		bearPart = Integer.parseInt(userInputD);
		ourBear.setHowMuchTungsten(bearPart);
		
		do {

			System.out.println("How many metric tons would you like your widdle cuddle muffin to weigh?");
			userInputE = sc.nextLine();

			userFailed = numberIsValid(userInputE);

		} while (userFailed);
		bearPart = Integer.parseInt(userInputE);
		ourBear.setWeight(bearPart);
		
		System.out.println("What color would you like this affront to nature to be?");
		userInputF = sc.nextLine();

		ourBear.setColor(userInputF);
		
		System.out.println("What's the little bastard's stupid dumbass name?");
		userInputG = sc.nextLine();

		ourBear.setName(userInputG);
		
		System.out.println("What kind of food do you think it would eat if it was a real living thing"
				+ "\nand not a lifeless inanimate symbol of false love?");
		userInputH = sc.nextLine();

		ourBear.setWhatFood(userInputH);
		
		System.out.println("Explain the cuddle factor you would like this pile of poorly stitched together dumpster fodder"
				+ "\nto have, in a single word.");
		userInputI = sc.nextLine();

		ourBear.setCuddleFactor(userInputI);
		
		do {

			System.out.println("How many little baby monsters do you think this thing would have, if it could ever hope"
					+ "\nto procreate, should it gain sentience and find an equally depressing mate?");
			userInputJ = sc.nextLine();

			userFailed = numberIsValid(userInputJ);

		} while (userFailed);
		bearPart = Integer.parseInt(userInputJ);
		ourBear.setChildren(bearPart);
		
		System.out.println("What would you like your brand new little bundle of joy, stitched by the tiniest of hands,"
				+ "\nto say in order to alert you to the end times that are inevitably coming?");
		userInputK = sc.nextLine();

		ourBear.setEndTime(userInputK);
		
		System.out.println(ourBear.toString());
		
		
	}

	public static boolean numberIsValid(String numberString) {
		try {
			int aNumber = Integer.parseInt(numberString);
			return false;

		} catch (NumberFormatException e) {
			return true;
		}
	}

}
