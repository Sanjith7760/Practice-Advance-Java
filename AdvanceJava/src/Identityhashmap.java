import java.util.*;

public class Identityhashmap {
	public static void main(String[] args) {
		Map<String, String> hm= new HashMap<String, String>();
		Map<String, String> ihm= new IdentityHashMap<String, String>();
		
		String key1=new String("Key");
		String key2=new String("Key");
		
		hm.put(key1, "HashMapValue1");
		hm.put(key2, "HashMapValue2");
		
		ihm.put(key1, "IdentityHashMapvalue1");
		ihm.put(key2, "IdentityHashMapvalue2");
		
		System.out.println("HashMap -> "+hm); //hashmap compares based on values(equals)
		System.out.println("IdentityHashMap -> "+ihm); //identityHashMap compares based on the references(==)
	}
}
