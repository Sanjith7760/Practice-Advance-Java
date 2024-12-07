
public class garbage {
  public static void main(String[] args) {
	Runtime runtime = Runtime.getRuntime();
	System.out.println("Free Memory: "+runtime.freeMemory());
	int[] arr=new int[10000];
	System.out.println("Array is Created: ");
	System.out.println("Free Memory: "+runtime.freeMemory());
	System.gc();
	System.out.println("Called garbage collector: ");
	System.out.println("Free Memory: "+runtime.freeMemory());
  }
}
