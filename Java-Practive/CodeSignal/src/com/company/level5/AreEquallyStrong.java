package com.company.level5;

public class AreEquallyStrong {

	public static void main(String[] args) {

	}

	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		if (yourLeft == friendsLeft && yourRight == friendsRight) {
			return true;
		} else if (yourLeft == friendsRight && yourRight == friendsLeft) {
			return true;
		}
		return false;
	}

	boolean areEquallyStrong1(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

		return yourLeft == friendsLeft && yourRight == friendsRight
				|| yourLeft == friendsRight && yourRight == friendsLeft;
	}

}
