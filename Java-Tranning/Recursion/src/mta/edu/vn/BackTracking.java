package mta.edu.vn;

public class BackTracking {

	static boolean columnEmpty[];
	static boolean rowEmpty[];
	static boolean cheoNguoc[];
	static boolean cheoXuoi[];
	static int n = 8;
	static int result[];

	static void QuanHau(int j) {
		for (int i = 0; i < n; i++) {
			if (!columnEmpty[i] && !cheoNguoc[j + i] && !cheoXuoi[j - i + n]) {

				result[j] = i;

				columnEmpty[i] = true;
				cheoNguoc[j + i] = true;
				cheoXuoi[j - i + n] = true;

				if (j == n - 1) {
					for (int k = 0; k < n; k++) {
						System.out.print(result[k] + " ");
					}
					System.out.println();
//					return;
				}
				QuanHau(j + 1);
				columnEmpty[i] = false;
				cheoNguoc[j + i] = false;
				cheoXuoi[j - i + n] = false;

			}
		}
	}

	public static void main(String[] args) {
		int n = 8;
		int cheo = 2 * n - 1;
		columnEmpty = new boolean[n];
		cheoNguoc = new boolean[cheo];
		cheoXuoi = new boolean[cheo];
		result = new int[n];
		QuanHau(0);
	}

}
