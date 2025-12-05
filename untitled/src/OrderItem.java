public class OrderItem {
    String orderItemID;
    String itemName;
    double itemPrice;
    int count;
    public OrderItem(String orderItemID,String itemName,double itemPrice,int count){
        this.count=count;
        this.itemName=itemName;
        this.orderItemID=orderItemID;
        this.itemPrice=itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getCount() {
        return count;
    }

    public String getItemName() {
        return itemName;
    }

    public String getOrderItemID() {
        return orderItemID;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setOrderItemID(String orderItemID) {
        this.orderItemID = orderItemID;
    }
    public double totalprice(){
        return getCount()*getItemPrice();
    }
    public String toString(){
        return getCount()+ "x "+getItemName()+"  "+totalprice();
    }

}
