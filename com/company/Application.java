package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Application implements CSV{

    private static ArrayList<Users> users = new ArrayList<>();

    public static ArrayList<Users> getUsers() {
        return users;}
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            users.add(new Developer("Developer" + i, (int) (Math.random() * 100), (short) (i + 10)));
        }
        for (int i = 0; i < 4; i++) {
            users.add(new Manager("Manager" + i, (int) (Math.random() * 100), (short) (i + 10)));
        }
        Sale s1 = new Sale("CoffeeMachine", 50000);
        Sale s2 = new Sale("Blender", 2000);
        Sale s3 = new Sale("Kettle", 1000);

        ((Developer) (users.get(0))).addLang("C", "Java", "C++");
        ((Developer) (users.get(1))).addLang("C#", "Python", "HTML");
        ((Developer) (users.get(2))).addLang("LISP", "Java", "Assembler");
        ((Developer) (users.get(3))).addLang("Shakespeare", "Brainfck", "C++");


        ((Manager) (users.get(4))).addSale(s1);
        ((Manager) (users.get(5))).addSale(s1);
        ((Manager) (users.get(5))).addSale(s3);
        ((Manager) (users.get(6))).addSale(s1);
        ((Manager) (users.get(6))).addSale(s2);
        ((Manager) (users.get(7))).addSale(s3);

    CSV.writeToCSVFile();
    CSV.readToCSVFileToConsole();
    }

}