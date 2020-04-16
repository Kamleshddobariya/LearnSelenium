package OOPConceptPart2;

public abstract class AbstractionConcept {

	//no method body
	//partial abstraction
	//hiding implementation logic
	
	public abstract void loan();
	
	
	public void credit() {
		System.out.println("Bank--Credit");
	}
	
	public void debit() {
		System.out.println("Bank---debit");
	}
}
