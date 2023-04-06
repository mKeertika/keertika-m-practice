package hw_april5th_NC;

public class CustomerName {
    String firstName;
    String middleName;
    String lastName;

    // Constructor
    public CustomerName(String fName, String middleName,
                        String lName) {
        this.firstName = fName;
        this.middleName = middleName;
        this.lastName = lName;
    }
    //getting fullname
    public String customerFullName() {
       return (firstName+" " +middleName+" "+lastName);
    }
}
