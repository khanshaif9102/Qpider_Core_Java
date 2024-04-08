package Core;

import java.util.Scanner;

public class fibonacci_ser {
	public static void main(String[] args) {
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		System.out.print(a+" , "+b+" , ");
		int num;
		for(int i=2;i<n;i++) {
			num=a+b;
			a=b;
			b=num;
			System.out.print(num+" , ");
		}
	}
}
