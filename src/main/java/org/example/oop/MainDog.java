package org.example.oop;

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Azorel", 7,"Pomeranian");
        Dog dog2 = new Dog("Rex",2,"Dalmatian");
        Dog dog3= new Dog();
        Dog dog4= null;

        //dog1.setName("Azorel");
        System.out.println(dog1.getName());

        //dog1.setAge(12);
        System.out.println(dog1.getAge());

        //dog1.setBreed("Bulldog");
        dog1.setSleeping(true);
        System.out.println(dog1.isSleeping());

    }
}
