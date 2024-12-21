package Classes;

import java.util.Scanner;

public class HotDrink extends Drink{
	
	private int hotDrinkChoice;
	
	public HotDrink() {
	}

	@Override
    public String getDescription() {
        return "Hot Drink: A warm and soothing beverage.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Tea (1) / Coffee (2) / Hot Chocolate (3) / Salep (4) ] : ");
		hotDrinkChoice = scanner.nextInt();

		switch(hotDrinkChoice){
			case 1:
				super.setName("TEA");
				super.setPrice(25);
				break;
			case 2:
				super.setName("COFFEE");
				super.setPrice(80);
				break;
			case 3:
				super.setName("HOT CHOCOLATE");
				super.setPrice(75);
				break;
			case 4:
				super.setName("SALEP");
				super.setPrice(100);
				break;
		}

		super.getInput();
	}

	@Override
	public String toString() {
		return super.toString() + 
		"\n Hot Drink Name : " + this.getName() +
		"\n Hot Drink Price : " + this.getPrice(); 
	}

}
