import java.util.*;
public class treemap {

	public static void main(String[] args) {
		TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
		tm.put(4, 23);
		tm.put(6, 87);
		tm.put(2, 34);
		tm.put(3, 98);
		tm.put(1, 67);
		tm.put(7, 31);
		System.out.println(tm);
		System.out.println();
		System.out.println("Keys: ");
		Set set=tm.keySet();
		for(Object x:set) {
			System.out.println(x);
		}
		System.out.println("Values: ");
		Collection set1=tm.values();
		for(Object x:set1) {
			System.out.println(x);
		}
		System.out.println("Both keys and values: ");
		Set set2=tm.entrySet();
		for(Object x:set2) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("Using the class methods");
		TreeMap<Integer, StudentTreeMap> stm=new TreeMap<Integer, StudentTreeMap>();
		stm.put(3,new StudentTreeMap(21,"Sanjith"));
		stm.put(1,new StudentTreeMap(13,"Kiran"));
		stm.put(2,new StudentTreeMap(24,"Manoj"));
		System.out.println(stm);
		System.out.println("Keys: ");
		Set keys=stm.keySet();
		for(Object x:keys) {
			System.out.println(x);
		}
		System.out.println("Values: ");
		Collection value=stm.values();
		for(Object x:value) {
			System.out.println(x);
		}
		System.out.println("Both keys and values: ");
		Set keyVal=stm.entrySet();
		for(Object x:keyVal) {
			System.out.println(x);
		}
	}

}
