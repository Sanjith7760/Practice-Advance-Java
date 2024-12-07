import java.util.*;
public class Hashmap {

       public static void main(String[] args) {
//		HashMap<Integer, String> hm=new HashMap<Integer, String>();
//		hm.put(3, "sanjith");
//		hm.put(5, "kiran");
//		hm.put(2, "Manoj");
//		hm.put(6, "siddarth");
//		hm.put(1, "sandeep");
//		hm.put(4, "Ayush");
//		hm.put(3, "sanjith");
//		hm.put(6, "siddarth");
//		System.out.println(hm);
//		for(int i=1;i<=hm.size();i++) {
//			System.out.println(hm.get(i));
//		}		
//		Collection val=hm.keySet();
//		for(Object x:val) {
//			System.out.println(x);
//		}
//		Collection val1=hm.values();
//		for(Object x:val1) {
//			System.out.println(x);
//		}
//		Collection val2=hm.entrySet();
//		for(Object x:val2) {
//			System.out.println(x);
//		}
//		System.out.println();
//		Collection keyVal = hm.entrySet();
//		Iterator itr = keyVal.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
    			LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
    			hm.put(3, "sanjith");
    			hm.put(5, "kiran");
    			hm.put(2, "Manoj");
    			hm.put(6, "siddarth");
    			hm.put(1, "sandeep");
    			hm.put(4, "Ayush");
    			hm.put(3, "sanjith");
    			hm.put(6, "siddarth");
    			System.out.println(hm);
    			for(int i=1;i<=hm.size();i++) {
    				System.out.println(hm.get(i));
    			}		
    			Collection val=hm.keySet();
    			for(Object x:val) {
    				System.out.println(x);
    			}
    			Collection val1=hm.values();
    			for(Object x:val1) {
    				System.out.println(x);
    			}
    			Collection val2=hm.entrySet();
    			for(Object x:val2) {
    				System.out.println(x);
    			}
    			System.out.println();
    			Collection keyVal = hm.entrySet();
    			Iterator itr = keyVal.iterator();
    			while(itr.hasNext()) {
    				System.out.println(itr.next());
    			}
	}
}
