package javaBasics;

public class SwitchConcept {

	public static void main(String[] args) {
		
		SwitchConcept sw = new SwitchConcept();
		
		sw.enterday("Saturday");
		
	}
	
	public void enterday(String day){
		
		switch (day){
		case "Monday":
			System.out.println("Entered weekday is Monday");
			break;
		case "Tuesday":
			System.out.println("Entered weekday is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Entereed weekday is Wednesday");
			break;
		case "Thursday":
			System.out.println("Entereed weekday is Thursday");
			break;
		case "Friday":
			System.out.println("Entereed weekday is Friday");
			break;
		case "Saturday":
			System.out.println("Entereed weekday is Saturday");
			break;
		case "Sunday":
			System.out.println("Entereed weekday is Sunday");
			break;
		default:
			System.out.println("Please enter a valid day");
		
		}		
	}
	

}
