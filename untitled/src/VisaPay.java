import java.time.LocalDate;

public class VisaPay extends Payment{
    String holderName;
    String cardNumber;
    public VisaPay(int paymentId, LocalDate paymentDate, double amount,String holderName,String cardNumber,Customer customer){
        super(paymentId,paymentDate, amount, "Visa",customer);
        this.holderName=holderName;
        this.cardNumber=cardNumber;
    }
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " in Visa.");
    }

    @Override
    public void printReceipt() {

    }
}
