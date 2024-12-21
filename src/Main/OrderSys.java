package Main;

import Classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderSys {
    public static ArrayList<Order> orders = new ArrayList<>();
    public static int totalCount = 0;
    public static double totalPrice = 0;

    public static void addOrder() {
        Customer customer = new Customer();
        customer.getInput();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + customer.get_NameSurname());

        while (true) { 
            Order order = new Order(customer);

            System.out.println("What would you like to order [ Food (F) / Drink (D) / Sauce (S) / Dessert (T) / Complete (C) ] : ");
            String menuChoice = scanner.next();

            if(menuChoice.equalsIgnoreCase("C")){
                break;
            }else{
                Meal meal = null;

                switch(menuChoice){
                    case "F":
                        System.out.println("What would you like to order [ Burger (B) / Wrap (W) / Snack (S) ] : ");
		                String foodChoice = scanner.next();
                        
                        System.out.println("Do you want your food spicy [ Y / N ]: ");
		                String isSpicy = scanner.next();

                        switch(foodChoice){
                            case "B":
                                meal = new Burger(isSpicy);
                                break;
                            case "W":
                                meal = new Wrap(isSpicy);
                                break;
                            case "S":
                                meal = new Snack(isSpicy);
                                break;
                        }
                    break;
                    case "D":
                        System.out.println("Do you want your drink cold or hot [ C / H ] : ");
		                String isColdHotChoice = scanner.next();

                            switch(isColdHotChoice){
                                case "C":
                                    meal = new ColdDrink();
                                    break;
                                case "H":
                                    meal = new HotDrink();
                                    break;
                            }
                        break;
                    case "S":
                            meal = new Sauce();
                        break;
                    case "T":
                            meal = new Dessert();
                        break;
                }
                meal.getInput();

                meal.setPrice(calculatePrice(meal));
                totalCount += meal.getCounter();
                totalPrice += meal.getPrice() * meal.getCounter();

                order.addMeal(meal);
            }
                orders.add(order);

                System.out.println("Would you like to continue ordering [ Y / N ] : ");
                String continueCheck = scanner.next();

                if(continueCheck.equalsIgnoreCase("N")){
                    break;
                }
            }
            
    }
    
    public static String displayOrders() {
    StringBuffer text = new StringBuffer();

    text.append("Total Orders: ").append(orders.size()).append("\n");
    text.append("======================================\n");

    double grandTotal = 0;

    for (Order order : orders) {
        text.append("Order ID: ").append(order.getOrderID()).append("\n");
        text.append(order.toString()).append("\n");
        grandTotal += order.getOrderPrice();
    }

    text.append("======================================\n");
    text.append("Grand Total: ").append(String.format("%.2f", grandTotal)).append(" TL\n");

    return text.toString();
}

    public static Order searchOrderByOrderID(int orderID) {
        for (Order order : orders) {
            if (order.getOrderID() == orderID) {
                return order;
            }
        }
        return null;
    }

    public static boolean deleteOrder(int orderID) {
        return orders.remove(searchOrderByOrderID(orderID));
    }

    public static double calculatePrice(Meal meal) {
        double price = meal.getPrice();
        String size = meal.getSize();

        switch (size.toUpperCase()) {
            case "S":
                price *= 0.85;
                break;
            case "M":
                price *= 1;
                break;
            case "L":
                price *= 1.15;
                break;
            default:
                System.out.println("Invalid size: " + size);
        }

        return price;
    }

}