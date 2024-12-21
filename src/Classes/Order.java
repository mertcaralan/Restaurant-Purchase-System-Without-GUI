package Classes;
import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Meal> meals;
    private double totalPrice;
    private double orderPrice;
	private int totalCount;
    private int orderID;
    private TotalDiscount discount;

    public Order(Customer customer) {
        this.customer = customer;
        this.meals = new ArrayList<>();
        this.totalPrice = 0;
		this.totalCount=0;
        this.orderID = generateRandomID();
        this.discount = new TotalDiscount();
    }

    private int generateRandomID() {
        int min = 1000;
        int max = 9999;
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public void addMeal(Meal meal) {
        this.meals.add(meal);
        this.orderPrice = meal.getPrice() * meal.getCounter();
        this.totalPrice += orderPrice;
		this.totalCount += meal.getCounter();
    }

    public void deleteMeal(Meal meal) {
        if (this.meals.remove(meal)) {
            this.totalPrice -= meal.getPrice() * meal.getCounter();
			this.totalCount -= meal.getCounter();
        }
    }

    public double calculateTotalPrice() {
        if (discount.isDiscountApplicable(totalPrice)) {
            double discountAmount = discount.calculateDiscount(totalPrice);
            totalPrice = totalPrice - discountAmount;
        }
        return totalPrice; 
    }

    // Getters
    public Customer getCustomer() {
        return customer;
    }

    public ArrayList<Meal> getMeals() {
        return meals;
    }

    public int getOrderID(){
        return orderID;
    }

    public double getOrderPrice(){
        return orderPrice;
    }

    @Override
    public String toString() {
    StringBuffer sb = new StringBuffer();
    sb.append("\nCustomer: ").append(customer.get_NameSurname());
    sb.append("Meals Ordered:\n");

    for (Meal meal : meals) {
        sb.append(meal.toString()).append("\n");
        sb.append("Total Meal Price: ").append(String.format("%.2f", meal.getPrice() * meal.getCounter())).append(" TL\n");
        sb.append(meal.getDescription()).append("\n");
        sb.append("--------------------------------------\n");
    }

    double discountedPrice = calculateTotalPrice();
    sb.append("Total Price (After Discount): ").append(String.format("%.2f", discountedPrice)).append(" TL\n");

    return sb.toString();
}
}
