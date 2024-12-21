package Classes;

import java.util.Scanner;

public class Snack extends Food{

	private int snackChoice;

	public Snack(String isSpicy) {
		super(isSpicy);
		
	}

	@Override
    public String getDescription() {
        return "Snack: A light and crispy treat to enjoy.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ French Fries (1) / Nuggets (2) / Strips (3) / Onion Rings(4) ] : ");
		snackChoice = scanner.nextInt();

		switch(snackChoice){
			case 1:
				super.setName("FRENCH FRIES");
				super.setPrice(50);
				break;
			case 2:
				super.setName("NUGGETS");
				super.setPrice(80);
				break;
			case 3:
				super.setName("STRIPS");
				super.setPrice(80);
				break;
			case 4:
				super.setName("ONION RINGS");
				super.setPrice(75);
				break;
				
	}

	super.getInput();
}
@Override
public String toString() { 
	return super.toString() + 
	"\n Snack Name : " + this.getName() +
	"\n Snack Price : " + this.getPrice(); 
}

}