package com.psl.training.assignments;
import java.util.*;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		System.out.println("This string has "+countVowel(str)+" vowels.");
		sc.close();
	}
	public static int countVowel(String s) {
		int count = 0;			
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		
		return count;
	}
}
