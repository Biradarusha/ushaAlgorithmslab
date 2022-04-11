package com.lab2.practice1;

import java.util.Scanner;

public class PayMoney {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
			System.out.println("Enter The Size Of Transaction Array: ");
			
			int size = sc.nextInt();
			
			int [] transactions = new int[size];
			System.out.println("Enter The Value Of Array: ");
			
			for(int i=0; i<transactions.length;i++) {
				transactions[i] = sc.nextInt();
						
			}
			System.out.println("Enter the total no of targets that needs to be achieved: ");
			int targets =sc.nextInt();
			
			for(int i=0; i<targets; i++) {
				System.out.println("Enter the value of target: ");
				int target = sc.nextInt();
				int sum = 0;
				
			
			for(int j=0; j<transactions.length; j++) {
				sum += transactions[j];
				if(sum >= target) {
					System.out.println("Target achieved after " + (j+1) + " transactions.");
					break;
					}
				}
				
				if(sum < target) {
					System.out.println("Given target is not achieved :");
				}
				
			}
			sc.close();
				
				
				
				
			}
		
		

	}


