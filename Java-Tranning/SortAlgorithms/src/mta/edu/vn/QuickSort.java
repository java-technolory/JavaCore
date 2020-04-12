package mta.edu.vn;

public class QuickSort {

	static void quickSort(int a[], int left, int right) {
		if (left < right) {
			int pivot = partition(a, left, right);
			quickSort(a, left, pivot - 1);
			quickSort(a, pivot + 1, right);
		}
	}

	static int partition(int a[], int left, int right) {
		int pivot = a[left];
		int i = left + 1;
		int j = right;
		int tmp = 0;
		while (i <= j) {
			while ((i <= j) && (a[i] <= pivot)) {
				i++;
			}
			while ((i <= j) && (a[j] > pivot)) {
				j--;
			}
			if (i < j) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
			}
		}
		tmp = a[left];
		a[left] = a[j];
		a[j] = tmp;
		return j;
	}

	public static void main(String[] args) {
//		int[] a = { 23, 6, 44, 22, 8, 5, 11, 40, 34, 18 };
		int[] a = { 4, 3, 2, 2, 1, 1 };
//		int[] a = { 2, 6, 3, 7, 5, 4, 1 };
		quickSort(a, 0, a.length - 1);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
