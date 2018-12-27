package oOPSConceptPart2;

public class HSBCBank implements USBank, BrazilBank{ // this is called  multiple inheritance -- two parents  
	// this is also called is a relationship
	// if a class is implementing from Interface its mandatory to define/override all the methods of interface
	// a class can implement various interfaces
	
	
	//overriding from USBank
	public void credit() {
		System.out.println("HSBC Credit");
	}
	public void debit() {
		System.out.println("HSBC debit");	
	}
	public void transfermoney() {
		System.out.println("HSBC transfermoney");
	}
	//Separate methods of HSBCbank
	public void eduloan() {
		System.out.println("HSBC eduloan");
	}
	public void carloan() {
		System.out.println("HSBC carloan");
	}
	//overriding from BrazilBank
	public void MutualFunds() {
		System.out.println("HSBC mutualfund");		
	}
}
