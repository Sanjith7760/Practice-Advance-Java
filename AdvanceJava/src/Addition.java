import java.util.*;
public class Addition implements Runnable {
     //void add()
	@Override
	public void run(){
    	 try {
         Scanner sc=new Scanner(System.in);
         System.out.println("Addition activity started");
         System.out.println("Enter the first number");
         int a=sc.nextInt();
         System.out.println("enter the second number");
         int b=sc.nextInt();
         int c=a+b;
         Thread.sleep(2000);
         System.out.println("The result is: "+c);
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }finally {
             System.out.println("Addition activity is ended");
		}               
     }
}
