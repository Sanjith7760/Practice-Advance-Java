
public class ThreadsAndRunnable2 {

	public static void main(String[] args) {
		
		Activities a1 = new Activities();
		Activities a2 = new Activities();
		Activities a3 = new Activities();
		
		a1.setName("ADD");
		a2.setName("PRINT");
		a3.setName("SEARCH");
		
		a1.start();
		a2.start();
		a3.start();
	}
}
