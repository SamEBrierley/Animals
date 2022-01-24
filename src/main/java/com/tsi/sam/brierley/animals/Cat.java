package com.tsi.sam.brierley.animals;

public class Cat extends Mammal{
    /////////////////////////Attributes//////////////////////////////////
    private String name;
    private String catType;
    //private int weight;
    //private int age;





    //////////////////////////////Constructors/////////////////////////
    public Cat(){
        name = "Elsie";
        catType = "Siamese";
        setWeight(1000);
        setAge(5);
    }




    //////////////////////////Methods////////////////////////////
    public String breathe(){
        return "I am Breathing";
    }

}
