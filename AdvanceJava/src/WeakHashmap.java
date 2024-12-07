import java.util.*;
public class WeakHashmap {

	public static void main(String[] args) {
		Map<String, String> hm= new HashMap<String, String>();
		Map<String, String> whm= new WeakHashMap<String, String>();
		
		String key1=new String("HashMapkey");
		String key2=new String("WeakHashMapkey");
		
		hm.put(key1, "HashMapvalue");
		whm.put(key2, "WeakHashMapvalue");
		
		System.out.println("Before making key null");
		System.out.println("Before performing garbage collection");
		System.out.println("HashMap -> "+hm);
		System.out.println("WeakHashMap -> "+whm);
		
		key1=null;
		key2=null;
		
		System.gc();
		try {
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("After making key null");
		System.out.println("After performing garbage collection");
		System.out.println("HashMap -> "+hm);
		System.out.println("WeakHashMap -> "+whm);

	}

}
