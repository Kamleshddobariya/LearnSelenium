package OOPConceptPart1;

public class LocalVsGlobalVariables {

	// global variable are initialized immediately after class
	// scope of global variable is throughout the class
	// to access global variable we have to create object

	String name = "Rushabh";
	int age = 35;

	public static void main(String[] args) {

		int i = 10; // local variable
		System.out.println(i);

		LocalVsGlobalVariables Obj = new LocalVsGlobalVariables();
		System.out.println(Obj.name);
		System.out.println(Obj.age);

		int ans = Obj.sum();
		System.out.println(ans);
	}

	public int sum() {
		int i = 10; // local variable
		int j = 20; // local variable
		int sum = i + j;

		return sum;
	}
}
