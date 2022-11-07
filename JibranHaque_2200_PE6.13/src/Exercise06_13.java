/*
 * @author: Jibran Haque
 * 11/7/2022 [M]
 */

public class Exercise06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("%4s%20s\n", "i", "m(i)");
	}

	public static double m(int i) {
		double sum = 0;
		for (int k = 1; k <= i; k++) {
			sum += k/(k+1.0);
		}
		
		return sum;
	}

}
