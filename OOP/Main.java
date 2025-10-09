package Shrava.ClassWorks.OOP;

public class Main {

    public static void main(String[] args) {
        // Создаём обычную подписку
        Subscription basic = new Subscription("Basic Plan", 9.99);
        basic.displayInfo();

        System.out.println();

        // Создаём премиум подписку
        PremiumSubscription premium = new PremiumSubscription("Premium Plan", 9.99, 5.00);
        premium.displayInfo();
    }
}

// Базовый класс
class Subscription {
    private String name;   // инкапсуляция — делаем поля private
    private double price;

    public Subscription(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттеры и сеттеры для инкапсуляции
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public void displayInfo() {
        System.out.println("Subscription: " + name + ", Price: $" + price);
    }
}

// Наследование
class PremiumSubscription extends Subscription {
    private double premiumFee;  // тоже инкапсулируем

    public PremiumSubscription(String name, double price, double premiumFee) {
        super(name, price);
        this.premiumFee = premiumFee;
    }

    public double getPremiumFee() { return premiumFee; }
    public void setPremiumFee(double premiumFee) { this.premiumFee = premiumFee; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Premium Fee: $" + premiumFee);
    }
}
