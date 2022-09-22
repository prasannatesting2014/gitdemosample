package com.rameshsoft.automation.java;

public class FactorialNumberTest {
public static void main(String[] args) {
	
	int num=5,fact=1;
	
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println("The factorial num of "+num+ "is: "+fact);
		
}
}
