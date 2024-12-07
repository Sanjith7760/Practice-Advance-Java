import java.util.*;
public class Searching implements Runnable {
     //void search()
	@Override
	public void run(){
    	 try {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Searching activity is started");
		int[] arr= {10, 20, 30, 40, 50};
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				Thread.sleep(2000);
				System.out.println("Key found");
				return;
			}
		}
		Thread.sleep(2000);
		System.out.println("Key not found");
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 finally {
    		 System.out.println("Searching activity is ended");
    	 }
	}
}
