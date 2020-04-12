package mta.edu.vn;

public class FindMaxValue {

	// Tìm giá trị lớn nhất của mảng sử dụng tìm kiếm tuần tự 
	static int findMaxResult(int a[], int n) {
		int result = a[0];

		for (int i = 0; i < n; i++) {
			if (a[i] > result) {
				result = a[i];
			}
		}
		return result;
	}

	// Tìm phần tử x xuất hiện lần đầu tiên (nếu có) trong mảng đã cho.
	/*
	 * Ở đây có 2 trường hợp xảy ra:
	 * 	1. Tìm thấy phân tử x xuất hiện trong mảng ở vị trí i và i < n
	 * 	2. Không tìm thấy phần tử x trong mảng thì i = n.
	 */
	static int findVersion1(int a[], int x) {
		// c1
		int i = 0;
		while ((i < a.length) && (a[i] != x)) {
			++i;
		}
		if (i < a.length) {
			return i;
		}

		// c2
		int n = a.length;
		a[n] = x; // lính canh
		while (a[i] != x) {
			++i;
		}
		if (i < n) {
			return i;
		}

		// c3
		for (int j = 0; j < a.length; j++) {
			if (a[j] == x) {
				return j;
			}
		}

		return -1;
	}

	/* Tìm số chính phương xuất hiện đầu tiên trong mảng */ 
	static boolean isQuareNumber(int number) {
		int i = (int) Math.sqrt(number);
		return i * i == number;
	}

	static int indexOfMinSquareNumber(int a[]) {
		int n = a.length;
		int index = -1;
		int minSquare = 0;
		for (int i = 0; i < n; i++) {
			if (isQuareNumber(a[i]) && (index == -1 || a[i] < minSquare)) {
				minSquare = a[i];
				index = i;
			}
		}
		return index;
	}

	/*
	 * Tìm chỉ số phần tử nguyên tố lớn nhất trong mảng số nguyên
	 */
	boolean isPrime(int number) {
		// số nguyên tố là số chia hết cho 1 và chính nó (>= 2)
		if(number < 2) {
			return false;
		}
		int n = (int) Math.sqrt(number);
		for(int i = 2; i <= n; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
