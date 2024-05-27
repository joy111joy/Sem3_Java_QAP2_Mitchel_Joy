package Problem3;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    // Constructor
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // Getter for street
    public String getStreet() {
        return street;
    }

    // Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }

    // Getter for state
    public String getState() {
        return state;
    }

    // Setter for state
    public void setState(String state) {
        this.state = state;
    }

    // Getter for zipcode
    public String getZipcode() {
        return zipcode;
    }

    // Setter for zipcode
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    // toString method to return a formatted address
    public String toString() {
        return street + ", " + city + ", " + state + "\n" + zipcode;
    }
    
}

