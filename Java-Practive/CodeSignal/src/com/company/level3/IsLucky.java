package com.company.level3;

public class IsLucky {

	public static void main(String[] args) {
		String m = String.valueOf(1234);
		System.out.println(isLucky(1010));
	}

	boolean isLucky1(int n) {

	    String s = n+"";
	    int sum = 0;
	    
	    for(int i=0; i<s.length()/2; i++)
	        sum+=(s.charAt(i)-s.charAt(s.length()-1-i));
	    
	    return sum==0;
	}

	
	static boolean isLucky(int n) {
		int sum1 = 0;
		int sum2 = 0;
		String m = String.valueOf(n);
		int k = m.length() / 2;
		String[] array = String.valueOf((float) n / Math.pow(10, k)).split("[, ?.@]+");
		int i = array[0].length();
		int j = array[1].length();
		int n1 = Integer.parseInt(array[0]);
		int n2 = Integer.parseInt(array[1]);
		if (j < i) {
			array[1] = array[1] + "0";
		}
		int f = 0;
		while (f < k) {
			int s1 = n1 % 10;
			sum1 += s1;
			int s2 = n2 %10;
			sum2+=s2;
			n1/=10;
			n2/=10;
			f++;
		}
		return (sum1 == sum2) ? true : false;
	}

}
