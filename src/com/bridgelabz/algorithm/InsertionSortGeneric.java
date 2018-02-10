package com.bridgelabz.algorithm;

import java.util.Scanner;

import com.bridgelabz.util.Utility;

public class InsertionSortGeneric {

	private static Scanner scanner;

	public static void main(String[] args) {
	
		scanner = new Scanner(System.in);
		System.out.println("Press 1 to Start the time:");
		scanner.nextLong();
		long startTime = System.currentTimeMillis();
		System.out.println("Start time.." + startTime );
		
		System.out.println("Enter the size of list:");
		int size = Utility.getInteger();
		Integer[] array = new Integer[size];
		System.out.println("Enter the list of elements to be sorted:");
		for (int i = 0; i < array.length; i++) {
			array[i] =  Utility.getInteger();
		}
		Utility.insertionSort(array);
		Utility.printArray(array);
		
		String[] arrayString = new String[size ];
		int length=array.length;
		//System.out.println(length);
		System.out.println("Enter the string of elements to be sorted:");
		for (int i = 0; i < length; i++) {
			arrayString[i] = Utility.getString();
		}
		Utility.insertionSort(arrayString);
		Utility.printArray(arrayString);
		
		System.out.println("Press 2 to stop the time:");
		scanner.nextLong();
		long stopTime = System.currentTimeMillis();
		System.out.println("Stop Time." +  stopTime );

		long elapsedTime = stopTime - startTime;
		// System.out.println("Elapsed time between start and stop.."
		// +elapsedTime);
		System.out.println("Elapsed time: " + (elapsedTime / 1000) % 60 + "sec");
		
	}
}
 