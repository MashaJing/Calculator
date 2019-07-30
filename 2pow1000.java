package com.company;
import java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
	BigInteger a = new BigInteger("2");
	BigInteger b = new BigInteger("2");
	for (int i=0; i<998; i++)
    a = a.multiply(b);
    System.out.println(a);
    }
}

