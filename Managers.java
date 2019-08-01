package com.company;
import java.util.ArrayList;

public abstract class Managers extends Users  {
    ArrayList Sales = new ArrayList();
    public Managers (String name, String mail, int num, ArrayList Sales)
    {
        super(name, mail, num);
        this.Sales = Sales;
    }


}
