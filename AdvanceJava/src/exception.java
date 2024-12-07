import java.util.*;
public class exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a =sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b =sc.nextInt();
		
		System.out.println(divide1(a,b));
		System.out.println(divide2(a,b));
	}
	public static int divide1(int a, int b) {
		if(b!=0) {
			return a/b;
		}
		else {
		  return 0;
		}
	}
	public static double divide2(int a, int b) {
		try {
			return a/b;
		}
		catch(Exception e) {
			return 0;
		}
	}
}
