/*
 * @author: Jibran Haque
 * 11/16/2022 [W]
 */

import java.util.Scanner;

public class Exercise06_04v2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();		
		
		if (number < 0) {
			System.out.print("-");
			reverse(number);
		}
		else {
			reverse(number);
		}
		
		
		input.close();
		
	}
	
	public static int reverse (int n) {
		
		int temp = absoluteValue(n);
		
		if (temp == 0) {
			System.out.print(temp);
		}
		
		while (temp != 0) {
			System.out.print(temp % 10);
			temp = temp/10;
			
			n = temp;
			
		}
	
		return n;
		
	}
	
	public static int absoluteValue (int n) {
		
		double num = n;
		num = Math.sqrt(Math.pow(num, 2));
		n = (int)num;
		return n;
	}

}