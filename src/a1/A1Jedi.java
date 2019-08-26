package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		
		String[] itemNames = new String[items];
		
		double[] itemPrices = new double[items];
		
		int[] customersBought = new int[items];
		
		int[] totalItems = new int[items];
		
		for (int i = 0; i < itemNames.length; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int personCount = scan.nextInt();
		
		String[] firstNames = new String[personCount];
		
		String[] lastNames = new String[personCount];
		
		// double[] totals = new double[personCount];
		
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int foodCount = scan.nextInt();
			
			int[] itemCount = new int[foodCount];
			String[] foodName = new String[foodCount];
			
			for (int p = 0; p < itemCount.length; p++) {
				itemCount[p] = scan.nextInt();
				foodName[p] = scan.next();
			}
					
				for (int n = 0; n < itemNames.length; n++) {
					int a = countingCustomersWhoBoughtTheItem(itemNames[n], foodName);
					customersBought[n] = customersBought[n] + a;

			}
				for (int g = 0; g < itemNames.length; g++) {
					int b = countingTotalItems(itemNames[g], itemCount, foodName);
					totalItems[g] = totalItems[g] + b;
					
				}
		
	}
		for (int i = 0; i < itemNames.length; i++) {
			if (customersBought[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
				
			} else {
				System.out.println(customersBought[i] + " customers bought " + totalItems[i] + " " + itemNames[i]);
			}
		}
		
	}
		
	
	static int countingCustomersWhoBoughtTheItem(String storeItem, String[] boughtFood) {
		for (int i = 0; i < boughtFood.length; i++) {
			if (storeItem.equals(boughtFood[i])) {
				return 1;
			}
			
		}
		return 0;
	}
	
	static int countingTotalItems(String storeItem, int[] foodCount, String[] boughtFood ) {
		int totalItems = 0;
		for (int i = 0; i < boughtFood.length; i++) {
			if (storeItem.contentEquals(boughtFood[i])) {
				totalItems = foodCount[i];
				return totalItems;
			}
		}
		
		return totalItems;
	}
}
