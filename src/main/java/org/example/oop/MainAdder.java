package org.example.oop;

import java.sql.SQLOutput;

//overloading
public class MainAdder {
    public static void main(String[] args) {
        Adder adder = new Adder();
        int result = adder.add(1,2,98);
        String resultString= adder.add("1","2");
        System.out.println("Suma este: " + result);
        System.out.println("Suma este: " + resultString);
        Double resultDouble= adder.add("1",2.3);
        System.out.println("Suma este: " + resultDouble);
    }
}
