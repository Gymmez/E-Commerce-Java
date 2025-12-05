import java.util.List;

public class Customer {
    // attibutes declaration
    int CustomerID;
    String Name;
    String Address;
    List<Order> orders;
    public Customer(int CustomerID,String Name,String Address){
        this.CustomerID=CustomerID;
        this.Name=Name;
        this.Address=Address;
        orders=new List<Order>();
    }
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("New Order Placed");
    }
    public void displayOrders(){
        for(i in orders)
    }


}
