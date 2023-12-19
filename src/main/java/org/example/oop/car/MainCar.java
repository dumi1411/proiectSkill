package org.example.oop.car;

public class MainCar {
    public static void main(String[] args) {
        Car car1= new Car("Natasha");
        Car car2= new Car("Anton", "Albastra");
        Car car3= new Car();
        Car car4= new Car("Marius", "Roz", "BMW");
        System.out.println("Numele este: "+ car4.getNume() + " Culoarea este: "+ car4.getCuloare()+" Marca este: " + car4.getMarca());
        System.out.println(car4);
        SportsCar sportsCar = new SportsCar("Adrian","Mov", "BMW");
        System.out.println(sportsCar);
    }


}
