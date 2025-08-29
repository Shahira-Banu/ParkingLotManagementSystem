package shahira;

public class payment {
    private int paymentId;
    private int vehicleId;
    private double amount;

    public payment(int paymentId, int vehicleId, double amount) {
        this.paymentId = paymentId;
        this.vehicleId = vehicleId;
        this.amount = amount;
    }

    public String toString() {
        return "Payment ID: " + paymentId + ", Vehicle ID: " + vehicleId + ", Amount: " + amount;
    }
}
