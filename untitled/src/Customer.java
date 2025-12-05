public class Customer {
    // attributes declaration
    private int customerID;
    private String name;
    private String address;
    Order order;

    public Customer(int customerID, String name, String address) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        this.order=order;
        System.out.println("New Order Placed");
    }

    public Order getOrder() {
        return order;
    }
    public void getOrderinfo(){
        System.out.println(order.getOrderID());
        order.displayOrderItems();
        System.out.println(order.getPrice());
    }
}
