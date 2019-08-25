package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int items = scan.nextInt();
		
		String[] itemNames = new String[items];
		
		double[] itemPrices = new double[items];
		
		for (int i = 0; i < itemNames.length; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int personCount = scan.nextInt();
		
		String[] firstNames = new String[personCount];
		
		String[] lastNames = new String[personCount];
		
		double[] totals = new double[personCount];
		
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
			totals[i] = calculateTotal(itemNames, itemPrices, itemCount, foodName);
			
			
		}
		
		int smallest = findSmallest(totals);
		int biggest = findBiggest(totals);
		double average = calculateAverage(totals);
		
		System.out.println("Biggest: " + firstNames[biggest] + "" + lastNames[biggest] + " (" + String.format("%.2f", totals[biggest]) + ") ");
		System.out.println("Smallest: " + firstNames[smallest] + "" + lastNames[smallest] + " (" + String.format("%.2f", totals[smallest])  + ") ");
		System.out.println("Average: " + String.format("%.2f", average));
		
		scan.close();
		
		
		
	}
	static double calculateTotal(String[] items, double[] prices, int[] itemCount, String[] foodType) {
		double total = 0;
		for(int i = 0; i < foodType.length; i++) {
			for(int p = 0; p < items.length; p++) {
				if (foodType[i].equals(items[p])) {
					double a = prices[p] * itemCount[i];
					total += a;
				}
			}
		}
		return total;
	}
	
	static double calculateAverage(double[] total) {
		double Average = 0;
		double b = 0;
		for (int i = 0; i < total.length; i++) {
			double a = total[i];
			b += a;
			if (i == total.length - 1) {
				Average = b / (total.length);
			}
			
					
		}
		return Average;
	}
	
	static int findSmallest(double[] total) {
		double cur_smallest = total[0];
		int indexNumber = 0;
		for (int i = 0; i < total.length; i++) {
			if (cur_smallest > total[i]) {
				cur_smallest = total[i];
				indexNumber = i;
				
			}
			
		}
		return indexNumber;
	}
	
	static int findBiggest(double[] total) {
		double cur_biggest = total[0];
		int indexNumber = 0;
		for (int i = 0; i < total.length; i++) {
			if (cur_biggest < total[i]) {
				cur_biggest = total [i];
				indexNumber = i;
				
			}
		}
		return indexNumber;
	}
}
