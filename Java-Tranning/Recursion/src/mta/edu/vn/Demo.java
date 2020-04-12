package mta.edu.vn;

public class Demo {

	static void inChuoi() {

	}

	static void baoLoi(String str) {
		if (str.length() > 50) {
			System.out.println(str);
		} else {
			baoLoi("Hello");
		}
	}

	static void countDown(int i) {
		if (i < 0) {
			return;
		} else {
			countDown(i - 1);
		}
		System.out.println(i);
	}

	public static void main(String[] args) {

//		baoLoi("Xin chao");
		countDown(10);

	}
}
