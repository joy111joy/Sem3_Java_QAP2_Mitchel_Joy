package Problem3;

public class Person {
    //Instance variables for the person's information
    private String lastName;
    private String firstName;
    private Address address;


    //constructor
    public Person (String lastName, String firstName, Address address) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    //getters and setters
    public String getLast () {
        return lastName;
    }

    public void setLast (String lastName) {
        this.lastName = lastName;
    }

    public String getFirst () {
        return firstName;
    }

    public void setFirst (String firstName) {
        this.firstName = firstName;
    }

    public Address getAddress () {
        return address;
    }

    public void setAddress (Address address) {
        this.address = address;
    }
    //Change to string
    public String toString() {
        return firstName + " " + lastName + ", " + address.toString();
    }

    
}
