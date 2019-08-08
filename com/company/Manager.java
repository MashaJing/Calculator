package com.company;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Manager extends Users {
    ArrayList<Sale> sales;

    public Manager(String name, int number, Short id) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.sales = new ArrayList<>();
    }

    public Manager(@JsonProperty(value = "name")String name, @JsonProperty(value = "number") int number,
                   @JsonProperty(value = "id") Short id, @JsonProperty(value = "sales") ArrayList<Sale> sales) {
        this.name = name;
        this.number = number;
        this.id = id;
        this.sales = sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }

    public ArrayList<String> getSales() {
        ArrayList<String> temp = new ArrayList<>();

        for (Sale i : sales) {
            temp.add(i.SalesName + " Price: " + i.SalesPrice);
        }

        return temp;
    }

    public void addSale(Sale sale) {
        sales.add(sale);
    }

    public void removeSale(Sale sale) {
        sales.remove(sale);
    }

    @Override
    public void WriteToFile() {

    }

    @Override
    public ArrayList<Users> ReadToFile() {
        return null;
    }
}
