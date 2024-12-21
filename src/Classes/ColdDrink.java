package Classes;

import java.util.Scanner;

public class ColdDrink extends Drink{

	private int coldDrinkChoice;

	public ColdDrink() {
	}

	@Override
    public String getDescription() {
        return "Cold Drink: A chilled beverage to refresh you.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Coca Cola (1) / Fanta (2) / Sprite (3) / Ice tea (4) ] : ");
		coldDrinkChoice = scanner.nextInt();

		switch(coldDrinkChoice){
			case 1:
				super.setName("COCA COLA");
				super.setPrice(40);
				break;
			case 2:
				super.setName("FANTA");
				super.setPrice(40);
				break;
			case 3:
				super.setName("SPRITE");
				super.setPrice(40);
				break;
			case 4:
				super.setName("ICE TEA");
				super.setPrice(40);
				break;
		}

		super.getInput();
	}

	@Override
	public String toString() {
		return super.toString() + 
		"\n Cold Drink Name : " + this.getName() +
		"\n Cold Drink Price : " + this.getPrice(); 
	}

}
