package OOPConceptPart1;

public class CallByValueAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValueAndCallByRef Obj = new CallByValueAndCallByRef();

		int x = 10;
		int y = 20;

		int ans = Obj.testSum(x, y);
		System.out.println(ans);

		Obj.p = 50;
		Obj.q = 60;

		Obj.swap(Obj);

		System.out.println("p = " + Obj.p);
		System.out.println("q = " + Obj.q);
	}

	// calling method by value or pass by value
	public int testSum(int a, int b) {
//		a = 30;
//		b = 40;
		int c = a + b;
		return c;
	}

	// call by reference
	public void swap(CallByValueAndCallByRef t) {
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // p = 60
		t.q = temp;

	}

}
