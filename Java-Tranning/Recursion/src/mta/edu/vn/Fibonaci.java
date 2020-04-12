package mta.edu.vn;

public class Fibonaci {

	static int Fibo(int n) {
		int ret, Fn_1, Fn_2;
		if (n <= 1) {
			ret = 1;
		} else {
			Fn_1 = Fibo(n - 1);
			Fn_2 = Fibo(n - 2);
			ret = Fn_1 + Fn_2;
		}
		System.out.print(ret + " ");
		return ret;
	}

	//
	static int FiboTail(int n, int Fn_1, int Fn_2) {
		if (n <= 1) {
			return Fn_2;
		}
		return FiboTail(n - 1, Fn_2, Fn_1 + Fn_2);
	}

	//
	static int FiboLoop(int n) {
		int next = 1, previous = 0, sum = 0;
		System.out.print(previous + " " + next + " ");
		for (int i = 1; i <= n; i++) {
			sum = previous + next;
			previous = next;
			next = sum;
			System.out.print(sum + " ");
		}
		return sum;
	}

	//
	static int Xn(int n) {
		int i;
		int ret;
		if (n == 0) {
			ret = 1;
		} else {
			ret = 0;
			for (i = 0; i < n; i++) {
				ret = ret + (n - i) * (n - i) * Xn(i);
			}
		}
		return ret;
	}
	
	//
	static void A(int n) {
		if( n > 0) {
			System.out.println(n);
			A(n-1);
//			System.out.println(n);
		}
	}

	public static void main(String[] args) {
//		int result = Fibo(5); // 3 2 1 1 0
//		int result = FiboLoop(3);
//		int result = FiboTail(5, 1, 1);
//		int result = Xn(5);
//		System.out.println("\n" + result);
		A(5);
	}

}
