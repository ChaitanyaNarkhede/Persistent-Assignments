package com.psl.training.assignments;
import java.util.*;

public class SpaceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("This string has "+countSpaces(str)+" spaces.");
	}
	
	public static int countSpaces(String s) {
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		
		return count;
	}
}
