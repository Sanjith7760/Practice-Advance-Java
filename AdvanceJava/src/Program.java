import java.util.*;
public class Program {

//	public static void main(String[] args) {
//		System.out.println("main method execution is started");
//        alpha();
//        System.out.println("main method execution is ended");
//	}
//	
//	static void alpha() {
//		try {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a numerator:");
//		int a=sc.nextInt();
//		System.out.println("Enter a denomenator:");
//		int b=sc.nextInt();
//		int c=a/b;
//		System.out.println("The division result is: "+c);
//		}
//		catch(Exception e) {
//			System.out.println("Exception is handeld");
//		}
//	}
	
	
	public static void main(String[] args) {
		try {
		System.out.println("main method execution is started");
        alpha();
		}
		catch(Exception e) {
			System.out.println("Exception is handeled");
		}
        System.out.println("main method execution is ended");
	}
	
	static void alpha() throws Exception{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numerator:");
		int a=sc.nextInt();
		System.out.println("Enter a denomenator:");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("The division result is: "+c);
		
	}

}
