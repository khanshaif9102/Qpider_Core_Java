package Core;

import java.util.Scanner;

public class swap_two_no {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no:");
		int a=sc.nextInt();
		System.out.println("enter second no");
		int b=sc.nextInt();
		
		//swapping two numbers using temp
		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("a=: "+a);
		System.out.println("b= "+b);
	}
}
