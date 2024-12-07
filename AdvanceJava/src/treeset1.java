import java.util.*;
public class treeset1 {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(55);
		t.add(59);
		t.add(38);
		t.add(74);
		t.add(71);
		t.add(69);
		t.add(79);
		System.out.println(t);
		
		System.out.println(t.subSet(30, false, 70, true));
		
		for(Object x:t) {
			System.out.print(x+" ");;
		}
		System.out.println();
		Iterator<Integer> itr = t.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		System.out.println("In Descending order:");
		Iterator<Integer> itr1 = t.descendingIterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}

		System.out.println();
		System.out.println(t.ceiling(71));
		System.out.println(t.ceiling(70));
		System.out.println(t.ceiling(60));
		System.out.println(t.ceiling(39));
		System.out.println(t.ceiling(56));
		System.out.println(t.floor(54));
		System.out.println();
		System.out.println(t.floor(37));
		System.out.println(t.floor(70));
		System.out.println(t.floor(72));
		System.out.println(t.headSet(69));
		System.out.println(t.tailSet(69));
		System.out.println(t.headSet(57));
		System.out.println(t.headSet(74));
		System.out.println(t.tailSet(74));
		System.out.println(t.headSet(38));
		System.out.println(t.tailSet(71));
		System.out.println(t.headSet(71));
		System.out.println();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(69);
		al.add(74);
		al.add(59);
		al.add(146);
		System.out.println(al);
		System.out.println(t);
		System.out.println(t.descendingSet());
		System.out.println(t.remove(146));
		System.out.println(t);
		t.remove(38);
		System.out.println(t.contains(120));
		System.out.println(t);
		
		al.addAll(t);
		System.out.println(al);
		al.removeAll(t);
		System.out.println(al);
		t.addAll(al);
		System.out.println(t);
		t.removeAll(al);
		System.out.println(t);
		
		
		System.out.println(al);
		al.retainAll(t);
		System.out.println(al);
		t.retainAll(al);
		System.out.println(t);
		
		
		
		
		
		
		
	}

}
