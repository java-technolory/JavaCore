package mta.edu.vn;

public class RemoveDuplicate {

	static void remove(int a[], int k) {
		int n = a.length;
		if ((k < 0) || (k >= n)) {
			return;
		}
		a[k] = a[n - 1];
		n--;
	}

	static int n = 0;

	static void removeOrder(int a[], int k, RemoveDuplicate n) {
//		if ((k < 0) || (k >= n.n)) {
//			return;
//		}
		for (int i = k; i < n.n - 1; i++) {
			a[i] = a[i + 1];
		}
		--n.n;
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 1, 4, 2, 3, 2, 2, 3, 2, 5, 6 , 6};
		RemoveDuplicate r = new RemoveDuplicate();
		r.n = a.length;

		for (int i = 0; i < r.n - 1; i++) {
			if (a[i] == a[i + 1] && a[i] > 0 && a[i + 1] > 0) {
				a[i] = a[i + 1] = -1;
				removeOrder(a, i, r);
				removeOrder(a, i, r);
				i = -1;
				continue;
			}
		}

		for (int i = 0; i < r.n; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
