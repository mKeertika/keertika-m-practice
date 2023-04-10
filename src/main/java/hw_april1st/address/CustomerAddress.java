package hw_april1st.address;

public class CustomerAddress {
    private boolean isPrimaryAddress;
    private int streetNumber;
    private String streetName;
    private String city;
    private String state;

    //Constructor
    public CustomerAddress(boolean isPrimaryAddress, int streetNumber, String streetName, String city, String state) {
        this.isPrimaryAddress = isPrimaryAddress;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }
    //get full customer add
    public String customerAdd() {
           String address = "is this primary address" + isPrimaryAddress() + " " +getStreetNumber() + " " +
                   getStreetName() +
                    "\n" + getCity() + ", " + getState();
       // }
        return address;
    }
    //getters method
    public boolean isPrimaryAddress() {
        return isPrimaryAddress;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}
