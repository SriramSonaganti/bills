package com.example.bills.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "bills")
public class Bills {

    @Id
    private String id;


    String number;

    private String billed_date;

    private String billed_to;

    private int price;

    private int tax;

    private int amount;

    private String due;

    public Bills() {

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }



    public String getBilled_date() {
        return billed_date;
    }

    public void setBilled_date(String billed_date) {
        this.billed_date = billed_date;
    }

    public String getBilled_to() {
        return billed_to;
    }

    public void setBilled_to(String billed_to) {
        this.billed_to = billed_to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }
}
