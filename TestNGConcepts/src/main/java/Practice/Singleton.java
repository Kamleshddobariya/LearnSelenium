package Practice;

public class Singleton {

	// singleton has only one object
	// In OOP, singleton class is a class having only one object or instance at a
	// time
	// How to design singleton class:
	// 1. make constructor as private
	// 2. write a static method that has return type object of this singleton class
	// >> This also call lazy initialization

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Hey I am using singleton";

	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();

		return singleton_instance;

	}

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}
