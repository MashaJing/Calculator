package com.company;

public abstract class Dev extends Users  {
    public String lang = "Pythava";
    public Dev (String name, String mail, int num) {
        super(name, mail, num);
        this.lang = lang;
    }
}
