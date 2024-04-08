package Core;

import java.util.Scanner;

public class calculator {
	public void opt(int n,int a,int b) {
		while(true) {
		
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5. exit");
		int opt=n;
		if(opt==5) {
			System.exit(0);
		}
		calculator obj=new calculator();
		obj.calc(opt,a,b);
		}
	}
	
	public void calc(int n, int a,int b) {
		switch(n) {
		case 1:
			int sum=a+b;
			System.out.println("The sum is: "+sum);
			break;
		case 2:
			int c=a-b;
			System.out.println("Substraction is :"+c);
			break;
		case 3:
			int mul=a*b;
			System.out.println("The mul is :"+mul);
			break;
		case 4:
			int div=a/b;
			System.out.println("the division is  :"+div);
			break;
		case 5:
			System.exit(0);
			default:
				System.out.println("please enter correct opt.");
				break;
			
		}
	}
	
	private void exit() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	calculator obj2=new calculator();
	while(true) {
		System.out.println("enter your option:");
		
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5. exit");
		
		obj2.opt(0, 0, 0);
	}
}
}
