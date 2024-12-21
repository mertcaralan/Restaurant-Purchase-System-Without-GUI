package Classes;

public class Drink extends Meal{

	public Drink() {
	}

	@Override
    public String getDescription() {
        return "Drink: A refreshing beverage to accompany your meal.";
    }

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public void getInput() {
		super.getInput();
	}
}
