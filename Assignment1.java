package Assignment1;

import java.util.Scanner;

import jdk.jfr.DataAmount;


public class Assignment1 {

	
	double billcalculate(int units) {
		
		if(units<100) {
			return units*1.20;
			
		}else if(units<=300) {
			units = units-100;
			return (100*1.20)+(units*2); 
		}
		
		else {
			 units = units-300;
			 return (100*1.20)+(200*2)+(units*3);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalUnits = sc.nextInt();
	Assignment1 assignment1 = new Assignment1();
	System.out.print("Total bill DataAmount is Amount "+ assignment1.billcalculate(totalUnits));

	}

}
