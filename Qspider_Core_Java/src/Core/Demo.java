package Core;

import java.util.Scanner;

public class Demo {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the order of array");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements  of array:");
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		
		System.out.println("the elemetns are:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
		
	}
}
