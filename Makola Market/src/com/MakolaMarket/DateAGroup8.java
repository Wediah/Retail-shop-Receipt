package com.MakolaMarket;

public class DateAGroup8 {
    String orderMonth, orderDay, orderYear;



    public void setOrderDay(String orderDay) {
        this.orderDay = orderDay;
    }
    public String getOrderDay() {
        return orderDay;
    }
    public void setOrderMonth(String orderMonth) {
        this.orderMonth = orderMonth;
    }
    public String getOrderMonth() {
        return orderMonth;
    }
    public void setOrderYear(String orderYear) {
        this.orderYear = orderYear;
    }
    public String getOrderYear() {
        return orderYear;
    }
    void calender() {
        System.out.println("Enter order date: " + this.orderMonth+"/"+this.orderDay+"/"+this.orderYear);
    }
}
