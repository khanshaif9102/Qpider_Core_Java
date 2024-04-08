package Core;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no to check odd or even");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a+" is even");
		}else {
			System.out.println(a+" is odd");
		}
	}
}
