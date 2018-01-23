package com.bridgelabz.algorithm;

import java.util.Scanner;
import com.bridgelabz.util.Utility;

public class QuestionFindNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = scanner.nextInt();

		int n = (int) Math.sqrt(number);
		
		System.out.println("root is "+n);
		int low =0, high = number-1;
		
		for(int i=0; i<n; i++)
		{
			int mid = (high + low) / 2;
			System.out.println("If your number between "+low+" To "+mid+" Press 1... OR "+mid+" To "+high+" Pess 0");
			int value = scanner.nextInt();
			if (value == 1) 
			{
				low = low;
				high = mid;
			}
			else if(value == 0)
			{
				low = mid + 1;
				high = high;
			}
			if (low == high) 
			{
				System.out.println("the number is" + mid);
				
			}
	
	}
	}
}
