package mta.edu.vn;

public class MergeSort {

	static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid, right);
		}
	}

	// Merges two subarrays of array[]
	// First subarray is array[l..m]
	// Second subarray is array[m+1..r)
	static void merge(int a[], int left, int mid, int right) {

		// Find sizes of two subarrays to be merged
		int n = mid - left + 1;
		int m = right - mid;

		/* Create temp arrays */
		int L[] = new int[n];
		int R[] = new int[m];

		/* Copy data to temp arrays */
		for (int i = 0; i < n; i++) {
			L[i] = a[left + i];
		}
		for (int j = 0; j < m; j++) {
			R[j] = a[mid + 1 + j];
		}

		/* Merge the temp arrays */

		// Initial index of merged subarry array
		int i = 0, j = 0;
		int k = left;
		while (i < n && j < m) {
			if (L[i] <= R[j]) {
				a[k] = L[i];
				i++;
			} else {
				a[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining element of L[] if any */
		while (i < n) {
			a[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining element of R[] if any */
		while (j < m) {
			a[k] = R[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int[] a = { 23, 6, 44, 22, 8, 5, 11, 40, 34, 18 };
		mergeSort(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
