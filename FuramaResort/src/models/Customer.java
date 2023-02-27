package models;

public class Customer extends Person {
    private String customerCode;
    private String customerType;
    private String customerAddress;
    private final String[] customerTypeArray = {"Diamond", "Platinum", "Gold", "Silver", "Member"};

    public Customer() {

    }

    public Customer(String customerCode, String customerType, String customerAddress) {
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public Customer(String personName, int personAge, int dayOfBirth, String sex, String personTelephone, String customerCode, String customerType, String customerAddress) {
        super(personName, personAge, dayOfBirth, sex, personTelephone);
        this.customerCode = customerCode;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String[] getCustomerTypeArray() {
        return customerTypeArray;
    }

    @Override
    public String toString() {
        return "Customer Code : " + customerCode
                + "Customer Type :" + customerType
                + "Customer Address :" + customerAddress;
    }
}
