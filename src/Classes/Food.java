package Classes;

public class Food extends Meal{
	
	private String isSpicy;

	public Food(String isSpicy) {
		this.isSpicy=isSpicy;
	}
	
	@Override
    public String getDescription() {
        return "Food: A generic meal item.";
    }

	@Override
	public String toString() {
		String text = super.toString() + "\n Your Food is ";
		if(isSpicy.equalsIgnoreCase("y")){
			text += "Spicy";
		}else{
			text += "NOT Spicy";
		}
		return text;
	}
	
	@Override
	public void getInput() {
		super.getInput();
	}
}
