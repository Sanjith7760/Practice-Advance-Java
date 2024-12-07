import java.util.*;
public class StackOverFlow {

	//Note: This program causes stackOverFlowError so we can handle the errors by catching the error
//	 static void display() {
//		 System.out.println("Inside the display method");
//		 display();
//	 }
//	public static void main(String[] args) {
//		display();
//	}    

	static void display() {
		try {
		 System.out.println("Inside the display method");
		 display();
		}
		catch(Error e) {
			System.out.println("Error is handled"); //The error is handled
		}
	 }
	public static void main(String[] args) {
		display();
	}  
}
