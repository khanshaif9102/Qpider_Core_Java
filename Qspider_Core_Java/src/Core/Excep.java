package Core;

public class Excep {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=10/0;
		}catch(Exception  e) {
			System.out.println("exception is :"+e.getMessage());
		}
	}
}
