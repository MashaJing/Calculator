package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
    ArrayList Mass = new ArrayList();
    for (int i=0; i<1000000; i++)
        Mass.add(i);
    System.out.println(Mass.size());
    Mass.add(19);
    System.out.println(Mass.size());

    }
}
