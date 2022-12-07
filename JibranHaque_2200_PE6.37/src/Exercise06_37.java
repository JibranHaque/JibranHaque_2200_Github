/*
 * @author: Jibran Haque
 * 10/11/2022 [F}
 */

import java.util.Scanner;

public class Exercise06_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		System.out.print("Enter the width: ");
		int width = input.nextInt();
		
		System.out.print("The formatted number is " + format(number,width));
		
		input.close();
	}
	
	public static String format(int number, int width) {
		String result = number + "";
		
		for (int i = 0; i < width - len(number); i++) {
			result = "0" + result;
		}
		
		return result;
	}
	
	public static int len (int number) {
		int size = 0;
		
		while (number > 0) {
			size += 1;
			number = number/10;
		}
		
		return size;
	}

}
