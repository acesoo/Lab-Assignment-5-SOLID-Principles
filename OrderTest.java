public class OrderTest {
    public static void main(String[] args) {
        // Core logic
        StandardOrderProcessor processor = new StandardOrderProcessor();
        processor.calculateTotal(10.0, 2);
        processor.placeOrder("John Doe", "123 Main St");

        // Optional/Add-on logic
        InvoiceGenerator invoiceGen = new FileInvoiceGenerator();
        invoiceGen.generateInvoice("order_123.pdf");

        NotificationService notifier = new EmailNotificationService();
        notifier.sendNotification("johndoe@example.com");
    }
}