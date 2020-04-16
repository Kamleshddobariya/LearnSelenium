package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		System.out.println(USBank.min_bla);

		HDFCBank h = new HDFCBank();

		h.credit();
		h.debit();
		h.transferMoney();
		h.educationloan();
		h.carLoan();

		System.out.println("==========");
		h.mutualFund();

		System.out.println("==========");

		// dynamic polymorphism
		// child class object can be referred by parent interface
		// only overridden method can be called in this case.

		USBank ub = new HDFCBank();
		ub.credit();
		ub.debit();
		ub.transferMoney();

	}

}
