package mta.edu.vn;

public class TinhGiaiThua {

	static int calculator(int n) {
		int res = 0;
		if (n == 0) {
			res = 1;
		} else {
			res = n * calculator(n - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(calculator(3));
	}

}
