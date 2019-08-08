package com.company;
import com.fasterxml.jackson.annotation.JsonProperty;

    public abstract class Users implements JSON {

    public String name = "Default";
    public int number = 10000;
    public int id = 0000;

        public Users() {
        }

        public void SetName (String name){
            this.name = name;
        }

        public void SetNumber (int number){
            this.number = number;
        }

        public int GetId () {
            return id;
        }

        public String GetName () {
            return name;
        }

        public int number () {
            return number;
        }

    }
