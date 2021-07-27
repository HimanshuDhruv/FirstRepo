package Day1;

import java.util.Scanner;


public class assement1 {
	

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
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int totalUnits = sc.nextInt();
		assement1 as1 = new assement1();
	System.out.print("Total bill DataAmount is Amount "+ as1.billcalculate(totalUnits));

	}

}
