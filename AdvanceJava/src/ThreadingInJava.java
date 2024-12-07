
public class ThreadingInJava {

	public static void main(String[] args) {
		System.out.println("main method execution is started");
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setPriority(2);
		System.out.println(t);
		t.setName("SanjithThread");
		System.out.println(t);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		System.out.println("main method execution is ended");

	}

}
