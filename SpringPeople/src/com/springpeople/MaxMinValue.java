package com.springpeople;

import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {

		int temp = 0;
		Scanner user_input = new Scanner(System.in);
		System.out.println("enter Size of Array...");
		int Size = user_input.nextInt();

		int[] a = new int[Size];
		System.out.println("Enter element Of an Array...");
		for (int j = 0; j < Size; j++) {
			a[j] = user_input.nextInt();
		}
		for (int index = 0; index < a.length; index++) {
			for (int j = index + 1; j < a.length; j++) {
				if (a[index] > a[j]) {
					temp = a[index];
					a[index] = a[j];
					a[j] = temp;
				}
			}
		}
		int [] tempArray =new int[a.length];
//		System.out.print("Output is:- " + a[0]);
//		System.out.print("Output is:- " + a[a.length]);
//		System.out.print("Output is:- ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			tempArray[i]=a[i];
		}
		System.out.print("Output is:- " + tempArray[0]);
		System.out.print("Output is:- " + tempArray[a.length]);

	}

}
