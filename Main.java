abstract class absss {
    protected double amount;

    public absss(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}

// Интерфейс Refundable
interface Refundable {
    void processRefund();
}

// Подкласс CreditCardPayment
class CreditCardPayment extends absss {

    public CreditCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Verifying card details...");
        System.out.println("Charging $" + amount + " to the credit card.");
        System.out.println("Credit card payment successful!");
    }
}

// Подкласс PayPalPayment, который также реализует интерфейс Refundable
class PayPalPayment extends absss implements Refundable {

    public PayPalPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("Verifying PayPal account...");
        System.out.println("Transferring $" + amount + " through PayPal.");
        System.out.println("PayPal payment successful!");
    }

    @Override
    public void processRefund() {
        System.out.println("Processing PayPal refund...");
        System.out.println("Returning $" + amount + " to the customer's PayPal account.");
        System.out.println("Refund successful!");
    }
}

// Тест-класс
public class Main {
    public static void main(String[] args) {
        absss creditCard = new CreditCardPayment(100.0);
        creditCard.processPayment();

        System.out.println();

        PayPalPayment paypal = new PayPalPayment(75.0);
        paypal.processPayment();
        paypal.processRefund();
    }
}
