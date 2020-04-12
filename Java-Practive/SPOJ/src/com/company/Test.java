package com.company;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int a[] = new int[10000]; int i = 0;
		 * while (true) { a[i] = sc.nextInt(); if (a[i] == 42) { sc.nextInt(); break; }
		 * i++; }
		 * 
		 * for (i = 0; i < a.length; i++) { if (a[i] != 0 && a[i] != 42) {
		 * System.out.println(a[i]); } else { break; } }
		 */
		
        Scanner sc =new Scanner(System.in);

        while(true)                 //This loop will always run till we break it from inside the loop
        {
            int ip=sc.nextInt();    //Taking input as an integer
            if(ip == 42)            //If input is 42 , break the loop
                break;
            System.out.println(ip); //else print that integer and continue the loop
        }
	}

}
