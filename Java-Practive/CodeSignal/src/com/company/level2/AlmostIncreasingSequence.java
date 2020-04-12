package com.company.level2;

public class AlmostIncreasingSequence {

	public static void main(String[] args) {
		int[] sequence = {10,1,2,3,4,5,6,7,8,9};
		System.out.println(almostIncreasingSequence(sequence));
	}

	static boolean almostIncreasingSequence(int[] sequence) {
//		int count = 0;
//		for (int i = 0; i < sequence.length - 1; i++) {
//			if (sequence[i] >= sequence[i + 1]) {
//				if (i + 1 == sequence.length - 1) {
//					count++;
//				} else if (sequence[i] >= sequence[i + 2]) {
//					count = 2;
//				} else {
//					count++;
//				}
//			}
//		}
//		return count <= 1;

		int count = 0;
		for (int i = 0; i < sequence.length - 1; i += 1)
			if (sequence[i] >= sequence[i + 1])
				if (i == 0)
					count += 1;
				else if (i + 1 == sequence.length - 1)
					count += 1;
				else {
					if (sequence[i] < sequence[i + 2] || sequence[i - 1] < sequence[i + 1])
						count += 1;
					else
						count = 2;
				}
		return count <= 1;
	}
}
