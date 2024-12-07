import java.util.*;

import javax.crypto.NullCipher;
public class exceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Program execution started:");
		System.out.println("Divide the 2 numbers");
		System.out.println("Enter the numerator");
		int a=sc.nextInt();
		System.out.println("Enter the Denomenator");
		int b=sc.nextInt();		
		int c=a/b;
		System.out.println(c);
		System.out.println();
		System.out.println("Again Divide the 2 numbers");
		System.out.println("Enter the numerator");
		int x=sc.nextInt();
		System.out.println("Enter the Denomenator");
		int y=sc.nextInt();		
		int z=x/y;
		System.out.println(z);
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is handled for  division");
		}
		System.out.println("Program executed normally");
		
	}

}
