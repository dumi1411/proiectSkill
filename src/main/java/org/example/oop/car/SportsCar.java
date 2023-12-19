package org.example.oop.car;

public class SportsCar extends Car{
    public SportsCar(String nume, String culoare, String marca){
        super (nume,culoare,marca);
    }


    public void printDetails(String option1, String option2, String option3){
        System.out.println("SUPRASCRIS: Numele masinii, culoarea si marca sunt: "+ getNume() + " "+ getCuloare()+ " "+ getMarca());
super.printDetails("","","");
    }

    @Override
    public String toString() {
        return "SUPRASCRIS: Numele masinii, culoarea si marca sunt: "+ getNume() + " "+ getCuloare()+ " "+ getMarca();
    }
}
