package com.psl.training.assignments.pattern;
import java.util.*;

public class PatternTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
	}

}
