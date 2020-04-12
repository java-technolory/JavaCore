package mta.edu.vn;

public class AddTwoDigits {

	public static void main(String[] args) {
		System.out.println("Hello");
		int n = 29;
		int i = 0;
		int m = 0, sum = 0;
		while (true) {
			m = n % 10;
			sum += m;
			n = n / 10;
			i++;
			if (i >= 2) {
				break;
			}
		}
		System.out.println("sum = " + sum);
	}

}
