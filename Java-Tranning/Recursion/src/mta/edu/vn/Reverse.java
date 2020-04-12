package mta.edu.vn;

public class Reverse {

	static String reverseStringLoop(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}

	static String reverseStringRecursion(String str, int i) {
		String s = "";
		if (i < 0) {
			return s;
		} else {
//			s = str.charAt(i) + "";
			s += str.charAt(i) + reverseStringRecursion(str, i - 1);
			return s;
		}
	}

	public static void main(String[] args) {
		String str = "Xin chao";
		reverseStringLoop("Xin chao");
		String a = "";
		String s = reverseStringRecursion(str, str.length() - 1);
		System.out.println(s);
	}

}
