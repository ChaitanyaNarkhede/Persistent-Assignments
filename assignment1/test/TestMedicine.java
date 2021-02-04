package com.psl.training.assignment1.test;
import java.util.Random;

import com.psl.training.assignment1.*;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Medicine[] med = new Medicine[10];
		
		for(int i=0;i<10;i++) {
			Random random = new Random();
			int ran = random.nextInt(4);
			if(ran==1) {
				med[i] = new Ointment();				
			}
			if(ran==2) {
				med[i] = new Syrup();				
			}
			if(ran==3) {
				med[i] = new Tablet();				
			}
		}
		
		for(Medicine m:med) {
			m.displayLabel();
		}		
	}
}
