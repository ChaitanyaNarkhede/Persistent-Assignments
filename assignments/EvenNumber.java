package com.psl.training.assignments;
import java.util.*;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();		
		Integer[] arr = new Integer[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();			
		}
		
		System.out.println("Number of even numbers are: "+ countEvens(arr));
	}
	
	public static int countEvens(Integer[] arr) {		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				count++;
		}
		
		return count;
	}

}
