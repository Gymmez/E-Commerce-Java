import java.util.ArrayList;
import java.util.List;

public class Order {
    String OrderID;
    List<OrderItem> orderItems;
    double Price;
    public Order(String OrderID){
        this.OrderID=OrderID;
        orderItems=new ArrayList<>();
    }

    public double getPrice() {
        return setPrice();
    }
    public void placeItem(OrderItem item){
        orderItems.add(item);
        System.out.println();
    }

    public String getOrderID() {
        return OrderID;
    }
    public void displayOrderItems() {
        for (OrderItem orderitem : orderItems) {
            System.out.println(orderitem.toString());
        }
    }
    public double setPrice(){
        double total=0;
        for (OrderItem orderitem : orderItems) {
            total+=orderitem.totalprice();
        }
        return total;
    }
}
