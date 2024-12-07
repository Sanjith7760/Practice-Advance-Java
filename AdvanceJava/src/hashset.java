import java.util.*;
public class hashset {
     public static void main(String[] args) {
    	 HashSet hs = new HashSet();
    	 hs.add(45);
    	 hs.add(39);
    	 hs.add(65);
    	 hs.add(72);
    	 hs.add(18);
    	 hs.add(34);
    	 hs.add(76);
    	 hs.add(18);
    	 hs.add(39);
    	 System.out.println(hs);
    	 System.out.println(hs.size());
    	 for(Object x: hs) {
    		 System.out.print(x+" ");
    	 }
    	 System.out.println();
    	 Iterator itr = hs.iterator();
    	 while(itr.hasNext()) {
    		 System.out.print(itr.next()+" ");
    	 }
    	 System.out.println();
    	 HashSet hs1 = new HashSet();
    	 hs1.add(100);
    	 hs1.add(120);
    	 hs1.add(112);
    	 hs1.add(99);
    	 hs1.add(65);
    	 hs1.add(112);
    	 hs1.add(100);
    	 hs1.add(65);
    	 hs1.add(45);
    	 System.out.println(hs1);
    	 System.out.println(hs1.size());
    	 System.out.println();
    	 
    	 hs.addAll(hs1);
    	 System.out.println(hs);
    	 System.out.println(hs.containsAll(hs1));
    	 System.out.println(hs.remove(100));
    	 System.out.println(hs);
    	 
    	 
    	 hs1.retainAll(hs);
    	 System.out.println(hs1);
    	 System.out.println(hs.removeAll(hs1));
     }
}
