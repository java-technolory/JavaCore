package mta.edu.vn;

public class BinarySearch {

	static boolean searchRecusion(int[] a, int start, int end, int x) {
		if (start > end) {
			return false;
		}
		int mid = (start + end) / 2;
		if (a[mid] == x) {
			return true;
		}
		if (a[mid] > x) {
			return searchRecusion(a, start, mid - 1, x);
		} else {
			return searchRecusion(a, mid + 1, end, x);
		}
	}

	static void search(int[] a, int x) {
		int start = 0;
		int result = 0;
		int end = a.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a[mid] == x) {
				result = a[mid];
				break;
			} else {
				if (a[mid] > x) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		if (result != 0) {
			System.out.println(x + " is valid");
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		search(a, 4);
		searchRecusion(a, 0, a.length, 3);
	}

}
