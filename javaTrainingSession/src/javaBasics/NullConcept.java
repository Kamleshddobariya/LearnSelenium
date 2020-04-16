package javaBasics;

public class NullConcept {

	static Object obj;
	static String str;
	
	public static void main(String[] args) {
		
		//1. case sensitive
		//null is keyword >> always in lowercase
		//Object obj = null;
		
		//2. default ref value will be null
		System.out.println(obj);
		System.out.println(str);
		
		//3. 
//		Integer i = null;
//		int j = i ;
		
		//4. instance of
		Integer i = null;
		Integer j = 10;
		
		System.out.println(j instanceof Integer);
		System.out.println(i instanceof Integer);
		
		//4. static vs non static
		NullConcept obj = null;
		//obj.send();
		obj.sum();
		
		//5. == and !=
		System.out.println(null == null);
		System.out.println(null != null);
		
		//6. 
		String str1 = null;
		Integer i1 = null;
		Double d1 = null;
		
		String s1 = (String) null;
		System.out.println(s1 + "Kamlesh");
		
		
	}
	
	public static void sum() {
		System.out.println("sum");
	}
	
	public void send() {
		System.out.println("send");
	}
}
