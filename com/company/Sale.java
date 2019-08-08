package com.company;

public class Sale {
    String SalesName;
    int SalesPrice;

    public Sale(String name, int price) {
        SalesName = name;
        SalesPrice = price;
    }

    public void SetItemPrice (int price) {
        this.SalesPrice = price;
    }

    public void SetItemName (String name) {
        this.SalesName = name;
    }

}
