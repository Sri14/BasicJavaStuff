package oOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		b.eduloan();
		b.carloan();
		b.MutualFunds();
		
		USBank b1 = new HSBCBank();
		b1.credit();
		b1.debit();
		b1.transfermoney();
	
		
	}

}
