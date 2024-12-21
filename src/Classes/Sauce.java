package Classes;

import java.util.Scanner;

public class Sauce extends Meal{
	private int sauceChoice;

	public Sauce() {
	}

	@Override
    public String getDescription() {
        return "Sauce: A delicious condiment to enhance your meal.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Ketchup (1) / BBQ (2) / Mayonnaise (3) / Mustard (4) ] : ");
		sauceChoice = scanner.nextInt();
		
		switch(sauceChoice){
			case 1:
				super.setName("KETCHUP");
				super.setPrice(5);
				break;
			case 2:
				super.setName("BBQ");
				super.setPrice(7);
				break;
			case 3:
				super.setName("Mayonnaise");
				super.setPrice(5);
				break;
			case 4:
				super.setName("Mustard");
				super.setPrice(7);
				break;
		}

		super.getInput();
	}
	
	@Override
	public String toString() { 
		return super.toString() + 
		"\n Sauce Name : " + this.getName() +
		"\n Sauce Price : " + this.getPrice(); 
	}

}
