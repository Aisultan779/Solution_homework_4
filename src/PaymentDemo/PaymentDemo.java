public class PaymentDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentAdapter();
        processor.processPayment(49.99);
    }
}