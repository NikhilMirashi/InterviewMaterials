package com.springpeople;

public class CheckMultiple {

	public static void main(String[] args) {

		int[] myArray = { 0, 1, 2, 3, 5, 9, 10, 15, 45, 15, 30 };
		int check = 0;
		for (int arrayNumber : myArray) {
			if (arrayNumber != 0) {
				checkRepitationOfNumber(arrayNumber, check);
				// checkMultiple(arrayNumber);
			}

		}
	}

	private static void checkRepitationOfNumber(int arrayNumber, int check) {
		if (arrayNumber != check) {
			checkMultiple(arrayNumber);
		} else {

		}

	}

	private static void checkMultiple(int arrayNumber) {

		if (arrayNumber % 3 == 0 && arrayNumber % 5 == 0) {
			System.out.println(arrayNumber + " is a multiple of 3 and 5");
		}
	}

}
