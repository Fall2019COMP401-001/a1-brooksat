package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int count = scan.nextInt();
		
		String[] firstNames  = new String[count];
		
		String[] lastNames = new String[count];
		
		for (int i = 0; i < firstNames.length; i++) {
			firstNames[i] = scan.next();
			lastNames[i] = scan.next();
			int foodCount = scan.nextInt();
			
			int[] itemCount = new int[foodCount];
			String[] foodName = new String[foodCount];
			double[] itemPrice = new double[foodCount];
			for (int p = 0; p < itemCount.length; p++) {
				itemCount[p] = scan.nextInt();
				foodName[p] = scan.next();
				itemPrice[p] = scan.nextDouble();
			}
			double total = calculateTotal(itemCount, itemPrice);
			
			System.out.println(firstNames[i].charAt(0) + ". " + lastNames[i] + ": " + String.format("%.2f", total));
		}
		
		
	}
	static double calculateTotal(int[] count, double[] price) {
		double total = 0;
		for (int i = 0; i < count.length; i++) {
			double a = count[i] * price[i];	
			total += a;
			
		}
		
		return total;
	}
}
