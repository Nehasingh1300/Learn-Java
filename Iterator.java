package advJava;

import java.util.*;
public class IteratorDemo {
	public static void main(String args[]) {
		Set<String> newSet = new HashSet<String>();
		newSet.add("1");
		newSet.add("2");
		newSet.add("3");
		
		Iterator<String> itr = newSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr.remove();
		
		for(String var:newSet) {
			System.out.println(var);
		}
	}
}
/*
1
2
3
1
2
*/
