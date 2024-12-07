
public class Printing implements Runnable {
    //void print() 
	@Override
	public void run(){
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
}
