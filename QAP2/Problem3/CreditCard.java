package Problem3;

public class CreditCard {
    //instance variables
    private Person owner;
    private Money balance;
    private Money creditLimit;

    //Constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0, 0);
    }

    //Getters and Setters
    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    //Charge money to card (Use the add method creted earlier)
    public void charge(Money amount) {
        // Check if the charge exceeds the credit limit
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    //Make a payment with card (Use the subtract method created earlier)
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    //Change to string
    public String getPersonals() {
        return owner.toString();
    }
}
