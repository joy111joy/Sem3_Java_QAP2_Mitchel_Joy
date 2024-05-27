package Problem3;

public class Money {
    //Instance variables
    private long dollars;
    private long cents;

    //Constructor
    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    //Copy Constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }
    
    //Getters and Setters
    public long getDollars() {
        return dollars;
    }

    public void setDollars(long dollars) {
        this.dollars = dollars;
    }

    public long getCents() {
        return cents;
    }

    public void setCents(long cents) {
        this.cents = cents;
    }

    //Methods to add money. Changes dollars to cents and then back to dollars for easier addition
    public Money add(Money other) {
        //change everything to cents
        long totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        long newDollars = totalCents / 100;
        long newCents = totalCents % 100;
        return new Money(newDollars, newCents);
    }

    //Method to subract money. Chnages dollars to cents and then back to dollars for easier subtraction

    public Money subtract(Money other) {
        // change everthing to cents
        long totalCents = this.dollars * 100 + this.cents - (other.dollars * 100 + other.cents);
        long newDollars = totalCents / 100;
        long newCents = totalCents % 100;
        return new Money(newDollars, newCents);
    }

    // Methods to compare
    public int compareTo(Money other) {
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = other.dollars * 100 + other.cents;

        if (thisTotalCents < otherTotalCents) {
            return -1; // Less than other amount
        } else if (thisTotalCents > otherTotalCents) {
            return 1; // Greater than other amount
        } else {
            return 0; // Equal to other amount
        }
    }

    //Methods to figure if two amount equal one another 
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Money other = (Money) obj; // Cast obj to Money
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    //Changes to string 
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}

