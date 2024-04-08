package Core;

import java.util.Scanner;

public class Area_of_Rectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of rect:");
		int length=sc.nextInt();
		System.out.println("enter the width of rect: ");
		int width=sc.nextInt();
		int area=length*width;
		System.out.println("area of rectangle is :"+area);
	}
}
