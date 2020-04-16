package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//static array >> in this size is fixed
		int a[] = new int[3];
		
		//dynamic array -- ArrayList
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. Synchronized
		//4. allows you to random access to fetch any element as it stores values on the basis of index
		
		ArrayList ar = new ArrayList(); //non-generic(no specific data type) array list
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size()); // get size of array
		System.out.println("============");
		
		ar.add(40);
		ar.add(50); // index = 4
		
		System.out.println(ar.size());
		System.out.println("============");
		
		System.out.println(ar.get(4)); // to get the value from an index
		System.out.println("============");
		
		//to get all the values of array
		//1. using for loop
		//2. using iterator
		
		for (int i = 0 ; i < ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("============");
			
		// non generic vs generic: available after jdk 1.5
		ar.add(12.33);
		ar.add("Test");
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println("============");
		
		//store specific data type in ArrayList >> this is using generic ArrayList
		ArrayList<Integer> ar1 = new ArrayList(); //generic ArrayList
		//ar1.add("Test");
		ar1.add(100);
		
		ArrayList<String> ar2 = new ArrayList(); //generic ArrayList
		ar2.add("Test");
		//ar2.add(100);
		
		//employee class Objects:
		Employee e1 = new Employee("Kamlesh", 27 , "QA");
		Employee e2 = new Employee("Deepak", 28 , "Dev");
		Employee e3 = new Employee("Pintu", 29 , "Support");
		
		//create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("============");
		
		//***********************
		
		//addall method
		ArrayList<String> ar5 = new ArrayList(); //generic ArrayList
		ar5.add("Test");
		ar5.add("Selenium");
		
		ArrayList<String> ar6 = new ArrayList(); //generic ArrayList
		ar6.add("Good");
		ar6.add("Idea");
		
		ar5.addAll(ar6); //To merge Different ArrayList
		
		for (int i = 0 ; i < ar5.size() ; i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("============");
		
		//removeAll:
		ar5.removeAll(ar6);
		for (int i = 0 ; i < ar5.size() ; i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll()
		ArrayList<String> ar7 = new ArrayList(); //generic ArrayList
		ar7.add("Test");
		ar7.add("Selenium");
		
		ArrayList<String> ar8 = new ArrayList(); //generic ArrayList
		ar8.add("Test");
		ar8.add("Good");
		ar8.add("Idea");
		
		
		ar7.retainAll(ar8); //only common value get print
		
		for (int i = 0 ; i < ar7.size() ; i++) {
			System.out.println(ar7.get(i));
		}
	}

}
