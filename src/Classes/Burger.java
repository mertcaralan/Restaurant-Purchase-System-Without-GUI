package Classes;

import java.util.Scanner;

public class Burger extends Food{

	private int burgerChoice;

	public Burger(String isSpicy) {
		super(isSpicy);
	}

	@Override
    public String getDescription() {
        return "Burger: A tasty sandwich with a patty and bun.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Hamburger (1) / Cheeseburger (2) / Fishburger (3) / Chickenburger (4) ] : ");
		burgerChoice = scanner.nextInt();

		switch(burgerChoice){
			case 1:
				super.setName("HAMBURGER");
				super.setPrice(250);
				break;
			case 2:
				super.setName("CHEESEBURGER");
				super.setPrice(240);
				break;
			case 3:
				super.setName("FISH BURGER");
				super.setPrice(300);
				break;
			case 4:
				super.setName("CHICKEN BURGER");
				super.setPrice(210);
				break;
		}

		super.getInput();
	}

	@Override
	public String toString() { 
		return super.toString() + 
		"\n Burger Name : " + this.getName() +
		"\n Burger Price : " + this.getPrice(); 
	}
}
