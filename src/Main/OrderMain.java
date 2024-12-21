package Main;
import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {

        OrderSys.addOrder();

        System.out.println(OrderSys.displayOrders());
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to delete an order ?");
        String check = scanner.next();
        if(check.equalsIgnoreCase("Y")){
            System.out.println("Which order would you like to delete ?");
            int orderID = scanner.nextInt();

            OrderSys.deleteOrder(orderID);

            System.out.println(OrderSys.displayOrders());
        }else{
            System.out.println("Goodbye ! ");
        }
        
    }

}
