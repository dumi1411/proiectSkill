package org.example.liste;

import java.util.ArrayList;

public class Liste {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[1]= "Ana are mere";


        ArrayList<String>list= new ArrayList<>();
        list.add("Ana are mere");
        list.add("Ana are pere");
        list.add("Ana are banane");
        list.add("Ana are afine");
        System.out.println(list.get(0));
       // System.out.println(liste.get(0));
        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
