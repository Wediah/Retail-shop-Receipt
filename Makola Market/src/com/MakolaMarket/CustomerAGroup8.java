package com.MakolaMarket;

public class CustomerAGroup8 {
    String customerName, customerMobileNumber;



    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerMobileNumber(String customerMobileNumber) {
        this.customerMobileNumber = customerMobileNumber;
    }
    public String getCustomerMobileNumber() {
        return customerMobileNumber;
    }
    void display() {
        System.out.println("Customer Name: "+ this.customerName);
        System.out.println("Customer Name: " + this.customerMobileNumber);
    }

}
