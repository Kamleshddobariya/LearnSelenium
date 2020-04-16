package OOPConceptPart2;

public class HDFCBank implements USBank, BrazilBank { // Is - a relationship

	// Overriding from USBank
	public void credit() {
		System.out.println("HDFC credit rule");
	}

	public void debit() {
		System.out.println("HDFC debit");
	}

	public void transferMoney() {
		System.out.println("HDFC transfer");
	}

	public void educationloan() {
		System.out.println("HDFC education loan");
	}

	public void carLoan() {
		System.out.println("HDFC car load");
	}

	// multiple inheritance/interface
	// Overriding from BrazilBank
	public void mutualFund() {
		System.out.println("HDFC - mutualfund");

	}
}
