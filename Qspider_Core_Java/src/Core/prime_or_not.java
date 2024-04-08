package Core;

import java.util.Scanner;

public class prime_or_not {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to check prime or not");
		int n=sc.nextInt();
		if(prime(n)) {
			System.out.println(n+" is a prime no");
		} else {
			System.out.println(n+" is not a prime no");
		}
	}
	public static boolean prime(int num) {
		if(num<=0) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
