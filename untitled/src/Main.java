//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer c=new Customer(555555555,"jimmy marawan ali","3nd rabena");
        OrderItem item=new OrderItem("44444","phone",5555,2);
        Order o=new Order("fuckniggaorder");
        o.placeItem(item);
        c.placeOrder(o);
        c.getOrderinfo();
    }
}