package Classes;

import java.util.Scanner;

public class Dessert extends Meal{

	private int dessertChoice;
	
	public Dessert() {
	}

	@Override
    public String getDescription() {
        return "Dessert: A sweet treat to end your meal.";
    }

	@Override
	public void getInput(){

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Ice Cream (1) / Dubai Chocolate (2) / Donut (3) / Baklava (4) ] : ");
		dessertChoice = scanner.nextInt();

		switch(dessertChoice){
			case 1:
				super.setName("ICE CREAM");
				super.setPrice(70);
				break;
			case 2:
				super.setName("DUBAI CHOCOLATE");
				super.setPrice(450);
				break;
			case 3:
				super.setName("DONUT");
				super.setPrice(100);
				break;
			case 4:
				super.setName("BAKLAVA");
				super.setPrice(240);
				break;
		}

		super.getInput();
	}
	
	@Override
	public String toString() { 
		return super.toString() + 
		"\n Dessert Name : " + this.getName() +
		"\n Dessert Price : " + this.getPrice(); 
	}

}