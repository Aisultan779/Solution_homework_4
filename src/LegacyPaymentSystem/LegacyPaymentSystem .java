public class LegacyPaymentSystem {
    public void executeLegacyPayment(String currency, double value) {
        System.out.printf("[Legacy] Processed %s%.2f\n", currency, value);
    }
}