package com.lab2.practice2;




import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		
		int size = 0, amount = 0;
		
		Scanner sc = new Scanner(System.in);
		
				
	
		System.out.println("Enter the size of currency denominations ");
		size = sc.nextInt();
			
	
		int[] denominations = new int[size];
				
		
		System.out.println("Enter the currency denominations value ");
		for(int i = 0; i < size; i++) {
			
			denominations[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter the amount you want to pay ");
		amount = sc.nextInt();
		
		
	
		MergeSort merge = new MergeSort();
		denominations = merge.sort(denominations, 0, denominations.length-1);
		
		getDemonimations(amount, denominations);
		
		
	
		sc.close();		

	}

	private static void getDemonimations(int amount, int[] denominations) {
		
		int balance = amount;
		int[] count = new int[denominations.length];
		
		
		try {
			
			for(int i = 0; i < denominations.length; i++) {			
				
				if(balance > 0 && balance >= denominations[i]) {
					
					count[i] = balance / denominations[i];
					balance = balance % denominations[i];
				}
			}
			
			if(balance > 0 || amount == 0) {
				System.out.println("Entered amount cannot be equally split-up with the given currency value of notes");
			}
			else {
				System.out.println("Your payment approach in order to give min no of notes will be ");
				
				for(int i = 0; i < denominations.length; i++) {
					
					if(count[i] > 0) {
						System.out.println(denominations[i] + ": " + count[i]);
					}
				}
			}
		}
		catch (ArithmeticException e) {
			
			System.out.println(e + " :: Invalid demonimation count for denomination 0");
		}
	}

}
