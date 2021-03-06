/**
 * 
 */
package com.mahmud.BS07SwitchCaseAppPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author MAHMUDUL HASAN KHAN CSE
 *
 */
public class MainProgram {

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n\n");
		
		List<String> futureMonths = new ArrayList<>();
		
		int currentMonth = 1;
		
		switch(currentMonth) {
		
		case 1: futureMonths.add("January");
		case 2: futureMonths.add("February");
		case 3: futureMonths.add("March");
		case 4: futureMonths.add("April");
		case 5: futureMonths.add("May");
		case 6: futureMonths.add("June");
		case 7: futureMonths.add("July");
		case 8: futureMonths.add("August");
		case 9: futureMonths.add("September");
		case 10: futureMonths.add("October");
		case 11: futureMonths.add("November");
		case 12: futureMonths.add("December");
				break;
		default: break;
		
		}
		
		System.out.println("\tFuture Months with days : ");
		
		int year = 2000 + new Random().nextInt(21);
		
		futureMonths.stream().forEach(month -> {
			
			int day = 31;
			
			switch(month.toLowerCase()) {
				
			case "april":
			case "june":
			case "september":
			case "november":
					day = 30;
				break;
				
			case "february":
				if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					
					day = 29;
					
				} else {
					
					day = 28;
					
				}
			
			}
			
			System.out.println("\t" + month + " has " + day + " days in " + year);
			
		}
		);

	}

}
