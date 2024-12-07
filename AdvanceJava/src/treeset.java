import java.util.*;
public class treeset {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number of elements: ");
         int n= sc.nextInt();
         sc.nextLine();
         
         TreeSet<Integer> ts = new TreeSet<>();
         System.out.println("Enter an array of elements: ");
         for(int i=0;i<n;i++) {
        	 ts.add(sc.nextInt());
         }
         System.out.println(ts.size());
         
         for(int num: ts) {
        	 System.out.print(num+" ");
         }
         while(!ts.isEmpty()) {
        	 System.out.print(ts.pollLast()+" ");
         }
         
	}

}
