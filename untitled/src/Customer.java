import java.util.List;
import java.util.ArrayList;

public class Customer {
    // attributes declaration
    private int customerID;
    private String name;
    private String address;
    private List<Order> orders;

    public Customer(int customerID, String name, String address) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("New Order Placed");
    }

    public void displayOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
