package Core;

import java.util.Scanner;

public class area_of_square {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side:");
		double side=sc.nextDouble();
		double area=side*side;
		System.out.println("area of square :"+area);
	}
}
