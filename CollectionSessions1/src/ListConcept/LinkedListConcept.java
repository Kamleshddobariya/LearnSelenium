package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		LinkedList<String> ll = new LinkedList<String>();
		
		//add:
		ll.add("test");
		ll.add("qtp");
		ll.add("Selenium");
		ll.add("RFT");
		
		//print
		System.out.println("content of linkedlist: " + ll);
		
		ll.addFirst("Kamlesh");
		ll.addLast("Dobariya");
		
		//print
		System.out.println("content of linkedlist: " + ll);
		
		//get:
		System.out.println(ll.get(0));
		
		//set:
		ll.set(0, "Set New Value");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist: " + ll);
		
		//remove specific element
		ll.remove(2);
		System.out.println("content of linkedlist: " + ll);
		
		//how to print(iterate) all the elements
		//for loop
		
		System.out.println("--using for loop--");
		for (int i = 0 ; i < ll.size() ; i++) {
			System.out.println(ll.get(i));
		}
		
		
		//advance for loop
		System.out.println("--using advance for loop--");
		for(String str : ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("--using iterator--");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("--using while loop--");
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
