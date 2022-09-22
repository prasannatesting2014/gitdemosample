package com.rameshsoft.automation.java;

import java.util.Scanner;

public class PatternPrintTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scanner.nextInt();
		for(int i=1;i<num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//System.out.print("* ");
				System.out.print(+j+ " ");
			}
			System.out.println();
		}
}

}
