package Shrava.ClassWorks.Inheritance;

// Inheritance example

class Subscription {
    String name;
    double price;

    public Subscription(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Subscription: " + name + ", Price: $" + price);
    }
}

class PremiumSubscription extends Subscription {
    double premiumFee;

    public PremiumSubscription(String name, double price, double premiumFee) {
        super(name, price);
        this.premiumFee = premiumFee;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Premium Fee: $" + premiumFee);
    }
}