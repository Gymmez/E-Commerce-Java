import java.time.LocalDate;

public abstract class Payment implements Pay {
    protected int paymentId;
    protected LocalDate paymentDate;
    protected double amount;
    protected String method;

    public Payment(int paymentId, LocalDate paymentDate, double amount, String method) {
        this.paymentId = paymentId;
        this.paymentDate = paymentDate;
        this.amount = amount;
        this.method = method;
    }

    public abstract void makePayment(double amount);
    public abstract void printReceipt();
}
