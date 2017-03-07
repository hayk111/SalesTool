package pack1;

public class Main {

	public static void main(String[] args) {
		SalesData sd = new SalesData();
		
		displayGreeting();
		sd.display();
	}
	
	public static void displayGreeting() {
		System.out.println("HELLO HAPPY SALES PEOPLE");
		System.out.println("THIS APP SHOWS SALE DATA");
	}

}
