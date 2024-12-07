
public class ThreadAndRunnable1  {

	public static void main(String[] args) {
		Printing pr = new Printing();
		Addition ad = new Addition();
		Searching sr = new Searching();
		
		
//		pr.print();  Achieve single threading, 
//		ad.add();
//		sr.search();
		
		//This is for Thread class
//		pr.run();     Achieve single threading
//		ad.run();
//		sr.run();
		
		//Achieves Multi Threading
		//pr.start();  //call run() internally
		//ad.start();  //call run() internally
		//sr.start();   //call run() internally
		
		//This is for Runnable class
		Thread t1=new Thread(pr);
		Thread t2=new Thread(ad);
		Thread t3=new Thread(sr);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
