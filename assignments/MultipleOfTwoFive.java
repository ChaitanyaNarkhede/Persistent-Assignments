package com.psl.training.assignments;

import java.util.Scanner;

public class MultipleOfTwoFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();		
		Integer[] arr = new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();			
		}
		
		displayMultiples(arr);
	}
	
	public static void displayMultiples(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0 || arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
