package oOPSConceptPart2;

public interface USBank {
	
	int min_bal =200;
	
	public void credit();
	public void debit();
	public void transfermoney();
	
	// only methods are declared in inheritance can not write method body
	// in inheritance we can declare variable, variables are default static in nature
	// variable values can not be changed
	// no main method in inheritance
	// we can not create object of inheritance, inheritance is abstract in nature.

}
