package Core;

import java.util.Scanner;

public class GCD {
   public static int gcd(int a,int b) {
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Finding the Greatest Common Diviser");
		System.out.println("Enter the firs No.:");
		int a=sc.nextInt();
		System.out.println("Enter the second No.:");
		int b=sc.nextInt();
		int ans=gcd(a,b);
		System.out.println("the Greatest Common Diviser of both No.: "+ans);
		
	}
}
