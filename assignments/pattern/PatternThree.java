package com.psl.training.assignments.pattern;
import java.util.*;

public class PatternThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();			
		
		char[] arr = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(arr[i]==' ')
				System.out.println();
			else
				System.out.print(arr[i]);
		}
		
	}

}
