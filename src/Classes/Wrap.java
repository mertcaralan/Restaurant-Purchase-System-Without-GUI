package Classes;

import java.util.Scanner;

public class Wrap extends Food{

	private int wrapChoice;

	 public Wrap(String isSpicy) {
        super(isSpicy);
    }

	@Override
    public String getDescription() {
        return "Wrap: A delicious meal wrapped in a tortilla.";
    }

	@Override
    public String toString() {
        return super.toString() + 
		"\n Wrap Name : " + this.getName() +
		"\n Wrap Price : " + this.getPrice(); 
		
    }

	@Override
	public void getInput()
	{	

		Scanner scanner = new Scanner(System.in);

		System.out.println("What would you like to order [ Vegan Wrap (1) / Chicken Wrap (2) / Meat Wrap (3) / Ceaser Wrap (4) ] : ");
		wrapChoice = scanner.nextInt();
		scanner.nextLine();
		switch(wrapChoice){
			case 1:
				super.setName("VEGAN WRAP");
				super.setPrice(150);
				break;
			case 2:
				super.setName("CHICKEN WRAP");
				super.setPrice(140);
				break;
			case 3:
				super.setName("MEAT WRAP");
				super.setPrice(200);
				break;
			case 4:
				super.setName("CAESAR WRAP");
				super.setPrice(185);
				break;
		}

		super.getInput();
	}

}
