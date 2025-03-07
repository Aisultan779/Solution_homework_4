public class PaymentAdapter implements PaymentProcessor {
    private LegacyPaymentSystem legacySystem;

    public PaymentAdapter() {
        this.legacySystem = new LegacyPaymentSystem();
    }

    @Override
    public void processPayment(double amount) {
        legacySystem.executeLegacyPayment("USD", amount);
    }
}