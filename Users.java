package com.company;
import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class Users implements JSON {
    public String name = "Default";
    public String mail = "Default@mail.ru";
    public int id = 0000;

    public Users(String name, String mail, int id) {
        String n = name;
        String m = mail;
        int no = id;
        }

    }

