package lab2;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Labs2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Please enter a radius");
		getAreaCircumference(getInput());

		System.out.println("Please enter a base-width");
		double baseWidth = getInput().nextDouble();
		System.out.println("Please enter a height");
		getAreaTriangle(baseWidth, getInput().nextDouble());

		System.out.println("Please enter a number");
		checkEvenOrOdd(getInput());
		
		System.out.println("Please enter an integer");
		getDecimal(getInput());

		System.out.println("Please enter a letter of the alphabet");
		getAscii(getInput());
		System.out.println("Please enter a number in decimal format");
		getIntegar(getInput());
		System.out.println("Please enter a year as a 4 digit number");
		checkLeapYear(getInput());

	}

	// Gets input from console
	public static Scanner getInput() {
		Scanner inputScanner = new Scanner(System.in);
		return inputScanner;
	}

	public static void getAreaCircumference(Scanner in) {
		double pi = 3.14;
		double radius = in.nextDouble();
		System.out.printf("Area: %.2f \n", (pi * (radius * radius)));
		System.out.printf("Circumference: %.2f \n", (2 * pi * radius));
	}

	public static void getAreaTriangle(double baseWidth, double height) {
		System.out.printf("Area: %.2f \n", (height * baseWidth) / 2);
	}

	public static void checkEvenOrOdd(Scanner in) {
		if (in.nextDouble() % 2 == 1) {
			System.out.println("That number is odd.");
		} else {
			System.out.println("That number is even.");
		}
	}

	private static void getDecimal(Scanner in) {
		int int1 = in.nextInt();
		System.out.printf("You entered " + int1 + ", the new value is " + (double) int1);
	}

	private static void getAscii(Scanner in) {
		Scanner scanner = new Scanner(System.in);
		String asciiByte;
		asciiByte = scanner.next();
		char[] tempCharArr = new char[1];
		
		tempCharArr = asciiByte.toCharArray();
		
		int asciiInt = tempCharArr[0];
		System.out.println(asciiInt);

	}
	
	public static void getIntegar(Scanner in) {
		
		double input = in.nextDouble();
		System.out.println("You entered " + input + ", the new value is " + Math.round(input));
		
	}
	
	public static void checkLeapYear(Scanner in) {
		int year = in.nextInt();
		if (year % 4 ==0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("That is a leap year!");
				}else {
					System.out.println("That is NOT a leap year!");
				}
			}else {
				System.out.println("That is a leap year!");
			}
		}else {
			System.out.println("That is NOT a leap year!");
		}
	}
	
	

}
