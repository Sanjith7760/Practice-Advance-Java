import java.util.Scanner;

public class Activities extends Thread {
	@Override
	public void run() {
		if(getName().equals("ADD")) {
		add();
		}
		else if(getName().equals("PRINT")) {
		print();
		}else {
		search();
		}
	}

	public void add(){
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
	
	public void print(){
    	try {
    	System.out.println("Printing activity started");
    	for(int i=0;i<=10;i++) {
    		System.out.println(i);
    		Thread.sleep(2000);
    	  }
    	} catch(Exception e ) {
    		e.printStackTrace();
    	}
    	System.out.println("Printing activity is ended");
    }
	
	public void search(){
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
