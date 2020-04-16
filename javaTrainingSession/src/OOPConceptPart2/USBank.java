package OOPConceptPart2;

public interface USBank {

	int min_bla = 100;

	// Only method declaration
	// No method body - only method prototype
	// we can declare the variables >> variables are by default static in nature
	// value of variable can't be changed
	// no static methods are allowed
	// no main method in interface
	// we can't create the object of interface means they are abstract in nature

	public void credit(); // only declaration no body

	public void debit();

	public void transferMoney();
}
